# Typesafe Activator

# Change to your own java image
FROM flurdy/java7:latest

MAINTAINER flurdy

ENV ACTIVATOR_VERSION 1.2.10

RUN apt-get clean
RUN apt-get update
RUN apt-get install -y wget unzip

RUN cd /tmp && wget http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION.zip && unzip typesafe-activator-$ACTIVATOR_VERSION.zip
RUN mkdir /opt/typesafe && mv /tmp/activator-$ACTIVATOR_VERSION /opt/typesafe/activator-$ACTIVATOR_VERSION
RUN ln -s /opt/typesafe/activator-$ACTIVATOR_VERSION/activator /usr/local/bin/activator
RUN rm /tmp/typesafe-activator-$ACTIVATOR_VERSION.zip

RUN apt-get clean

