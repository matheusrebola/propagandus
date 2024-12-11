import pymysql
import csv

# Configurações de conexão com o MariaDB
DB_CONFIG = {
    "host": "localhost",
    "port": 53300,
    "user": "propagandus",
    "password": "propagandus",
    "database": "data-lake"
}

# Mapear arquivos .csv para as respectivas tabelas e colunas
CSV_FILES = {
    "package_type": {
        "file": "package_type.csv",
        "query": "INSERT INTO package_type_table (package_type_id, package_type) VALUES (%s, %s)"
    },
    "location": {
        "file": "location.csv",
        "query": "INSERT INTO location_table (location_id, zip_code, public_place, street_number, location_type, city, district, country) VALUES (%s, %s, %s, %s, %s, %s, %s, %s)"
    },
    "painel": {
        "file": "painel.csv",
        "query": "INSERT INTO painel_table (painel_id, identification, painel_status, model, location_id, package_type_id) VALUES (%s, %s, %s, %s, %s, %s)"
    },
    "advertising": {
        "file": "advertising.csv",
        "query": "INSERT INTO advertising_table (advertising_id, advertising_name, advertising_version, company, product, painel_id) VALUES (%s, %s, %s, %s, %s, %s)"
    },
    "period_register": {
        "file": "date_time.csv",
        "query": "INSERT INTO date_time_table (period_register_id, day, day_week, hour, minute, period_of_the_day, month, year, register_time, advertising_id) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"
    },
    "attention": {
        "file": "attention.csv",
        "query": "INSERT INTO attention_table (attention_id, attention, attention_level, look_count, people_count, attention_time_id, painel_id) VALUES (%s, %s, %s, %s, %s, %s, %s)"
    },
    "reaction": {
        "file": "reaction.csv",
        "query": "INSERT INTO reaction_table (reaction_id, reaction_type, period_time_id, advertising_id, location_id, painel_id) VALUES (%s, %s, %s, %s, %s, %s)"
    }
}

def load_csv_to_db():
    try:
        # Conexão com o banco de dados
        connection = pymysql.connect(**DB_CONFIG)
        cursor = connection.cursor()

        for table, details in CSV_FILES.items():
            file_path = details["file"]
            query = details["query"]

            print(f"Carregando dados para a tabela {table} a partir de {file_path}...")

            with open(file_path, "r") as file:
                csv_reader = csv.reader(file)
                next(csv_reader)  # Ignorar o cabeçalho

                for row in csv_reader:
                    cursor.execute(query, row)

            connection.commit()
            print(f"Dados inseridos na tabela {table} com sucesso.")

    except pymysql.MySQLError as e:
        print(f"Erro ao carregar os dados: {e}")
    finally:
        if connection:
            connection.close()

if __name__ == "__main__":
    load_csv_to_db()
