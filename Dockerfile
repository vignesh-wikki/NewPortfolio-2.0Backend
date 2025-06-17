FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio.jar

ENTRYPOINT ["java", "-jar", "portfolio.jar"]
