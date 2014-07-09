#!/bin/bash
ANT_CONFIG="release"
ANT_TARGET="dist-jar"

ANDROID_SDK_BUILD_FILE="OpenKitSDK/build.xml"
ANDROID_UNITY_BUILD_FILE="OpenKitUnity/build.xml" 

echo "Building Android SDK"
ant $ANT_CONFIG -f $ANDROID_SDK_BUILD_FILE

echo "Building Unity Android SDK"
ant $ANT_TARGET -f $ANDROID_UNITY_BUILD_FILE

echo "Creating SDK zip file"
zip -r Gameeso-Android-SDK.zip LICENSE.txt OpenKitSDK README.md samples Vendor