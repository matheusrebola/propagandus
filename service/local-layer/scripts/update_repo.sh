#!/bin/bash

# Diretório onde o repositório será armazenado/clonado
REPO_DIR="/caminho/para/seu/repositorio/propagandus"

# URL do repositório
REPO_URL="https://github.com/matheusrebola/propagandus.git"

# Caminho para o subdiretório de interesse
SUBDIR="service/local-layer"

# Horário atual para logs
CURRENT_TIME=$(date "+%Y-%m-%d %H:%M:%S")

# Criar o diretório base se não existir
if [ ! -d "$REPO_DIR" ]; then
  echo "[$CURRENT_TIME] Diretório não encontrado. Clonando o repositório..."
  git clone "$REPO_URL" "$REPO_DIR"
else
  echo "[$CURRENT_TIME] Diretório encontrado. Verificando atualizações..."
  cd "$REPO_DIR" || exit 1
  git pull
fi

# Verificar se o subdiretório existe após o pull/clonagem
if [ -d "$REPO_DIR/$SUBDIR" ]; then
  echo "[$CURRENT_TIME] Subdiretório '$SUBDIR' atualizado com sucesso."
else
  echo "[$CURRENT_TIME] Subdiretório '$SUBDIR' não encontrado. Verifique o repositório."
fi
