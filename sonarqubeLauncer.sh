#!/bin/sh
#To install local version of Sonarqube with docker you can launch this command:

# docker run -d -p 9000:9000 mwizner/sonarqube:8.7.1-community (for windows you can use official one)

#add in the pom the following plugin:
# <plugin>
#   <groupId>org.scoverage</groupId>
#   <artifactId>scoverage-maven-plugin</artifactId>
#   <version>${scoverage.plugin.version} </version>  <!-- version can be last one compatible with your env -->
# </plugin>

# utility script to use Scoverage with a local version of SonarQube
# need to update login, project key and port value with yours
key=eed1f56524d501ed58ea52e4d9defed1c67de1e5
port=9000
project=SonarQubeDemo

#pls note that you need mvn version used for the project,
# '/Library/Developer/apache-maven-3.6.3/bin/mvn' is my personal one
mvn clean scoverage:report -f pom.xml
mvn sonar:sonar \
  -Dsonar.projectKey=$project \
  -Dsonar.sources=src/main/scala \
  -Dsonar.tests=src/test/scala \
  -Dsonar.host.url=http://localhost:$port \
  -Dsonar.login=$key \
  -Dsonar.scala.coverage.reportPaths="target/scoverage.xml"
