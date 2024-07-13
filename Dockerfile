FROM openjdk:17-slim as build
ADD target/productservice-0.0.1-SNAPSHOT.jar productservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","productservice-0.0.1-SNAPSHOT.jar" ]