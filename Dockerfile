# Use official Java runtime
FROM openjdk:17-jdk-slim

# Copy the jar file to the container
COPY target/primeservice-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
