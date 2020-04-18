FROM openjdk:13
VOLUME /tmp
EXPOSE 8888
ADD ./target/services-bankaforo255-config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]