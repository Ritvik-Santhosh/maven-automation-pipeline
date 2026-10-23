
# Use official Java runtime image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside the container
WORKDIR /app

# Copy the packaged Maven JAR
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
