#!/bin/sh

javac -cp ./libs/commons-lang3-3.12.0.jar:. ua/com/alevel/workclasses/TimeCalculation.java ua/com/alevel/Main.java

java -cp ./libs/commons-lang3-3.12.0.jar:. ua.com.alevel.Main
