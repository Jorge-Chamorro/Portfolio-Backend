
FROM amazoncorretto:11
MAINTAINER Geo
COPY target/Geo-0.0.1-SNAPSHOT.jar Geo-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","/Geo-0.0.1-SNAPSHOT.jar.jar"]
