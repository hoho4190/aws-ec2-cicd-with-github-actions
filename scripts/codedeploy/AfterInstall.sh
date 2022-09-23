# !/bin/bash

JAR_PATH=/home/ec2-user/workspace/aws-cicd/build/libs
SERVICE_JAR_NAME=aws-cicd.jar

latest_jar=$(ls -I *-plain.jar $JAR_PATH | sort -V | tail -n 1)
cp $JAR_PATH/$latest_jar $JAR_PATH/$SERVICE_JAR_NAME
