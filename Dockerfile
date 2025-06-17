FROM eclipse-temurin:21-jdk-alpine
RUN apk add --no-cache maven
WORKDIR /app
COPY . .
RUN mvn clean package
ENTRYPOINT ["java", "-jar", "target/portfolio-0.0.1-SNAPSHOT.jar"]
