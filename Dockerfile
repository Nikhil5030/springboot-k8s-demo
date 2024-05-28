FROM openjdk:17
EXPOSE 8080
ADD target/springboot-k8s-yaml-demo.jar springboot-k8s-yaml-demo.jar
ENTRYPOINT ["java","-jar","springboot-k8s-yaml-demo.jar"]