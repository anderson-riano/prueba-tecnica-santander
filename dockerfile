# Dockerfile
FROM openjdk:11-jre-slim
COPY target/prueba-tecnica-1.0.0.jar /app/prueba-tecnica-1.0.0.jar

CMD ["java", "-jar", "/app/prueba-tecnica-1.0.0.jar"]
