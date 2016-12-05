# Lightbend Activator

FROM java:openjdk-8u111-jdk-alpine

MAINTAINER Ivar Abrahamsen <@flurdy>

RUN apk update && apk add bash wget unzip

ENV ACTIVATOR_VERSION 1.3.12

RUN cd /tmp && \
  wget  --progress=dot:mega http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION.zip && \
  unzip -qq typesafe-activator-$ACTIVATOR_VERSION.zip && \
  mv /tmp/activator-dist-$ACTIVATOR_VERSION /opt/activator && \
  ln -s /opt/activator/bin/activator /usr/local/bin/activator && \
  rm /tmp/typesafe-activator-$ACTIVATOR_VERSION.zip
