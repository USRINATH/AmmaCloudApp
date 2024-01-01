FROM openjdk:17
WORKDIR /usr/src/myapp
COPY target/AmmaCloudApp.jar /usr/src/myapp
CMD ["java","-jar", "/usr/src/myapp/target/AmmaCloudApp.jar"]