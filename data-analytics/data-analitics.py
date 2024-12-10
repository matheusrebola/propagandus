import pandas as pd
from sqlalchemy import create_engine

# Configuração dos bancos de dados
databases = {
    "analytics": {
        "url": "mysql+pymysql://propagandus:propagandus@localhost:43350/data-analytics"
    },
    "lake": {
        "url": "mysql+pymysql://propagandus:propagandus@localhost:53300/data-lake"
    },
    "backup": {
        "url": "mysql+pymysql://propagandus:propagandus@localhost:53301/data-backup"
    },
    "persistence": {
        "url": "mysql+pymysql://propagandus:propagandus@localhost:63310/data-persistence-service"
    }
}

# Mapeamento dos arquivos CSV para os bancos e tabelas
csv_to_db_mapping = {
    "advertising_table.csv": ("analytics", "advertising"),
    "attention_table.csv": ("lake", "attention"),
    "location_table.csv": ("backup", "location"),
    "painel_table.csv": ("persistence", "painel"),
    "data_time.csv": ("lake", "data_time"),
    "reaction_table.csv": ("analytics", "reaction"),
}

def load_csv_to_db(csv_file, db_key, table_name):
    """Carrega os dados de um arquivo CSV para o banco especificado."""
    # Lê o CSV
    print(f"Lendo o arquivo {csv_file}...")
    data = pd.read_csv(csv_file)

    # Conecta ao banco de dados
    db_url = databases[db_key]["url"]
    print(f"Conectando ao banco: {db_key} na tabela: {table_name}...")
    engine = create_engine(db_url)

    # Insere os dados no banco
    print(f"Inserindo dados na tabela {table_name}...")
    data.to_sql(table_name, engine, if_exists="replace", index=False)
    print(f"Dados do arquivo {csv_file} carregados com sucesso na tabela {table_name} do banco {db_key}.")

def main():
    # Itera sobre os arquivos e faz o upload
    for csv_file, (db_key, table_name) in csv_to_db_mapping.items():
        try:
            load_csv_to_db(csv_file, db_key, table_name)
        except Exception as e:
            print(f"Erro ao processar {csv_file}: {e}")

if __name__ == "__main__":
    main()
