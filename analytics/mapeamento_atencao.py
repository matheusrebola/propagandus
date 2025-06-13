import psycopg2

# Dados de conexão com base no seu docker-compose
conn = psycopg2.connect(
    host="localhost",  # ou "127.0.0.1"
    port=5432,
    database="propagandus",
    user="postgres",
    password="postgres"
)

# Teste de consulta
with conn.cursor() as cur:
    cur.execute("SELECT version();")
    versao = cur.fetchone()
    print("Versão do PostgreSQL:", versao)

with conn.cursor() as cur:
    cur.execute("SELECT id, nome, idade FROM pessoas")
    resultados = cur.fetchall()
    for linha in resultados:
        print(f"ID: {linha[0]}, Nome: {linha[1]}, Idade: {linha[2]}")

conn.close()
