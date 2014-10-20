# Play! Framework binary deploy

# For Play! v2.2 use flurdy/play-framework
# For Play! v2.3+ use flurdy/activator-mini
FROM flurdy/activator-mini:latest
# FROM flurdy/play-framework:latest

MAINTAINER flurdy

COPY playapp /var/local/

# For Play! v2.2 use play binary
RUN cd /var/local/playapp && activator stage
# RUN cd /var/local/playapp && play stage

EXPOSE 9000
EXPOSE 9999

WORKDIR /var/local/playapp

ENTRYPOINT target/universal/stage/bin/$(ls target/universal/stage/bin)
