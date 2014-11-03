# NodeJS

FROM phusion/baseimage:latest

MAINTAINER flurdy

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
  apt-get install -yq curl build-essential && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*

RUN curl -sL https://deb.nodesource.com/setup | sudo bash -

RUN apt-get update && \
  apt-get install -y nodejs && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*
