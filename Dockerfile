FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY target/ic-bff-1.0-SNAPSHOT.jar /home/ic-bff.jar
ENTRYPOINT java -jar /home/ic-bff.jar