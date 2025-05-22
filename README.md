# Business Analytics Dashboard

A modern business analytics dashboard built with Spring Boot, JSF, and PrimeFaces.

## Features

- Interactive charts and visualizations
- Real-time data updates
- Responsive design
- Modern UI with PrimeFaces components

## Local Development

1. Ensure you have Java 11 installed
2. Clone this repository
3. Build the application: `./gradlew build`
4. Run the application: `./gradlew bootRun`
5. Access the application at: http://localhost:8081

## Deployment on Render

1. Create a new Web Service on Render
2. Connect your GitHub repository
3. Use the following settings:
   - Environment: Java
   - Build Command: `./gradlew build`
   - Start Command: `java -jar build/libs/demo-0.0.1-SNAPSHOT.war`
   - Environment Variables:
     - `JAVA_VERSION`: 11
     - `PORT`: 8081

## Technologies Used

- Spring Boot 2.7.18
- Jakarta EE
- JoinFaces 4.7.8
- PrimeFaces 11.0.0
- Gradle build system

## License

This project is open source. Feel free to use the code.
