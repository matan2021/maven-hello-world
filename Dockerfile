FROM openjdk:11-slim
WORKDIR /app
COPY myapp/target/*.jar app.jar
USER 1001
CMD ["java", "-jar", "app.jar"]
