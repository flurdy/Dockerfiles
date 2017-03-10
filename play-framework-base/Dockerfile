FROM flurdy/play-framework:2.5.12-alpine

MAINTAINER Ivar Abrahamsen <@flurdy>

WORKDIR /opt/build

# COPY conf/repositories /root/.sbt/
# COPY conf/local.sbt /root/.sbt/0.13/

ADD . /opt/build/

RUN /opt/activator/bin/activator stage && \
    rm -rf /opt/build
