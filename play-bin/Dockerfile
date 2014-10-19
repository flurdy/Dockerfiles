# Play! Framework binary deploy

FROM flurdy/activator-mini:latest

MAINTAINER flurdy

COPY playapp /var/local/

RUN cd /var/local/playapp && activator stage

EXPOSE 9000
EXPOSE 9999

WORKDIR /var/local/playapp

ENTRYPOINT target/universal/stage/bin/$(ls target/universal/stage/bin)
