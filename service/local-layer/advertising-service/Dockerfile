# Usando a imagem oficial do OpenJDK
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado pelo Maven para o container
COPY target/*.jar app.jar

# Define variáveis de ambiente para o container
ENV SERVER_PORT=60000

# Expõe a porta do servidor
EXPOSE ${SERVER_PORT}

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
