import pymysql

# Configurações do Banco de Origem
source_db = {
    'host': 'localhost:53300',
    'user': 'propagandus',
    'password': 'propagandus',
    'database': 'data-lake'
}

# Configurações dos Bancos de Destino
destinations = {
    'analytics-service': {
        'db_config': {
            'host': 'localhost:43350',
            'user': 'propagandus',
            'password': 'propagandus',
            'database': 'data-analytics'
        },
        'tables': ['attention_table','painel_table','reaction_table', 'date_time_table', 'advertising_table', 'location_table']
    }
}

def process_log_entry(source_conn, destination_conns, log_entry):
    try:
        table_name = log_entry['table_name']
        action = log_entry['action']
        primary_key_value = log_entry['primary_key_value']

        # Buscar os dados da tabela original
        with source_conn.cursor() as cursor:
            cursor.execute(f"SELECT * FROM {table_name} WHERE id = %s", (primary_key_value,))
            row = cursor.fetchone()

        if not row:
            print(f"Registro não encontrado na tabela {table_name} com ID {primary_key_value}")
            return

        # Atualizar os bancos de destino que usam essa tabela
        for service, config in destinations.items():
            if table_name in config['tables']:
                dest_conn = destination_conns[service]
                with dest_conn.cursor() as cursor:
                    # Preparar os dados para inserção/atualização
                    columns = ", ".join(row.keys())
                    placeholders = ", ".join(["%s"] * len(row))
                    sql = f"""
                        INSERT INTO {table_name} ({columns})
                        VALUES ({placeholders})
                        ON DUPLICATE KEY UPDATE {", ".join([f"{col}=VALUES({col})" for col in row.keys()])}
                    """
                    cursor.execute(sql, tuple(row.values()))
                dest_conn.commit()
                print(f"{action} processado para {table_name} no {service}")

    except Exception as e:
        print(f"Erro ao processar log: {e}")

def migrate_from_log():
    try:
        # Conectar ao banco de origem
        source_conn = pymysql.connect(**source_db)

        # Conectar aos bancos de destino
        destination_conns = {
            service: pymysql.connect(**config['db_config'])
            for service, config in destinations.items()
        }

        # Processar a tabela de log
        with source_conn.cursor(pymysql.cursors.DictCursor) as cursor:
            cursor.execute("SELECT * FROM change_log WHERE processed = 0")
            logs = cursor.fetchall()

            for log_entry in logs:
                process_log_entry(source_conn, destination_conns, log_entry)
                # Marcar o log como processado
                cursor.execute("UPDATE change_log SET processed = 1 WHERE id = %s", (log_entry['id'],))
            source_conn.commit()

        # Fechar conexões
        for conn in destination_conns.values():
            conn.close()
        source_conn.close()

        print("Migração concluída com sucesso!")

    except Exception as e:
        print(f"Erro durante a migração: {e}")

if __name__ == "__main__":
    migrate_from_log()
