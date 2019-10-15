FROM openjdk:11
#WORKDIR usr/src
ADD ./target/Eureka-Server-For-Docker.jar  Eureka-Server-For-Docker.jar

EXPOSE 8761
ENTRYPOINT ["java","-jar","Eureka-Server-For-Docker.jar"]
