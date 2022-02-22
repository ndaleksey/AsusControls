#!/bin/bash
JAR_DIR=./target
JAR_NAME=asus-controls-uber-jar-with-dependencies.jar

if [ -z "$PATH_TO_FX" ]; then
  PATH_TO_FX=/opt/javafx-sdk-17.0.2/lib/
fi

java --module-path $PATH_TO_FX --add-modules "javafx.controls,javafx.fxml" -jar $JAR_DIR/$JAR_NAME
