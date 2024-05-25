FROM openjdk:18
EXPOSE 8080
ADD target/springboot-images-1.jar springboot-images-1.jar
ENTRYPOINT ["java","-jar","/springboot-images-1.jar"]