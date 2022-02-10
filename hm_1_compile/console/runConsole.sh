#!/bin/sh

printf "Class-Path: libs/commons-io-2.11.0.jar libs/commons-discovery-0.5.jar libs/commons-lang3-3.12.0.jar libs/commons-codec-1.15.jar libs/commons-math3-3.6.1.jar libs/commons-text-1.9.jar \nMain-Class: ua.com.alevel.Main\n">MANIFEST.MF

javac -sourcepath ./src -cp ./libs/*: -d build/classes src/ua/com/alevel/Main.java

mkdir -p build/jar

jar cfm build/jar/main.jar MANIFEST.MF -C build/classes/ .
mkdir -p build/jar/libs
cp libs/* build/jar/libs
java -jar build/jar/main.jar