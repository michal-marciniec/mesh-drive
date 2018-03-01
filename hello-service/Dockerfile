FROM java:8-jre

ADD ./build/libs/*.jar /app/hello-service.jar
CMD ["java", "-Xmx200m", "-jar", "/app/hello-service.jar"]