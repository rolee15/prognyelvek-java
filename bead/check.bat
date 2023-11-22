@ECHO OFF

set STRUCTURE_ONLY=0
set EXTENDED_MODE=0

set PLANET_SUITE=PlanetCompulsoryTestSuite
set PLANET_STRUCTURE=PlanetCompulsoryStructureTest
set PLANTER_STRUCTURE=PlanterCompulsoryStructureTest

:Loop
IF not "%1"=="" (
    IF "%1"=="-s" SET STRUCTURE_ONLY=1
    IF "%1"=="--structure-only" SET STRUCTURE_ONLY=1
    IF "%1"=="-e" SET EXTENDED_MODE=1
    IF "%1"=="--extended" SET EXTENDED_MODE=1

    SHIFT
    GOTO :Loop
)

set SRC_PREFIX=planet/structure/
set SRC_FILES=%SRC_PREFIX%%PLANET_SUITE%.java
set PKG_PREFIX=planet.structure.
set TEST_CLASSES=-c %PKG_PREFIX%%PLANET_SUITE%
if %STRUCTURE_ONLY%==1 (
    set SRC_FILES=%SRC_PREFIX%%PLANET_STRUCTURE%.java %SRC_PREFIX%%PLANTER_STRUCTURE%.java
    set TEST_CLASSES=-c %PKG_PREFIX%%PLANET_STRUCTURE% -c %PKG_PREFIX%%PLANTER_STRUCTURE%
)

if %EXTENDED_MODE%==1 (
    set SRC_FILES=%SRC_FILES:Compulsory=Extended%
    set TEST_CLASSES=%TEST_CLASSES:Compulsory=Extended%
)

@ECHO ON
javac -cp ".;junit5all.jar;checkthat.jar" %SRC_FILES%

@ECHO OFF
if %ERRORLEVEL% GEQ 1 EXIT /B 1

@ECHO ON
java -javaagent:checkagent.jar -jar junit5all.jar execute -E junit-vintage --disable-banner -cp . -cp checkthat.jar %TEST_CLASSES%