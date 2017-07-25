#!/bin/bash
if [ ! "$1" ]; then
        echo "###################################################"
        echo "##### you must point out the input file" 
        echo "###################################################"

        exit 1 
fi
if [ ! "$2" ]; then
        echo "###################################################"
        echo "##### you must point out the output file " 
        echo "###################################################"

        exit 1 
fi
less $1 | awk '{print $2" "$3" "$4" "$5" "$6" "$7" "$8" "$9}' > file
export CLASSPATH=.:$CLASSPATH
java Gxr2Prase ./file $2

