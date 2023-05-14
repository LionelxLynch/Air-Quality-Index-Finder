# Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

# Run stage
FROM amazoncorretto:17
WORKDIR /app
COPY --from=build /app/target/aqi-data-finder-0.0.1-SNAPSHOT.jar /app/aqi-data-finder.jar
ENV PORT=8081
EXPOSE ${PORT}
CMD ["java", "-jar", "/app/aqi-data-finder.jar"]