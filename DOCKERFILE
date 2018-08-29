FROM java:8
WORKDIR /
ADD target/demo.jar demo.jar
EXPOSE 8085
CMD ["java", "-jar", "demo.jar"]
