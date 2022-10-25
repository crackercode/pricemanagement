FROM openjdk:8
EXPOSE 8080
ADD target/price-service.jar price-service.jar
ENTRYPOINT ["java","-jar","/price-service.jar "]