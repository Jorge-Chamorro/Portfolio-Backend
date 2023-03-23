
EXPOSE 8080
FROM amazoncorretto:11-alpine-jdk
MAINTAINER Geo
COPY target/Geo-0.0.1-SNAPSHOT.jar portfolio.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/portfolio.jar"]
