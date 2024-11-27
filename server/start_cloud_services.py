import os
import subprocess

# Lista de serviços
services = [
    "advertising-service",
    "attention-register-service",
    "data-persistence-service",
    "people-register-service",
    "reaction-register-service",
    "sender-service"
]

# Diretório base
base_dir = os.getcwd()

def start_service(service):
    print(f"Iniciando o serviço: {service}")
    service_path = os.path.join(base_dir, service)
    
    try:
        # Navegar para o diretório do serviço
        os.chdir(service_path)
        
        # Instalar dependências
        subprocess.run(["npm", "install"], check=True)
        
        # Compilar TypeScript
        subprocess.run(["npm", "run", "build"], check=True)
        
        # Iniciar o serviço
        subprocess.Popen(["npm", "run", "start"])
        
        print(f"{service} iniciado com sucesso!")
    except Exception as e:
        print(f"Erro ao iniciar {service}: {e}")
    finally:
        # Voltar para o diretório base
        os.chdir(base_dir)

# Iterar pelos serviços e iniciar cada um
for service in services:
    start_service(service)

print("Todos os serviços foram iniciados!")
