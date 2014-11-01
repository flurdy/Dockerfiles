# Play! Framework development container

# For Play! v2.2 use flurdy/play-framework
# For Play! v2.3+ use flurdy/activator-mini
FROM flurdy/activator-mini:latest
# FROM flurdy/play-framework:latest

MAINTAINER flurdy

# For Play! v2.2 skip this step
RUN cd /tmp && \
  activator new preloader play-scala && \
  cd preloader && \
  activator dist && \
  cd / && \
  rm -rf /tmp/preloader

EXPOSE 9000
EXPOSE 9999

WORKDIR /var/local/playapp

# Additional optional play configurations and variables via arguments
# For Play! v2.2 use play binary
ENTRYPOINT ["/usr/local/bin/activator"]
# ENTRYPOINT "[/usr/local/bin/play"]

# Example
# Expose application on port 49900
# Mount local path to /var/local/playapp
# docker run -ti --rm -p 49900:9000 \
#    -v pathtoyourapp:/var/local/playapp:rw flurdy/play-dev
