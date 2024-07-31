# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/User-Service-0.0.1-SNAPSHOT.jar /app/User-Service-0.0.1-SNAPSHOT.jar

# Expose port 9090
EXPOSE 9090

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/User-Service-0.0.1-SNAPSHOT.jar"]

