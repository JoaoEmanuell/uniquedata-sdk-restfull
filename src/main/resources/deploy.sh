#!/bin/bash

cd /../../uniquedata-sdk-helper;

echo "Maven clean install deploy uniquedata-restfull-sdk starting ...";

mvn clean

mvn install

sleep 1;

echo "===================================================================================="
echo "===================================================================================="
echo ""
echo "Maven deploy for maven [central.sonatype.org] > uniquedata-restfull-sdk starting ...";
echo ""
echo "===================================================================================="
echo "===================================================================================="

sleep 1;

mvn deploy -U

sleep 1;

echo "===================================================================================="
echo "===================================================================================="
echo ""
echo "Finish Deploy!";
echo ""
echo "===================================================================================="
echo "===================================================================================="