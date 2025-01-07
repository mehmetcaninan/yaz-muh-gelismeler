FROM openjdk:17-jdk-slim

WORKDIR /app

RUN apt-get update && apt-get install -y git

RUN git clone https://github.com/mehmetcaninan/yaz-muh-gelismeler/blob/main/docker%20imaj%C4%B1%20ile%20spring%20boot%20uygulamas%C4%B1
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
