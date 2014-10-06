FROM phusion/baseimage:latest

MAINTAINER flurdy

RUN apt-get update
RUN apt-get install -y apache2
RUN apt-get clean
RUN rm -rf /var/lib/apt/lists/*

EXPOSE 80

ADD index.html /var/www/html/index.html

CMD ["apache2ctl", "-DFOREGROUND"]
