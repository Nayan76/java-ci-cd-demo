# use a multi-stage build to keep the image sall

FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/java-ci-cd-demo-1.0-SNAPSHOT.jar .
CMD ["java", "-jar", "java-ci-cd-demo-1.0-SNAPSHOT.jar"]
