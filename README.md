# Propagandus: Inteligência Artificial para Reconhecimento de Pessoas e Reações a Propagandas

## Descrição

O **Propagandus** é um projeto inovador que utiliza Inteligência Artificial (IA) para analisar e reconhecer pessoas em ambientes públicos, avaliando sua atenção e reação a propagandas. O sistema monitora locais como pontos de ônibus, aeroportos, elevadores e pátios de cinema, capturando informações sobre a atenção das pessoas através de seu olhar e interpretando suas reações (positiva, negativa, neutra) a uma propaganda exibida.

Este projeto é composto por uma arquitetura de microserviços, que se comunica de forma eficiente através de bancos de dados distribuídos e mensageria. A aplicação é projetada para rodar localmente em hardwares de Raspberry Pi, formando um cluster para processamento e comunicação de dados.

---

## Arquitetura

O sistema é composto pelos seguintes **microserviços**:

### 1. **People-Register-Service**
   - **Função**: Registra as pessoas que são detectadas nas imagens capturadas pela IA.
   - **Bancos de Dados**:
     - **Redis**: Para garantir que as requisições sejam recebidas sem perdas.
     - **MongoDB**: Para armazenar os dados de pessoas registradas.

### 2. **Attention-Register-Service**
   - **Função**: Registra a atenção das pessoas, baseada no reconhecimento do olhar.
   - **Bancos de Dados**:
     - **Redis**: Para garantir que os dados de atenção sejam armazenados sem perdas.
     - **MongoDB**: Para armazenar os dados de atenção de cada pessoa.

### 3. **Reaction-Register-Service**
   - **Função**: Registra a reação das pessoas às propagandas, identificando reações positivas, negativas ou neutras.
   - **Bancos de Dados**:
     - **Redis**: Para garantir que os dados de reações sejam registrados sem perdas.
     - **MongoDB**: Para armazenar as reações detectadas.

### 4. **Data-Persistence-Service**
   - **Função**: Lê os dados dos microserviços de registro e os persiste em um banco de dados relacional (MySQL).
   - **Bancos de Dados**:
     - **MySQL**: Para armazenar dados persistentes e relacionais.
     - **Redis**: Para organizar a fila de dados e garantir a entrega sem perdas.
     - **MongoDB**: Para coletar os dados recebidos dos microserviços de registro.

### 5. **Sender-Service**
   - **Função**: Envia os dados coletados para o microserviço remoto `Data-Reciver-Service`, usando o padrão **Saga Coreografada** para garantir a consistência de dados.
   - **Bancos de Dados**:
     - **MongoDB**: Para armazenar as requisições enviadas.

### 6. **Data-Reciver-Service**
   - **Função**: Recebe os dados do `Sender-Service` e os armazena em seu MongoDB. Quando todos os dados são recebidos e armazenados, a Saga é finalizada e a próxima pode ser iniciada.
   - **Bancos de Dados**:
     - **MongoDB**: Para armazenar os dados recebidos.

### 7. **Data-Distribution-Service**
   - **Função**: Envia os dados para os microserviços de persistência e analíticos, iniciando outra Saga Coreografada.
   - **Bancos de Dados**:
     - **MySQL**: Para persistir os dados em bancos relacionais.
     - **Redis**: Para garantir a integridade e consistência dos dados.

### 8. **Advertising**
   - **Função**: Fornece informações sobre as propagandas que estão sendo exibidas nos painéis de propaganda. O microserviço pode lidar com painéis estáticos ou dinâmicos (que alternam entre várias propagandas).
   - **Integração**:
     - Envia dados para o `Data-Persistence-Service` para associar propagandas com os dados de atenção e reação das pessoas.

## Tecnologias Utilizadas
[![SkillIcons](https://skillicons.dev/icons?i=typescript,nestjs,java,spring,kafka,mongodb,redis,docker,mysql,raspberrypi,kubernetes,mariadb)](https://skillicons.dev)

### **Backend Local**
- **TypeScript**: Linguagem principal utilizada no desenvolvimento de microserviços locais.
- **NestJS**: Framework para construção de APIs e microserviços robustos e escaláveis em TypeScript.
- **Redis**: Sistema de armazenamento em cache para gerenciar filas e garantir a integridade dos dados temporários.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar os dados de atenção, reações e pessoas detectadas.
- **MySQL**: Banco de dados relacional usado para a persistência final dos dados no ambiente local.
- **Raspberry Pi**: Hardware utilizado para criar um cluster local de microserviços.

### **Backend Remoto**
- **Java**: Linguagem principal para os microserviços remotos, focados em processamento, distribuição e análise de dados.
- **Spring Boot**: Framework robusto utilizado para construção dos microserviços no ambiente remoto, oferecendo integração com bancos de dados e facilidade de escalabilidade.
- **Spring Data**: Ferramenta que simplifica a manipulação de dados com MongoDB e MySQL nos microserviços remotos.
- **Spring Cloud**: Implementado para orquestrar os microserviços e gerenciar padrões como **Saga Coreografada** e **mensageria**.
- **Kafka**: Middleware utilizado para comunicação assíncrona e processamento distribuído entre os microserviços remotos.

### **Infraestrutura e Mensageria**
- **Docker e Docker Compose**: Para orquestrar os microserviços e bancos de dados de maneira simplificada, tanto localmente quanto remotamente.
- **Kubernetes**: Para ambientes mais complexos e escaláveis, como deploy remoto em clusters.
- **Mensageria com Redis e Kafka**: Redis é utilizado localmente para filas e consistência de dados, enquanto Kafka gerencia eventos e mensagens entre microserviços no ambiente remoto.

---

Essa organização diferencia bem as tecnologias utilizadas entre os microserviços locais e remotos, refletindo a arquitetura híbrida do seu sistema. Se quiser mais algum ajuste ou detalhamento, só avisar!

## Como Funciona

1. **Captura de Dados pela IA**: A IA identifica e reconhece as pessoas, analisa sua atenção (olhar) e avalia sua reação (positiva, negativa, neutra) com base nas propagandas exibidas nos painéis públicos.

2. **Envio dos Dados para Microserviços**: Os dados de cada pessoa, sua atenção e reação são enviados para os respectivos microserviços de registro: `People-Register-Service`, `Attention-Register-Service` e `Reaction-Register-Service`.

3. **Persistência de Dados**: O microserviço `Data-Persistence-Service` lê os dados dos microserviços de registro e os armazena no banco de dados relacional MySQL.

4. **Envio para Sistema Remoto**: O `Sender-Service` envia os dados para o microserviço remoto `Data-Reciver-Service`, que os armazena e finaliza a Saga.

5. **Distribuição de Dados**: O microserviço `Data-Distribution-Service` envia os dados persistidos para os microserviços analíticos e de backup, garantindo a continuidade do fluxo de dados.

---

## Padrão **Saga Coreografada**

A arquitetura do sistema segue o padrão **Saga Coreografada** para garantir a consistência dos dados durante as transações. Cada microserviço é responsável por enviar eventos de forma assíncrona para o próximo serviço da cadeia, garantindo que a consistência dos dados seja preservada, mesmo em cenários de falhas.

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

---

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---