FROM openjdk:17-alpine
EXPOSE 8081
COPY target/users-0.0.1-SNAPSHOT.jar users.jar
ENTRYPOINT ["java","-jar","/users.jar"]