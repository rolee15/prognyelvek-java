@ECHO OFF
set PROPS=%~1
set OPTS=%~2
set TARGET1="time\TimeTestSuite.java"
set TARGET2="time.TimeTestSuite"
if not "%~3"=="" (
    set TARGET1="%~3"
    set TARGET2="%~4"
)
@ECHO ON

javac -cp ".;junit5all.jar;checkthat.jar" %TARGET1%
java %PROPS% -javaagent:checkagent.jar -jar junit5all.jar execute %OPTS% -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c %TARGET2%
