# Lightbend Activator Minimal

FROM openjdk:8u121-jdk-alpine

MAINTAINER Ivar Abrahamsen <@flurdy>

RUN apk update && apk add bash wget unzip

ENV ACTIVATOR_VERSION 1.3.12

WORKDIR /opt

RUN wget  --progress=dot:mega http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION-minimal.zip && \
  unzip -qq typesafe-activator-$ACTIVATOR_VERSION-minimal.zip && \
  mv activator-$ACTIVATOR_VERSION-minimal /opt/activator && \
  ln -s /opt/activator/bin/activator /usr/local/bin/activator && \
  rm -f typesafe-activator-$ACTIVATOR_VERSION-minimal.zip
