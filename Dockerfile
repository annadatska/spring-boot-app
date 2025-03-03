FROM openjdk:17-jdk-slim as builder

WORKDIR /app

COPY target/spring-boot-app-0.0.1-SNAPSHOT.jar /app/spring-boot-app-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/spring-boot-app-0.0.1-SNAPSHOT.jar"]
