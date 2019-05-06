FROM openjdk:11
ADD target/gazer.jar gazer.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "gazer.jar"]
