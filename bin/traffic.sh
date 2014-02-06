#!/bin/bash
echo "Simulating Traffic"
echo "Press [CTRL+C] to stop"
echo "========================="

while :
do
   curl -sL -w "%{http_code} %{time_total}\\n" http://localhost:8080/nextgen/test?string=HelloWorld -o /dev/null
	sleep 1
done
