#!/bin/sh
mvn clean
rm dependency-reduced-pom.xml
mvn package
java -jar target/module_1.jar