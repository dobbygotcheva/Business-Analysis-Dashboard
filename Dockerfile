# Use OpenJDK 11 as the base image
FROM openjdk:11-jdk-slim

# Set working directory
WORKDIR /app

# Copy Gradle files
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Make gradlew executable
RUN chmod +x ./gradlew

# Copy source code
COPY src src

# Build the application
RUN ./gradlew build

# Expose the port
EXPOSE 8081

# Run the application
CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"] 