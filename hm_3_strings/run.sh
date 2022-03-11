#!/bin/sh
mvn clean
rm dependency-reduced-pom.xml
mvn package
java -jar target/hm_3_strings.jar