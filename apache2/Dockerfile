# Apache httpd 2 server

FROM phusion/baseimage:latest

MAINTAINER flurdy

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
  apt-get install -yq apache2 && \
  apt-get autoremove -yq && \
  apt-get clean && \
  rm -rf /var/lib/apt/lists/*

EXPOSE 80

CMD ["apache2ctl", "-DFOREGROUND"]
