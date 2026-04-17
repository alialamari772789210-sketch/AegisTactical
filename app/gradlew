#!/bin/sh

# Aegis Tactical - Android Build Wrapper
# Copyright (c) 2026 Sovereign System

case "$(uname)" in
  CYGWIN* | mingw* | MSYS*)
    sep=';'
    ;;
  *)
    sep=':'
    ;;
esac

# تحديد مكان المحرك
CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar

# إعطاء أمر التنفيذ
exec java -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
