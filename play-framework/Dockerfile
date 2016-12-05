FROM openjdk:8u111-jdk-alpine

MAINTAINER Ivar Abrahamsen <@flurdy>

RUN apk update && apk add bash wget unzip

ENV ACTIVATOR_HOME /opt/activator

RUN mkdir -p /opt/build && \
    mkdir -p $HOME/.sbt/0.13

ENV ACTIVATOR_VERSION 1.3.12

WORKDIR /opt

RUN wget -q --show-progress http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION-minimal.zip && \
    unzip -qq typesafe-activator-$ACTIVATOR_VERSION-minimal.zip && \
    mv activator-$ACTIVATOR_VERSION-minimal activator && \
    ln -s /opt/activator/bin/activator /usr/local/bin/activator && \
    rm -f typesafe-activator-$ACTIVATOR_VERSION-minimal.zip

WORKDIR /opt/build

RUN /opt/activator/bin/activator new playframework-base play-scala && \
    cd playframework-base && \
    /opt/activator/bin/activator stage && \
    rm -rf /opt/build
