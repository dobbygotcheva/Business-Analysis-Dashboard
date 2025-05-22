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

# Build the application with verbose output
RUN ./gradlew clean build --info && \
    echo "Listing build directory:" && \
    ls -la build/ && \
    echo "Listing libs directory:" && \
    ls -la build/libs/

# Set environment variables
ENV PORT=8081
ENV SPRING_APPLICATION_NAME=demo
ENV SERVER_SERVLET_CONTEXT_PATH=/
ENV JOINFACES_PRIMEFACES_THEME=saga
ENV JOINFACES_PRIMEFACES_FONT_AWESOME=true
ENV JOINFACES_VIEWS_PATH_PREFIX=/
ENV JOINFACES_VIEWS_PATH_SUFFIX=.xhtml
ENV JOINFACES_JSF_PROJECT_STAGE=Production
ENV JOINFACES_JSF_FACELETS_SKIP_COMMENTS=true
ENV LOGGING_LEVEL_ORG_JOINFACES=INFO
ENV LOGGING_LEVEL_ORG_SPRINGFRAMEWORK=INFO
ENV LOGGING_LEVEL_COM_EXAMPLE_DEMO=INFO
ENV PRIMEFACES_THEME=saga
ENV PRIMEFACES_FONT_AWESOME=true
ENV PRIMEFACES_UPLOADER=commons
ENV PRIMEFACES_CLIENT_SIDE_VALIDATION=true
ENV JAVAX_FACES_PROJECT_STAGE=Production
ENV JAVAX_FACES_FACELETS_SKIP_COMMENTS=true
ENV JAVAX_FACES_FACELETS_BUFFER_SIZE=65535
ENV JAVAX_FACES_FACELETS_DEVELOPMENT=false

# Expose the port
EXPOSE 8081

# Run the application using Spring Boot launcher
CMD ["sh", "-c", "cd /app && java -jar build/libs/demo-0.0.1-SNAPSHOT.war --server.port=${PORT}"] 