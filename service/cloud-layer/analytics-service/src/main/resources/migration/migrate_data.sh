#!/bin/bash

# Caminho do Python
PYTHON_PATH="/usr/bin/python3"

# Caminho do script Python
SCRIPT_PATH="/caminho/para/seu/script/migrate_script.py"

# Verifica se o Python está instalado
if ! command -v $PYTHON_PATH &> /dev/null
then
    echo "Python não encontrado no caminho especificado: $PYTHON_PATH"
    exit 1
fi

# Executa o script Python
$PYTHON_PATH $SCRIPT_PATH

# Verifica o status da execução
if [ $? -eq 0 ]; then
    echo "Migração concluída com sucesso às $(date)" >> /var/log/migration.log
else
    echo "Erro na migração às $(date)" >> /var/log/migration.log
fi
