#!/usr/bin/env bash

# docker thrift
#docker run -v $PWD:/data thrift thrift -o /data --gen py /data/message.thrift

# local thrift
thrift --gen py -out ../ message.thrift

thrift --gen java -out ././../../message-thrift-service-api/src/main/java/ message.thrift