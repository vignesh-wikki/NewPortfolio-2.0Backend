FROM eclipse-temurin:21-jdk-alpine AS builder
RUN apk add --no-cache maven
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:resolve
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/portfolio-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/static /app/static
EXPOSE ${PORT:-9090}
ENTRYPOINT ["java", "-jar", "app.jar"]
