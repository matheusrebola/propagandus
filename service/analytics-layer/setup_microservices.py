import subprocess
import os
import time
import mysql.connector
from mysql.connector import Error

def run_sql_script():
    """
    Executa o script SQL entities_creation.sql no banco de dados MariaDB.
    """
    print("Executando o script SQL no banco de dados...")
    
    # Configurações de conexão com o banco de dados
    db_config = {
        'host': 'localhost',  
        'port': 43350,       
        'user': 'propagandus',
        'password': 'propagandus',
        'database': 'data-analytics'
    }

    # Caminho para o arquivo SQL
    sql_file_path = os.path.join(os.getcwd(), 'entities_creation.sql')

    try:
        # Conectar ao banco de dados
        connection = mysql.connector.connect(**db_config)
        if connection.is_connected():
            print("Conexão com o banco de dados estabelecida com sucesso!")

            # Ler o script SQL
            with open(sql_file_path, 'r') as file:
                sql_script = file.read()

            # Executar o script SQL
            cursor = connection.cursor()
            for statement in sql_script.split(';'):
                statement = statement.strip()
                if statement:  # Ignorar comandos vazios
                    cursor.execute(statement)

            connection.commit()
            print("Script SQL executado com sucesso!")

    except Error as e:
        print(f"Erro ao executar o script SQL: {e}")

    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()
            print("Conexão com o banco de dados encerrada.")

def run_docker_compose():
    """
    Executa o docker-compose para levantar os containers configurados.
    """
    try:
        print("Iniciando os serviços Docker com docker-compose...")
        subprocess.run(["docker-compose", "up", "--build", "-d"], check=True)
        print("Docker Compose executado com sucesso!")
    except subprocess.CalledProcessError as e:
        print(f"Erro ao executar o Docker Compose: {e}")
        exit(1)

def build_java_services(services):
    """
    Compila os microserviços Java usando Maven e gera os JARs.
    """
    for service in services:
        print(f"Compilando o microserviço: {service}...")
        service_path = os.path.join(os.getcwd(), service)
        try:
            subprocess.run(["mvn", "clean", "package"], cwd=service_path, check=True)
            print(f"{service} compilado com sucesso!")
        except subprocess.CalledProcessError as e:
            print(f"Erro ao compilar {service}: {e}")
            exit(1)

def run_java_containers(services):
    """
    Inicia os containers dos microserviços Java criados com Dockerfile.
    """
    for service in services:
        print(f"Iniciando o container para o serviço: {service}...")
        service_path = os.path.join(os.getcwd(), service)
        try:
            subprocess.run(["docker", "build", "-t", service.lower(), "."], cwd=service_path, check=True)
            subprocess.run(["docker", "run", "-d", "--name", service.lower(), service.lower()], check=True)
            print(f"Container do serviço {service} iniciado com sucesso!")
        except subprocess.CalledProcessError as e:
            print(f"Erro ao iniciar o container do serviço {service}: {e}")
            exit(1)

def main():
    """
    Função principal para executar todo o fluxo.
    """
    # Lista dos microserviços Java
    java_services = [
        "advertising-service",
        "attention-service",
        "location-service",
        "painel-service",
        "period-register-service",
        "reaction-service"
    ]

    print("==== INICIANDO A CONFIGURAÇÃO DO AMBIENTE ====")

    # Etapa 1: Executar o Docker Compose para dependências
    run_docker_compose()

    # Aguardar um tempo para os bancos de dados subirem
    print("Aguardando inicialização dos serviços de banco de dados...")
    time.sleep(15)

    # Etapa 2: Executar o script SQL
    run_sql_script()
    
    # Etapa 3: Compilar os serviços Java
    build_java_services(java_services)

    # Etapa 4: Construir e rodar os containers Java
    run_java_containers(java_services)

    print("==== AMBIENTE CONFIGURADO COM SUCESSO ====")

if __name__ == "__main__":
    main()
