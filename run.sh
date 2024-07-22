#!/bin/bash
path=$1
cd $path

javac *.java
java Main
