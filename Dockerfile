FROM openjdk:17-slim
WORKDIR /app
COPY myapp/target/*.jar app.jar
USER 1001
CMD ["java", "-jar", "app.jar"]
