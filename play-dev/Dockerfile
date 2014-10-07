# Play! Framework development container

# Change to your own activator image
FROM flurdy/activator-mini:latest

MAINTAINER flurdy

EXPOSE 9000
EXPOSE 9999

WORKDIR /var/local/playapp

# Additional optional play configurations and variables via arguments
ENTRYPOINT /usr/local/bin/activator

# Example
# Expose application on port 49800
# Mount local path to /var/local/playapp
# docker run -t -i -p 49800:9000 -v pathtoyourapp:/var/local/playapp:rw flurdy/play-dev
