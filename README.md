# Projeto de Microserviços para Análise de Reações e Interações em Tempo Real

Este projeto foi desenvolvido para gerenciar e analisar interações de usuários com painéis de propaganda digitais em locais públicos. A arquitetura foi projetada para capturar, normalizar e persistir dados sobre reações do usuário em tempo real, integrando dados de localização, propaganda e reação. Além disso, o sistema possui camadas de validação de dados, persistência e backup que garantem a integridade e a escalabilidade das informações.

## Arquitetura e Funcionalidades

- **Microserviços Locais**: Microserviços locais, implementados em TypeScript, gerenciam a coleta de dados de `Location`, `Advertising` e `Reaction`, processando as interações dos usuários e armazenando apenas as reações com relevância em bancos de dados NoSQL (MongoDB).
- **Data Integrity Service**: Normaliza e valida a consistência dos dados capturados, iniciando uma Saga Coreografada para garantir que nenhum dado seja perdido ou registrado de forma incorreta. Em caso de erro, envia dados ao `Data Inquest Local Service` para revisão e correção.
- **Sender Service**: Inicia uma Saga Orquestrada para enviar dados normalizados para a nuvem, onde passam por validação e são distribuídos entre os serviços de alocação e backup.
- **Microserviços em Nuvem**: Em Java 21, o `Data Distribution Service`, `Alocation Service` e `Backup Persistence Service` recebem, validam e armazenam dados em bancos de dados NoSQL (MongoDB) e SQL (PostgreSQL). Em caso de erro ou inconsistência, os dados são encaminhados ao `Data Inquest Service`.
- **Persistence e Orquestração de Dados**: O `Persistence Service` executa uma Saga Orquestrada, distribuindo os dados finais entre os microserviços de `Location`, `Advertising` e `Reaction` para armazenamento definitivo em PostgreSQL.

## Tecnologias Utilizadas

- **Bancos de Dados**: MongoDB (dados temporários), MySQL (dados de alta rotatividade), PostgreSQL (dados persistentes e históricos).
- **Mensageria**: RabbitMQ (local) e Kafka (nuvem).
- **Linguagens**: TypeScript (serviços locais) e Java 21 (serviços em nuvem).
- **Bibliotecas de IA**: Python para processamento de reconhecimento facial, análise de atenção, emoções e interesse dos usuários.

## Funcionalidades Principais

- **Análise em Tempo Real**: Captura de dados de localização, publicidade e reação, com suporte para filtragem e normalização em tempo real.
- **Pipeline de Integridade e Backup de Dados**: Sistema robusto de validação e recuperação de dados com suporte para backups automáticos em nuvem.
- **Saga Orquestrada e Coreografada**: Processos de gerenciamento de transações distribuídas para consistência e recuperação de dados.
  
Este projeto garante uma análise eficiente e escalável das interações com publicidade digital, fornecendo insights valiosos sobre o comportamento dos usuários e a eficácia das campanhas.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/matheusrebola/propagandus.git
