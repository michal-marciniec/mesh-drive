FROM java:8-jre

ADD ./build/libs/*.jar /app/gateway.jar
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 8080