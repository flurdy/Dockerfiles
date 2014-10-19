FROM phusion/baseimage:latest

MAINTAINER flurdy

ENV DEBIAN_FRONTEND noninteractive

# accept-java-license
RUN echo /usr/bin/debconf shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

RUN apt-get update && \
  apt-get install -yq python-software-properties && \
  add-apt-repository ppa:webupd8team/java && \
  apt-get remove -yq python-software-properties && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*

RUN apt-get update && \
  apt-get install -yq oracle-java8-installer oracle-java8-set-default && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*
