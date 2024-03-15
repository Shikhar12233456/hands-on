FROM openjdk:17

ADD /target/hands-on.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8656