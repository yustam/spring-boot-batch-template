FROM centos:centos6
MAINTAINER yustam <mayu02noac@gmail.com>

RUN yum install -y java-1.7.0-openjdk
RUN mkdir /opt/app
RUN cd /opt/app
COPY spring-batch.jar /opt/app/spring-batch.jar

CMD bash -c 'java -jar /opt/app/spring-batch.jar --db.host=$DB_PORT_5432_TCP_ADDR --db.port=$DB_PORT_5432_TCP_PORT'
