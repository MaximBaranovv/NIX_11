#!/bin/sh

mvn clean
rm dependency-reduced-pom.xml
mvn install
java -jar target/hm_4_oop.jar