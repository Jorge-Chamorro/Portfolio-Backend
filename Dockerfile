
FROM amazoncorretto:17-alpine-jdk
MAINTAINER Geo
COPY "./target/Geo-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java","-jar","app.jar"]
