# Pull base image
From tomcat:8-jre8

# Maintainer
MAINTAINER "Edward de Langen <edelangen@gmail.com">

# Copy to images tomcat path
ADD cgibell.war /usr/local/tomcat/webapps/