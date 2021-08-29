FROM maven:3.8.1-openjdk-16-slim AS build

WORKDIR /app/source

# Download dependencies
COPY pom.xml ./
RUN mvn -f pom.xml dependency:go-offline

# Copy source code
COPY src ./src
RUN mvn -f pom.xml package -Dmaven.test.skip=true

# Copy app
FROM openjdk:16-jdk-alpine
COPY --from=build /app/source/target/*.jar /app/app.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/app/app.jar"]