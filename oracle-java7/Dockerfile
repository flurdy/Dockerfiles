FROM phusion/baseimage:latest

MAINTAINER flurdy

RUN apt-get clean
RUN apt-get update
RUN apt-get install -y python-software-properties
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update

# accept-java-license
RUN echo /usr/bin/debconf shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

RUN apt-get install -y oracle-java7-installer
RUN apt-get install -y oracle-java7-set-default
RUN apt-get clean
