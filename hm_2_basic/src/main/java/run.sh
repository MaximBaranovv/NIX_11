#!/bin/sh

javac -cp ./libs/commons-lang3-3.12.0.jar:. workclasses/TimeCalculation.java Main.java

java -cp ./libs/commons-lang3-3.12.0.jar:. Main
