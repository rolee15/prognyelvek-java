# These tests check the names/types of
# packages/classes/constructors/methods/parameters.
# They do not check how the code works.
# They do even refer to the code directly.

PROPS=${1-}
OPTS=${2-}
TARGET1=${3-time/TimeStructureTest.java}
TARGET2=${4-time.TimeStructureTest}

# Compile the tested classes separately
# if you use the structural tests but not the full suite.
# Like this but without the comment:

# javac time/Time.java

javac -cp ".:junit5all.jar:checkthat.jar" "${TARGET1}"
java ${PROPS} -javaagent:checkagent.jar -jar junit5all.jar execute ${OPTS} -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c "${TARGET2}"
