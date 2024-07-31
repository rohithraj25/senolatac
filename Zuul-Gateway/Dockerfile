# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/Zuul-Gateway-0.0.1-SNAPSHOT.jar /app/Zuul-Gateway-0.0.1-SNAPSHOT.jar

# Expose port 8765
EXPOSE 8765

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/Zuul-Gateway-0.0.1-SNAPSHOT.jar"]
