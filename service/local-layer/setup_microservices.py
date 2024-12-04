import os
import subprocess

def check_dependency(command, name):
    """Verifica se uma dependência está instalada."""
    try:
        subprocess.run(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, check=True)
    except subprocess.CalledProcessError:
        print(f"Erro: {name} não está instalado. Instale antes de continuar.")
        exit(1)

def start_docker_compose():
    """Sobe os containers do Docker Compose."""
    print("Iniciando os containers com Docker Compose...")
    subprocess.run(["docker-compose", "up", "-d"], check=True)
    print("Containers iniciados com sucesso!")

def start_microservices():
    """Inicializa os microserviços."""
    microservices = [
        "./people-register-service",
        "./attention-register-service",
        "./reaction-register-service",
        "./data-persistence-service",
        "./sender-service",
        "./advertising-service",
    ]

    print("Iniciando os microserviços locais...")

    for service in microservices:
        print(f"Iniciando o microserviço: {service}")
        os.chdir(service)
        subprocess.run(["npm", "install"], check=True)
        subprocess.Popen(["npm", "start"])  # Executa em background
        os.chdir("..")

    print("Todos os microserviços foram inicializados com sucesso!")

if __name__ == "__main__":
    # Verifica dependências
    check_dependency(["docker", "--version"], "Docker")
    check_dependency(["docker-compose", "--version"], "Docker Compose")
    check_dependency(["npm", "--version"], "npm")

    # Sobe os containers e microserviços
    start_docker_compose()
    start_microservices()
