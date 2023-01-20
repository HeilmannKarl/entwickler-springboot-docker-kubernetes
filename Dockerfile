FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/*jar app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]