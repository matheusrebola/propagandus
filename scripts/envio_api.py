import mysql.connector
import requests
import datetime

# Configurações do banco de dados
db_config = {
    'user': 'seu_usuario',
    'password': 'sua_senha',
    'host': 'localhost',
    'database': 'seu_banco'
}

# Conexão ao banco de dados MySQL
conn = mysql.connector.connect(**db_config)
cursor = conn.cursor()

# Obtendo dados do último dia
yesterday = datetime.date.today() - datetime.timedelta(days=1)
query = "SELECT * FROM sua_tabela WHERE data_recebimento = %s"
cursor.execute(query, (yesterday,))

# Coletando dados
rows = cursor.fetchall()
dados_para_enviar = []
for row in rows:
    # Ajustar conforme sua estrutura de dados
    dados_para_enviar.append({
        'id': row[0],
        'dado': row[1],
        'data': str(row[2])
    })

# Enviando dados para a API na AWS
url_api = "https://sua-api-aws-endpoint"
response = requests.post(url_api, json=dados_para_enviar)

if response.status_code == 200:
    print("Dados enviados com sucesso!")
else:
    print(f"Erro ao enviar dados: {response.status_code}")

# Fechando conexão com o banco
cursor.close()
conn.close()
