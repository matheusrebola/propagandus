import subprocess
import os
import time

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
        "data-persistence-service",
        "register-service",
        "sender-service"
    ]

    print("==== INICIANDO A CONFIGURAÇÃO DO AMBIENTE ====")

    # Etapa 1: Executar o Docker Compose para dependências
    run_docker_compose()

    # Aguardar um tempo para os bancos de dados subirem
    print("Aguardando inicialização dos serviços de banco de dados...")
    time.sleep(15)

    # Etapa 2: Compilar os serviços Java
    build_java_services(java_services)

    # Etapa 3: Construir e rodar os containers Java
    run_java_containers(java_services)

    print("==== AMBIENTE CONFIGURADO COM SUCESSO ====")

if __name__ == "__main__":
    main()