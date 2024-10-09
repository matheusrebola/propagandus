#!/bin/bash

# Definindo variáveis
DB_USER="seu_usuario"
DB_PASS="sua_senha"
DB_NAME="seu_banco"
TABLE_NAME="sua_tabela"
LOG_FILE="/var/log/db_cleanup.log"

# Comando para deletar registros antigos (mais de 30 dias, por exemplo)
SQL="DELETE FROM $TABLE_NAME WHERE data < NOW() - INTERVAL 30 DAY;"

# Executando a limpeza e registrando no log
mysql -u$DB_USER -p$DB_PASS -e "$SQL" $DB_NAME
if [ $? -eq 0 ]; then
    echo "$(date): Limpeza do banco de dados realizada com sucesso" >> $LOG_FILE
else
    echo "$(date): Erro na limpeza do banco de dados" >> $LOG_FILE
fi
