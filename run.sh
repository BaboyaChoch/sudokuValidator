#!/bin/bash
if [ $# -eq 0 ]
  then
    echo "No arguments supplied."
    echo "Error, usage: sh run.sh [fileName] or javac Reader.java && java Reader [fileName]"
  else
    javac Reader.java && java Reader "$1"
    rm *.class
fi





