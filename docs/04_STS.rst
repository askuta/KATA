STS
===

Elvileg mostanra telepítve van nálad az STS. Ha nincs, akkor menj végig az
előző leíráson: "03_Install_Eclipse.rst"

Workspace és Project Location
-----------------------------

A workspace egy könyvtár, ami az Eclipse-nek kedves (az STS egy felokosított
Eclipse, ne ess kétségbe, ha keverem a nevüket). Lehetnek bennek projektek (mi
másképp csinlájuk, de igen, egy workspaceben több projekt is lehet), vannak
benne olyan konfigurációs fájlok, amik a workspace projektjeire vonatkoznak és
vannak benne olyan konfigurációs fájlok, amik magára az Eclipse-re vonatkoznak.

Ha akarod, lehet több workspace-ed és az Eclipse lehetővé teszi, hogy tetszésed
szerint váltogass közöttük.

Ha nagyon akarnánk, tarthatnánk a projektjeinket egy workspaceben, amit Git-tel
verziókezelnénk. Ehelyett azt csináljuk, hogy a projekteket a Git-es mappa
alatt tartjuk valahol, a workspace pedig a Git-es mappán kívül lesz valahol.
Nálam így néz ki (nálad lehet másképp is, csak ne kerüljön a workspace a Git
alá):
  - F:\GIT\Kata\KATA\
  - F:\GIT\Kata\WS\

Készíts valahova a Git-en kívülre egy "WS" könyvtárat, arra figyelj, hogy ne
legyen szóköz az elérési útvonalában!

Ha olyan projekteket készítesz, amiket önző módon nem szeretnél megosztani
velem, nyugodtan teheted őket a "WS" könyvtárba. Az Eclipse alapból ezt ajánlja
fel.

Az STS elsõ indítása
--------------------

Kétszer rákattintasz az "STS.exe" fájlra (mostanra kint kellene lennie az
asztalodon) és már indul is. Elõször kéri a Workspacet, add meg neki a "WS"
könyvtárat, amiről a "Workspace és Project Location" fejezetben írtam.

A legelsõ indulás után bejön a "Welcome" oldal, amit nyugodtan bezárhatsz. Ha
késõbb meg akarod nézni, akkor "Help" --> "Welcome".

Állítsuk be a JDK: Nyisd meg a "Windows" --> "Preferences" oldalt. A bal oldalon
keresd meg a "Java" --> "Installed JREs"-t. Jobbról nyomd meg az "Add" gombot.
Válaszd ki a "Standard VM"-et, nyomd le a "Next" gombot. Keresd meg a
"JRE Home"-ot (figyelj, hogy a JDK-t add meg, ne a JRE-t, ami nálam:
"C:\Program Files\Java\jdk-10.0.1\") és nyomd le a "Finish" gombot. Kattintsd
be a JDK sorát és nyomj "Apply and Close"-t. Mostantól az összes projekt ami
ehhez a Workspacehez tartozik, alapértelmezetten a JDK-t kellene hogy használja.

Projekt importálása
-------------------

Ezt kellene csinálnod azokkal a projektekkel, amiket én tettem fel GIT-be:

- "File" --> "Import"
- "General" --> "Existing project into Workspace"
- a "Select root directory:"-nál keresd meg a Git-es könyvtár alatt a
  projektet, pl. nálam: "F:\GIT\Kata\KATA\projects\001_JavaBases\"
- miután becsekkoltad a projekt checkbox-szát, "Finish"

Projekt létrehozása
-------------------

Ha új projektet akarsz készíteni, amit velem is megosztanál, akkor:

- "File" --> "New" --> "Java Project"
- adj meg egy szép projektnevet, mint pl. "001_JavaBases" (ha még nincs ilyen)
- távolítsd el a pipát a "Use default location"-rõl (ez csak azért kell, mert
  nekünk külön van a workspace)
- keresd meg a projekt helyét GIT alatt "...\JAVA_BASES\programs\"
- "JRE"-nek állítsd be a "Use default JRE (currently 'jdk-10.0.1')"-t
  (lehet, hogy nálad más lesz a verziószám)
- "Finish"

Program futtatása Eclipse-ben
-----------------------------

- a baloldalon megkeresed a futtatandó projektet ("001_JavaBases")
- ha kell (általában nem kell, mert általában csak egy "main" metódust hozunk
  létre egy projekten belül, amit az Eclipse magától is képes megtalálni),
  addig nyitogatod szét, amíg megtalálod a "HelloWorld.java" fájlt
  (azért pont ezt, mert ebben van a "main" matódus, ami a Java programok
  indítási pontja)
- rákattintasz jobb gombbal
- "Run As" --> "Java Application"
- ha erre rákattintasz, akkor el kellene indulni a programnak és ki kellene
  írnia, hogy "Hello World!"

Az Eclipse érzékelni fogja, ha még nem volt lefordítva a projekt vagy
megváltozott a legutolsó fordítás óta és újra fordítja indítás elõtt. Mondtam,
hogy okos termék! :)
