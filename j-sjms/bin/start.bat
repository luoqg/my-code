@echo on & setlocal enabledelayedexpansion
cd ..
set LIB_JARS=""
set LIB_PATH=lib

for %%i in (!LIB_PATH!\*) do set LIB_JARS=!LIB_JARS!;%%i


if ""%1"" == ""debug"" goto debug
if ""%1"" == ""jmx"" goto jmx

#com.yineng.module.ProviderStart
#com.yineng.core.boot.ProviderStart
java -Xms64m -Xmx1024m -XX:MaxPermSize=64M -classpath %LIB_JARS%;conf com.yineng.core.boot.ProviderStart dev
goto end

:debug
java -Xms64m -Xmx1024m -XX:MaxPermSize=64M -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n -classpath conf;%LIB_JARS% com.yineng.core.boot.ProviderStart
goto end

:jmx
java -Xms64m -Xmx1024m -XX:MaxPermSize=64M -Dcom.sun.management.jmxremote.port=1099 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -classpath conf;%LIB_JARS% com.yineng.core.boot.ProviderStart

:end
pause