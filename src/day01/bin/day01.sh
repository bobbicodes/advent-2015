#!/bin/bash

c=0; n=1
for i in $(fold -b1 $1); do
    [ "$i" = "(" ] && c=$((c+1))
    [ "$i" = ")" ] && c=$((c-1))
    echo $c $n
    n=$((n+1))
done

# sh day01.sh input | tail -n1 | cut -d' ' -f1
# sh day01.sh input | grep -e '-1 ' | head -n1 | cut -d' ' -f2
