FROM adoptopenjdk:11-hotspot
LABEL maintainer="jugarriza10@gmail.com"
COPY target/bank.product-0.0.1-SNAPSHOT.jar bank.product.jar
CMD ["java", "-jar", "bank.product.jar"]
EXPOSE 9961