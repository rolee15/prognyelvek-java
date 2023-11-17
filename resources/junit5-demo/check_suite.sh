PROPS=${1-}
OPTS=${2-}
TARGET1=${3-time/TimeTestSuite.java}
TARGET2=${4-time.TimeTestSuite}

javac -cp ".:junit5all.jar:checkthat.jar" "${TARGET1}"
java ${PROPS} -javaagent:checkagent.jar -jar junit5all.jar execute ${OPTS} -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c "${TARGET2}"
