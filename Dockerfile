FROM openjdk:11
LABEL maintainer="dpopov88@me.com"

ADD target/gazer.jar gazer.jar

ENTRYPOINT ["java", "-jar", "gazer.jar"]