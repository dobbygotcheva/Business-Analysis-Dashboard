# Business Analytics Dashboard

A modern business analytics dashboard built with Spring Boot, JSF, and PrimeFaces.

## Features

- Interactive charts and visualizations (bar, pie, and line charts)
- Real-time data updates (simulated)
- Responsive, modern UI with PrimeFaces components
- Clean, professional dashboard layout

## Prerequisites

- Java 11 (JDK 11)
- Git (to clone the repository)

## How to Run Locally

1. **Clone the repository:**
   ```bash
   git clone <your-repo-url>
   cd Business-Analysis-Dashboard-main
   ```
2. **Build the application:**
   ```bash
   ./gradlew build
   ```
3. **Run the application:**
   ```bash
   ./gradlew bootRun
   ```
4. **Open your browser and go to:**
   [http://localhost:8081](http://localhost:8081)

   You should see the Business Analytics Dashboard with interactive JSF charts (bar, pie, and line charts) and summary statistics.

## Project Structure

- `src/main/resources/META-INF/resources/index.xhtml` — Main JSF dashboard page
- `src/main/java/com/example/demo/bean/ChartBean.java` — Provides chart data for the dashboard
- `src/main/resources/application.properties` — Application configuration (port, JSF, PrimeFaces settings)
- `build.gradle` — Project dependencies and build configuration

## Technologies Used

- Spring Boot 2.7.18
- JSF (Jakarta Faces) via JoinFaces 4.7.8
- PrimeFaces 11.0.0 (UI components and charts)
- Gradle build system

## License

This project is open source. Feel free to use, modify, and share the code.
