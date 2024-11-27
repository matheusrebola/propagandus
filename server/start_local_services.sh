#!/bin/bash

# Lista de serviços
services=(
  "advertising-service"
  "attention-register-service"
  "data-persistence-service"
  "people-register-service"
  "reaction-register-service"
  "sender-service"
)

# Caminho do diretório raiz
base_dir=$(pwd)

# Função para iniciar um serviço
start_service() {
  service=$1
  echo "Iniciando o serviço: $service"
  
  # Navegar para o diretório do serviço
  cd "$base_dir/$service" || { echo "Falha ao acessar o diretório $service"; exit 1; }
  
  # Instalar dependências
  npm install
  
  # Compilar TypeScript
  npm run build
  
  # Iniciar o serviço
  npm run start &
  
  echo "$service iniciado com sucesso!"
}

# Iterar pelos serviços e iniciar cada um
for service in "${services[@]}"; do
  start_service "$service"
done

# Voltar ao diretório original
cd "$base_dir"

echo "Todos os serviços foram iniciados!"
