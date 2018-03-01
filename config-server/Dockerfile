FROM java:8-jre

ADD ./build/libs/*.jar /app/config-server.jar
CMD ["java", "-Xmx200m", "-jar", "/app/config-server.jar"]

HEALTHCHECK CMD curl -f http://localhost:8888/actuator/health

EXPOSE 8888