FROM openjdk:8
EXPOSE 8080
ADD target/jenkins.springboot.integration.jar jenkins.springboot.integration.jar
ENTRYPOINT ["java","-jar","/jenkins.springboot.integration.jar"]