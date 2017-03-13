FROM flurdy/activator-mini:1.3.12-alpine

MAINTAINER Ivar Abrahamsen <@flurdy>

RUN mkdir -p /opt/build && \
    mkdir -p $HOME/.sbt/0.13

COPY play-scala-starter-example/project /opt/play-project

WORKDIR /opt/build

RUN /opt/activator/bin/activator new playframework-base play-scala && \
    cd playframework-base && \
    rm -rf project && \
    mv /opt/play-project project && \
    /opt/activator/bin/activator stage && \
    rm -rf /opt/build
