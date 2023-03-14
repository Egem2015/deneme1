FROM openjdk:8
EXPOSE 8180
WORKDIR /deneme
ADD target/deneme3-0.0.1-SNAPSHOT.jar deneme3-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","deneme3-0.0.1-SNAPSHOT.jar"]