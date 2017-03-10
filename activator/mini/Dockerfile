# Lightbend Activator Minimal

FROM openjdk:8u121-jdk

MAINTAINER Ivar Abrahamsen <@flurdy>

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
  apt-get install -yq wget unzip && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*

ENV ACTIVATOR_VERSION 1.3.12

WORKDIR /opt

RUN wget -q --progress=dot:mega http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION-minimal.zip && \
  unzip -qq typesafe-activator-$ACTIVATOR_VERSION-minimal.zip && \
  mv activator-$ACTIVATOR_VERSION-minimal /opt/activator && \
  ln -s /opt/activator/bin/activator /usr/local/bin/activator && \
  rm -f typesafe-activator-$ACTIVATOR_VERSION-minimal.zip
