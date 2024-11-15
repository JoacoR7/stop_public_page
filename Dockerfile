FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/publicPage-0.0.1.jar
COPY ${JAR_FILE} paginapublica.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","paginapublica.jar"]
