# 2023/24 őszi félév, Java beadandó

## Feltételek

- A beadandó általános feltételei az előadás Canvasében, a Tematika oldalon olvashatók.
- A feladatban megadott neveket betűre pontosan úgy kell használni, ahogy meg vannak adva.
- A megoldás legyen a lehető legjobb minőségű.
  - A Java nyelv szokásos konvencióit követni kell.
  - A kód szerkezete, a változók nevei legyenek megfelelők.
- Az előadás Canvaséből letölthetők a feladathoz tartozó strukturális tesztek.
  - A *CheckThat* tesztelő szintén frissült, a feladat megoldásához a legújabb változatot kell használni. Ez, a korábbiakhoz hasonlóan, a *junit5-demo.zip* fájlban érhető el.
  - A másolandó tartalmak (importok szerkezete, futtatandó parancsok részletei) kissé megváltoztak. Ennek részleteit lásd a demó fájljaiban és a *CheckThat.txt* leírásban. Azok a részek, amelyeket módosítani kell, változatlan szerkezetűek.
- Beadás.
  - Az elkészített megoldást zip formátumba csomagolva kell feltölteni a Canvasbe.
  - A *zip* csak a megoldás forrásfájljait tartalmazza a megfelelő könyvtárstruktúrában.
  - Más fájlokat (pl. *.class*) és könyvtárakat ne tartalmazzon.
    - A megkapott tesztelő osztályokat sem kell mellékelni...
    - ... a feladat részeként elkészítetteket viszont igen!
  - A megoldás a határidőn belül többször is beadható.
    - Az utoljára beadott megoldás kerül értékelésre.
    - *A határidő éles, aki lemarad, az kimarad!*

## Alapfeladat (8 pont)

Az alapfeladat tesztjeit a *PlanetCompulsoryTestSuite* osztály tartalmazza. Az ebben leírtakat is, és a bővített feladat *PlanetExtendedTest* tesztjében leírtakat is pontosan kell követni, és JUnit tesztelővel futtatva helyes eredményt kell adniuk.

A feladatban egy képzeletbeli, űrbeli, növénytermesztő vállalat működését szimuláljuk. A vállalat számon tartja, hogy a Naprendszer melyik bolygóján hány növény található, és van egy ültető eszköze, ami mindig valamelyik bolygónál található meg. Mivel a vállalatot még csak most alapították, egyetlen fajta növényt termesztünk.

Kezdetben a Földön 100 növény érhető el, és az ültető is itt található. A többi bolygón nincsen növény.

Az osztály metódusainak működése a következő:

- *getPlantCount*: megadja, az adott bolygón hány növény van
  - Tipp: a felsorolási típusok *ordinal()* metódusát érdemes használni.
- *addPlant*: eggyel több növény lesz a megadott bolygón; az ültető átmegy erre a bolygóra
- *movePlants*: az ültető átviszi az elsőnek megadott bolygóról a megadott számú növényt a másodikra
  - Ha az első bolygón nincsen elég növény, akkor váltódjon ki *IllegalArgumentException*.
- *growPlants*: az ültető bolygóján megkétszereződik a növények száma

A *planet.test.PlanetCompulsoryTest* tesztelje a következőket a megnevezett metódusokkal.

- *init*: a Földön kezdetben 100 növény van, néhány másik bolygón 0
  - Ahol a tesztelő leírásában "néhány" megnevezés szerepel, az azt jelenti, hogy ugyanaz a tesztelő metódusnak legalább két, tetszőlegesen megválasztott elemet is ki kell próbálnia.
  - Figyelem: ugyanannak a metódusnak kell a kipróbálást elvégeznie, nem az a feladat, hogy újabb metódusokat írjunk!
- *addPlant*: ha ültetünk egy növényt, akkor a Földön 101 növény lesz, néhány másik bolygón 0
  - Itt is és a továbbiakban is feltételezhető, hogy mindig új felállással indul a tesztekben a vállalat.
- *growOnEarth*: ha megnövesztjük a növényeket, akkor a Földön 200 növény lesz, néhány másik bolygón 0
- *growMoveThenGrow*: először elvégezzük a következő szállításokat sorban: Föld→Mars 30, Föld→Neptun 20, Mars→Neptun 15, majd megnövesztjük a növényeket, akkor a Földön 50 növény lesz, a Marson 15, a Neptunon pedig 70

A feladat akkor tekinthető megoldottnak, ha minden metódus meg van valósítva, a kód jó minőségű és problémák (error/warning) nélkül lefordul és fut, és a vonatkozó strukturális és funkcionális teszteket futtató *PlanetCompulsoryTestSuite* rendben lefut.

## Bővített feladat (7 pont)

A kezdeti konfiguráció most már olyan is lehet, hogy előre meg van adva, melyik bolygón hány növény található. Az is megadható, hogy az ültető melyik bolygóról induljon. Ha nem mindegyik bolygóhoz van növényszám megadva, váltódjon ki *IllegalArgumentException*.

Az osztály új metódusainak működése a következő:

- *getPlantCounts*: az összes bolygó növényszámát adja meg
- *growPlantsByDistanceFrom*: a növények számát annyival növeli meg minden egyes bolygón, amekkora annak a távolsága a paraméterben kapottól
  - Pl. ha az adott bolygó a Neptun és a paraméter a Vénusz, akkor a távolság 6

A *planet.test.PlanetExtendedTest* tesztelje a következőket a megnevezett metódusokkal.

- *init2*: ha az *1,2,3,4,5,6,7,8* növényszámokkal indítjuk a bolygókat és megnövesztjük a növényeket, akkor *1,2,6,4,5,6,7,8* növényt kell látnunk
  - Itt az *assertArrayEquals* metódussal teszteljük az eredményt.
- *encapsulation*: az alábbi lépések végrehajtása után ismét lekérve a növények számát, *1,2,3,4,5,6,7,8* növényt kell látnunk, az átírt értékek nem jelenhetnek meg
  - a *counts* tömb az *1,2,3,4,5,6,7,8* növényszámokat tartalmazza
  - ezt átadva indítjuk a bolygókat
  - átírjuk a *counts* tömb egy elemét *100* értékre
  - lekérjük a növények számát a *counts2* változóba
  - átírjuk a *counts2* tömb egy elemét *200* értékre
- *init3*: ha az *1,2,3,4,5,6,7,8* növényszámokkal indítjuk a bolygókat úgy, hogy az ültetőt a Jupiterről indítjuk, majd megnövesztjük a növényeket, akkor *1,2,3,4,10,6,7,8* növényt kell látnunk

A tesztelőket a *PlanetFullTestSuite* fogja össze.
