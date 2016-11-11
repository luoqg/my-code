@echo off
echo [INFO] Deploy the jar to nexus.

cd %~dp0
cd ..
call mvn clean install -Dmaven.test.skip=true
cd bin
pause