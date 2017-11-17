FROM openjdk:8-jre-alpine
EXPOSE 9010

RUN apk add --no-cache curl

ENV JAVA_OPTS="-server -Xmx1g" \
    APP_OPTS="--spring.profiles.active=dev" \
    HOST_IP="192.168.65.1"

COPY target/omniecom-statistic.jar  app.jar
COPY start.sh start.sh

RUN chmod +x start.sh start.sh

ENTRYPOINT exec ./start.sh
