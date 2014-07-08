#!/bin/bash
mkdir output
mv LICENSE.txt output
mv OpenKitSDK output
mv README.md output
mv samples output
mv Vendor output

zip -r Gameeso-Android-SDK.zip output/