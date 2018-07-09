Java Telepítése
===============

A Java egy objektumorientált programozási nyelv, amit régen a Sun, 2009 óta az
Oracle toldozgat-foldozgat. Jelenleg a 10-es verziónál tart. Igazán jelentős
változtatások az 5-ös (generics; 2004-ben) és a 8-as (lambdák, streamek;
2014-ben) verziókban történtek.

További információkat itt (is) olvashatsz:
  https://hu.wikipedia.org/wiki/Java_(programoz%C3%A1si_nyelv)

JRE vs JDK
----------

Java programok futtatásához JRE-t (Java Runtime Environment) kell telepíteni a
gépedre. Ha szeretnél Java programokat írni, akkor viszont JDK-ra (Java
Development Kit) van szükséged, ami magában foglalja a JRE-t, fordítót és más
hasznos programokat.

JDK telepítése
--------------

- Látogass el az Oracle oldalára:
  http://www.oracle.com/technetwork/java/javase/downloads/index.html
- Keress olyan DOWNLOAD gombot, ami a Java SE vagy JDK 10-es verziójára
  vonatkozik és kattints rá.
- A következő oldalon, ami nálam:
  http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html
  válaszd ki az "Accept License Agreement" radio buttont.
- Kattints a Windows-os linkre és töltsd le a telepítőt, ami nálam így néz ki:
  jdk-10.0.1_windows-x64_bin.exe
- Miután letöltötted a telepítöt, futtasd és amikor kell, nyomd meg a Next
  gombot. Ha különcködni akarsz, a telepítés helyét megváltoztathatod.

Telepítés ellenőrzése
---------------------

Nyiss egy konzolt, pl. a Start menü keresőjébe írd be:
  > cmd
Majd a konzolba írd be:
  > java -version

Valami ilyet kellene látnod:
  java version "10.0.1" 2018-04-17
  Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)
  Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.1+10, mixed mode)

A verziószámok eltérhetnek.

Majd szólj, hogy állítsuk be közösen a JAVA_HOME és a Path környezeti változókat!

Még egy apróság
---------------

A Java többé-kevésbé lompatibilis a korábbi verziókkal. Ez azt jelenti, hogy ha
van telepítve egy 10-es JRE-d (vagy JDK-d), akkor tudsz vele futtatni olyan
Java programokat, amik korábbi verzióval íródtak. Illetve, ha pl. van 10-es
JDK-d, akkor tudsz írni Java programot, ami látszólag korábbi verzióval
íródott.
