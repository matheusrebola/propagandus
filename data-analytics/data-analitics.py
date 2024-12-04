from sqlalchemy import create_engine
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Configure a conexão com o banco de dados MySQL
user = "propagandus"
password = "propagandus2@"
host = "localhost"  # Ou IP do servidor
port = "53300"      # Porta que você configurou no docker-compose
database = "data_analitics"

# Crie a engine para conexão
engine = create_engine(f"mysql+pymysql://{user}:{password}@{host}:{port}/{database}")

# Garantir que todos os DataFrames foram carregados corretamente
reaction_df = pd.read_sql("SELECT * FROM reaction", engine)
advertising_df = pd.read_sql("SELECT * FROM advertising", engine)
location_df = pd.read_sql("SELECT * FROM location", engine)
attention_df = pd.read_sql("SELECT * FROM attention", engine)
painel_df = pd.read_sql("SELECT * FROM painel", engine)

# Verificar as colunas de cada tabela para garantir compatibilidade
print("Reaction:", reaction_df.columns)
print("Advertising:", advertising_df.columns)
print("Location:", location_df.columns)
print("Attention:", attention_df.columns)
print("Painel:", painel_df.columns)

# Unindo os DataFrames para facilitar as análises
# Juntando Reaction com Advertising
data = pd.merge(reaction_df, advertising_df, on='advertising_id', how='inner')

# Juntando o resultado com Location
data = pd.merge(data, location_df, on='location_id', how='inner')

# Juntando o resultado com Painel (caso seja necessário verificar outra chave)
data = pd.merge(data, painel_df, on='location_id', how='inner')

# Juntando o resultado com Attention
data = pd.merge(data, attention_df, on='attention_id', how='inner')

# Adicionar checagem para colunas necessárias antes da análise
required_columns = [
    'product_name', 'advertising_version', 'attention_level',
    'city_zone', 'painel_model', 'look_count', 'people_count', 'company_name'
]
missing_columns = [col for col in required_columns if col not in data.columns]
if missing_columns:
    raise ValueError(f"As colunas necessárias estão ausentes: {missing_columns}")

# Análise de Eficácia dos Anúncios
eficacia_anuncios = data.groupby(['product_name', 'advertising_version'])['attention_level'].mean().reset_index()

# Visualizando a eficácia dos anúncios
plt.figure(figsize=(14, 7))
sns.barplot(x='product_name', y='attention_level', hue='advertising_version', data=eficacia_anuncios)
plt.xticks(rotation=45)
plt.title('Nível Médio de Atenção por Tipo e Versão de Anúncio')
plt.xlabel('Tipo de Produto')
plt.ylabel('Nível Médio de Atenção')
plt.tight_layout()
plt.show()

# Análise de Desempenho por Localização
desempenho_local = data.groupby('city_zone')['attention_level'].mean().reset_index()

# Visualizando o desempenho por localização
plt.figure(figsize=(10, 6))
sns.barplot(x='city_zone', y='attention_level', data=desempenho_local, palette='viridis')
plt.xticks(rotation=45)
plt.title('Nível Médio de Atenção por Zona da Cidade')
plt.xlabel('Zona da Cidade')
plt.ylabel('Nível Médio de Atenção')
plt.tight_layout()
plt.show()

# Análise de Desempenho dos Painéis
desempenho_paineis = data.groupby('painel_model')['attention_level'].mean().reset_index()

# Visualizando o desempenho dos painéis
plt.figure(figsize=(10, 6))
sns.barplot(x='painel_model', y='attention_level', data=desempenho_paineis, palette='coolwarm')
plt.title('Nível Médio de Atenção por Modelo de Painel')
plt.xlabel('Modelo de Painel')
plt.ylabel('Nível Médio de Atenção')
plt.tight_layout()
plt.show()

# Calculando o percentual de engajamento (Evitar divisão por zero)
data['engagement_rate'] = data.apply(
    lambda row: (row['look_count'] / row['people_count']) * 100 if row['people_count'] > 0 else 0, axis=1
)

# Visualizando o engajamento do público
plt.figure(figsize=(12, 6))
sns.histplot(data['engagement_rate'], bins=20, kde=True)
plt.title('Distribuição da Taxa de Engajamento do Público')
plt.xlabel('Taxa de Engajamento (%)')
plt.ylabel('Frequência')
plt.tight_layout()
plt.show()

# Análise por empresa
segmentacao_audiencia = data.groupby('company_name')['engagement_rate'].mean().reset_index()

# Visualizando a segmentação de audiência
plt.figure(figsize=(14, 7))
sns.barplot(x='company_name', y='engagement_rate', data=segmentacao_audiencia, palette='plasma')
plt.xticks(rotation=45)
plt.title('Taxa Média de Engajamento por Empresa')
plt.xlabel('Nome da Empresa')
plt.ylabel('Taxa Média de Engajamento (%)')
plt.tight_layout()
plt.show()