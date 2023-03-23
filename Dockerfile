FROM amazoncorretto:11-alpine-jdk
MAINTAINER Geo
COPY target/Geo-0.0.1-SNAPSHOT.jar portfolio.jar
ENTRYPOINT ["java","-jar","/portfolio.jar"]
