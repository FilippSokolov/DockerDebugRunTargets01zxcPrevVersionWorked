#FROM maven:3-jdk-1
#FROM opavlova/tomcat
FROM openjdk:8
COPY . /tmp
WORKDIR /tmp/out/artifacts/pass
#It is the console app for entering a new password
CMD ["java", "-jar", "pass.jar"]




# The app provides hello world output:
#CMD ["java", "-jar", "helloworld.jar"]

#The app provides cmd params output
#CMD ["java", "-jar", "echo.jar", "echo1", "echo2", "echo3", "echo4", "echo5", "echo6"]


#Problems:
#1.
# "Remote debug" doesn't take CMD automatically from the file,
# it takes this command from Docker run configuration "Command" fields
#These commands are:
#java -jar helloworld.jar
#java -jar echo.jar echo1 echo2 echo3 echo4 echo5 echo6
#java -jar pass.jar

#2.
#In remote run configuration: we change port in both parts manually  - bug