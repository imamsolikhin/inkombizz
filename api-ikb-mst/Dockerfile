FROM adoptopenjdk/openjdk8

# copy jar file into container image under app directory
COPY target/demo.jar app/demo.jar
# expose server port accept connections
EXPOSE 8080
# start application
CMD ["java", "-jar", "app/demo.jar"]
