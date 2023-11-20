@ECHO OFF
set TARGET1="%~1"
set TARGET2="%~2"
@ECHO ON

javac -cp ".;junit5all.jar;checkthat.jar" %TARGET1%
java -javaagent:checkagent.jar -jar junit5all.jar execute -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c %TARGET2%
