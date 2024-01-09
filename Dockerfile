FROM openjdk:17

WORKDIR /app

COPY target/HelathProject2-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "HelathProject2-0.0.1-SNAPSHOT.jar"]