#!/bin/sh

mvn clean
rm dependency-reduced-pom.xml
mvn install
java -jar target/hw_2_basic.jar