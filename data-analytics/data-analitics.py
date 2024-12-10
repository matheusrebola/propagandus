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

# Lista de arquivos CSV
csv_files = [
    "advertising_table.csv",
    "attention_table.csv",
    "location_table.csv",
    "painel_table.csv",
    "data_time.csv",
    "reaction_table.csv",
]

def load_csv_to_all_databases(csv_file, table_name):
    """Carrega os dados de um arquivo CSV em todas as bases de dados."""
    print(f"Lendo o arquivo {csv_file}...")
    data = pd.read_csv(csv_file)

    for db_key, db_config in databases.items():
        try:
            # Conecta ao banco de dados
            db_url = db_config["url"]
            print(f"Conectando ao banco: {db_key}, inserindo na tabela: {table_name}...")
            engine = create_engine(db_url)

            # Insere os dados na tabela
            print(f"Inserindo dados na tabela {table_name} do banco {db_key}...")
            data.to_sql(table_name, engine, if_exists="replace", index=False)
            print(f"Dados do arquivo {csv_file} carregados com sucesso na tabela {table_name} do banco {db_key}.")
        except Exception as e:
            print(f"Erro ao processar {csv_file} no banco {db_key}: {e}")

def main():
    # Processa cada arquivo CSV
    for csv_file in csv_files:
        # Remove a extensão .csv para usar como nome da tabela
        table_name = csv_file.split(".csv")[0]
        # Carrega os dados em todos os bancos
        load_csv_to_all_databases(csv_file, table_name)

if __name__ == "__main__":
    main()