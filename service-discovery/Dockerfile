FROM java:8-jre

ADD ./build/libs/*.jar /app/service-discovery.jar
CMD ["java", "-Xmx200m", "-jar", "/app/service-discovery.jar"]

HEALTHCHECK CMD curl -f http://localhost:8761/actuator/health

EXPOSE 8761