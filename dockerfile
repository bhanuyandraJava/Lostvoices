FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/lostvoices-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]