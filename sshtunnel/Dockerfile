# SSH tunnel 

FROM phusion/baseimage:latest

MAINTAINER flurdy

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
  apt-get install -yq mysql-client ssh && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*

# Override these with command line argument -e
ENV HOST_PORT 3306
ENV TUNNEL_PORT 3306
ENV SSH_USER ausername
ENV SSH_HOST aserver

# Mount /root/.ssh with your own folder volume
COPY ssh/config /root/.ssh/config
COPY ssh/id_rsa /root/.ssh/id_rsa

RUN echo GatewayPorts yes >> /etc/ssh/sshd_config

# Expose it all...
# EXPOSE 22
EXPOSE 25
EXPOSE 80
# EXPOSE 110
# EXPOSE 143
# EXPOSE 465
EXPOSE 587
EXPOSE 993
# EXPOSE 995
EXPOSE 3306
EXPOSE 5432
EXPOSE 8080

ENTRYPOINT ["/usr/bin/ssh"]

# Note the host checking disabling. Be aware that this could be a security risk.
CMD [ "-oStrictHostKeyChecking=no","-L 0.0.0.0:$TUNNEL_PORT:localhost:$HOST_PORT","-N", "$SSH_USER@$SSH_HOST" ]

#
# Example for mysql
# docker run -ti -rm \
#    -p 13306:3306 \
#    -e SSH_USER=me -e SSH_HOST=myserver 
#    -v /home/myuser/.ssh:/root/.ssh:r
#    flurdy/sshtunnel
#
