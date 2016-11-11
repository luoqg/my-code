@echo off
echo [INFO] Package the jar in target dir.

cd %~dp0
cd ..
call mvn clean package assembly:single -DskipTests=true -Pperformance
cd bin
pause