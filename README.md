# Propagandus: Inteligência Artificial para Reconhecimento de Pessoas e Reações a Propagandas

## Descrição

O **Propagandus** é um projeto inovador que utiliza Inteligência Artificial (IA) para analisar e reconhecer pessoas em ambientes públicos, avaliando sua atenção e reação a propagandas. O sistema monitora locais como pontos de ônibus, aeroportos, elevadores e pátios de cinema, capturando informações sobre a atenção das pessoas através de seu olhar e interpretando suas reações (positiva, negativa, neutra) a uma propaganda exibida.

Este projeto é composto por uma arquitetura de microserviços, que se comunica de forma eficiente através de bancos de dados distribuídos e mensageria. A aplicação é projetada para rodar localmente em hardwares de Raspberry Pi, formando um cluster para processamento e comunicação de dados.

---
## Tecnologias Utilizadas
[![SkillIcons](https://skillicons.dev/icons?i=java,spring,kafka,mongodb,python,linux,docker,mysql,raspberrypi,kubernetes)](https://skillicons.dev) 

### **Backend**
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar os dados de atenção, reações e pessoas detectadas.
- **MySQL**: Banco de dados relacional usado para a persistência final dos dados no ambiente local.
- **Raspberry Pi**: Hardware utilizado para criar um cluster local de microserviços.
- **Java**: Linguagem principal para os microserviços remotos, focados em processamento, distribuição e análise de dados.
- **Spring Boot**: Framework robusto utilizado para construção dos microserviços no ambiente remoto, oferecendo integração com bancos de dados e facilidade de escalabilidade.
- **Spring Data**: Ferramenta que simplifica a manipulação de dados com MongoDB e MySQL nos microserviços remotos.
- **Spring Cloud**: Implementado para orquestrar os microserviços e gerenciar padrões como **Saga Coreografada** e **mensageria**.
- **Kafka**: Middleware utilizado para comunicação assíncrona e processamento distribuído entre os microserviços remotos.

### **Infraestrutura e Mensageria**
- **Docker e Docker Compose**: Para orquestrar os microserviços e bancos de dados de maneira simplificada, tanto localmente quanto remotamente.
- **Kubernetes**: Para ambientes mais complexos e escaláveis, como deploy remoto em clusters.
- **Mensageria com Kafka**: É utilizado localmente para filas e consistência de dados, enquanto Kafka gerencia eventos e mensagens entre microserviços no ambiente remoto.

---

## Como Funciona

1. **Captura de Dados pela IA**: A IA identifica e reconhece as pessoas, analisa sua atenção (olhar) e avalia sua reação (positiva, negativa, neutra) com base nas propagandas exibidas nos painéis públicos.

2. **Envio dos Dados para Microserviços**: Os dados de cada pessoa, sua atenção, atenção e reação são enviados para o microserviço de registro: `Register-Service`.

3. **Persistência de Dados**: O microserviço `Data-Persistence-Service` lê os dados dos microserviços de registro e os armazena no banco de dados relacional MySQL.

4. **Envio para Sistema Remoto**: O `Sender-Service` envia os dados para o microserviço remoto `Data-Reciver-Service`, que os armazena em um banco de dados MongoDB e finaliza a Saga iniciado no `Sender-Service`.

5. **Distribuição de Dados**: O microserviço `Data-Distribution-Service` envia os dados persistidos para o microserviço de `Analitics-Service` que salva todos os dados em um Data Lake. O script Python atualiza os bancos de dados, um utilizado para análise de dados e outro para backup.

6. **Análise de Dados**: Seis microseriviços foram criados para buscar dados personalizados, `Attention-Service`, `Painel-Service`, `Date-Time-Service`, `Location-Service`, `Reaction-Service`, `Advertising-Service`, responsáveis por análises mais profunda, separada por assunto.

---

## Padrão **Saga Coreografada** e **Saga Orquestrado**

A arquitetura do sistema segue o padrão **Saga Coreografada** em alguns pontos e em outros o **Saga Orquestrado** para garantir a consistência dos dados durante as transações.

---

## Como Rodar Localmente

### Pré-requisitos

1. **Docker** e **Docker Compose** instalados.
2. **Node.js** e **npm** instalados.
3. **Java17** e **Maven** instalados.


### Passos

1. Clone o repositório:

   ```bash
   git clone https://github.com/matheusrebola/propagandus.git
   cd propagandus
   ```

2. Inicie os containers Docker para todos os serviços com o script:

   ```bash
   python3 setup_microservices.py
   ```

3. Certifique-se de que os microserviços estão funcionando corretamente, acessando os logs:

   ```bash
   docker-compose logs -f
   ```

---

## Contribuições

Contribuições para este projeto são bem-vindas! Se você deseja contribuir, siga os seguintes passos:

1. Faça um fork do projeto.
2. Crie uma branch para a sua feature (`git checkout -b feature/nova-feature`).
3. Faça commit das suas alterações (`git commit -am 'Add nova feature'`).
4. Envie para o repositório remoto (`git push origin feature/nova-feature`).
5. Abra um pull request.

