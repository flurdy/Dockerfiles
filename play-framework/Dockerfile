# Play! framework v2.2

FROM flurdy/oracle-java7:latest

MAINTAINER flurdy

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
  apt-get install -yq wget unzip && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*

ENV PLAY_VERSION 2.2.5

RUN cd /tmp && \
  wget http://downloads.typesafe.com/play/$PLAY_VERSION/play-$PLAY_VERSION.zip && \
  unzip play-$PLAY_VERSION.zip && \
  mv /tmp/play-$PLAY_VERSION /opt/play-$PLAY_VERSION && \
  ln -s /opt/play-$PLAY_VERSION/play /usr/local/bin/play && \
  rm /tmp/play-$PLAY_VERSION.zip
