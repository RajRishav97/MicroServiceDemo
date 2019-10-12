FROM openjdk:11
#WORKDIR usr/src
ADD ./target/Eureka-server-0.0.1-SNAPSHOT.jar  Eureka-server-0.0.1-SNAPSHOT.jar

EXPOSE 8761
ENTRYPOINT ["java","-jar","Eureka-server-0.0.1-SNAPSHOT.jar"]
