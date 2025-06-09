import subprocess
import os
import threading

# Caminhos relativos aos serviços Spring
services = [
    ("local-service", "propagandus.localservice"),
    ("persistence-service", "propagandus.persistenceservice")
]

def run_service(path):
    print(f"Iniciando serviço em: {path}")
    try:
        subprocess.run(["./mvnw", "spring-boot:run"], cwd=path, check=True)
    except subprocess.CalledProcessError as e:
        print(f"Erro ao iniciar serviço em {path}: {e}")

def run_docker(path):
    print(f"Iniciando containers em: {path}")
    try:
        print(f"Limpando volumes e containers: {path}")
        subprocess.run(["docker-compose", "down", "-v"], cwd=path, check=True)
        print(f"Recriando containers: {path}")
        subprocess.run(["docker-compose", "up", "-d"], cwd=path, check=True)
    except subprocess.CalledProcessError as e:
        print(f"Erro ao iniciar containers em {path}: {e}")

def main():
    project_root = os.path.abspath(".")  # Diretório onde está o docker-compose.yml

    # Inicia Docker em uma thread separada
    docker_thread = threading.Thread(target=run_docker, args=(project_root,))
    docker_thread.start()
    docker_thread.join()  # Espera o Docker subir antes de iniciar os serviços

    # Inicia serviços Spring Boot
    threads = []
    for service_dir, _ in services:
        full_path = os.path.abspath(service_dir)
        t = threading.Thread(target=run_service, args=(full_path,))
        t.start()
        threads.append(t)

    for t in threads:
        t.join()

if __name__ == "__main__":
    main()
