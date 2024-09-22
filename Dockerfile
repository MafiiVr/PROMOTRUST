FROM openjdk:22
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/PROMOTRUST-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} promotrust.jar
ENTRYPOINT ["java","-jar","/promotrust.jar"]