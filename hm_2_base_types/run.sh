#!/bin/sh

mvn clean
rm dependency-reduced-pom.xml
mvn install
java -jar target/hm_2_base_types.jar