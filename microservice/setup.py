import os
import subprocess

def build_and_run_docker():
    # Primeiro, construa os serviços
    print("Construindo os serviços Docker...")
    subprocess.run(["docker-compose", "build"], check=True)

    # Em seguida, inicie os serviços
    print("Iniciando os serviços Docker...")
    subprocess.run(["docker-compose", "up"], check=True)

if __name__ == "__main__":
    # Altere o diretório de trabalho para o diretório atual
    os.chdir(os.path.dirname(os.path.abspath(__file__)))

    # Execute a função para construir e rodar os serviços
    build_and_run_docker()
