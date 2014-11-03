# Android SDK

FROM flurdy/oracle-java7:latest

MAINTAINER flurdy

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
  apt-get install -yq wget unzip expect && \
  apt-get autoremove -yq && \
  apt-get clean -yq && \
  rm -rf /var/lib/apt/lists/*

ENV ADT_VERSION 20140702

RUN cd /tmp && \
  wget https://dl.google.com/android/adt/adt-bundle-linux-x86_64-$ADT_VERSION.zip && \
  unzip -q adt-bundle-linux-x86_64-$ADT_VERSION.zip && \
  mkdir /opt/android && \
  mv /tmp/adt-bundle-linux-x86_64-$ADT_VERSION /opt/android/adt-bundle && \
  rm /tmp/adt-bundle-linux-x86_64-$ADT_VERSION.zip

RUN echo "PATH=\$PATH:/opt/android/adt-bundle/sdk/tools:/opt/android/adt-bundle/sdk/platform-tools" >> ~/.bashrc
RUN export PATH=$PATH:/opt/android/adt-bundle/sdk/tools:/opt/android/adt-bundle/sdk/platform-tools

RUN echo "y" | /opt/android/adt-bundle/sdk/tools/android update sdk --no-ui --filter platform-tools
RUN echo "y" | /opt/android/adt-bundle/sdk/tools/android update sdk --no-ui --filter android-19,build-tools-19.1.0,sysimg-19
RUN echo "y" | /opt/android/adt-bundle/sdk/tools/android update sdk --no-ui --filter android-21

ENTRYPOINT ["/opt/android/adt-bundle/sdk/tools/android"]

CMD ["list","sdk","--no-ui","--all"]
