FROM phusion/baseimage:latest

MAINTAINER flurdy

RUN apt-get update && \
	apt-get install -y apache2
RUN apt-get clean 
RUN rm -rf /var/lib/apt/lists/*

EXPOSE 80

CMD ["apache2ctl", "-DFOREGROUND"]
