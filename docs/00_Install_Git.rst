GIT Telepítése
==============

Népszerű, valóban jó és ingyenes verziókezelő rendszer. Arra jó, hogy segít
váltogatni a verziókat (pillanatok alatt vissza tudsz ugrani korábbi verziókra),
verziókat össze tudsz vonni, meg tudod osztani velem a munkád és még legalább
1000 más feladat ellátására képes. Neked a Git kliensére lesz szükséged:
- Megynyitod a letöltő oldalt:
  https://git-scm.com/downloads
- A "Downloads" alatt rákattintasz a "Windows" feliratra és letöltöd a
  telepítőt.
- A telepítő fájl neve nálam "Git-2.18.0-64-bit.exe", de a verziószám változik
  időnként.
- Futtasd a telepítőt, többnyire csak a Next gombot kell nyomkodni, de ízlés
  szerint pár dolgot átállíthatsz:
  - "Adjust your PATH environment" ablakban:
    "Use Git and optional Unix tools from the Windows Command Prompt"
  - "Configuring the line ending conversions" ablakban:
    "Checkout as-is, commit as-is"
  - "Configuring the terminal emulator to use with Git Bask" ablakban:
    "Use Windows' default console window"
- Az asztalodon megjelent a "Git Bash" ikon, arra kattints rá kétszer, hogy
  elinduljon.

Clone-ozd le magadhoz a közös reponkat, amibe majd dolgozni fogunk:
- Készíts valahol a gépeden egy könyvtárat, ahova majd a Git repodat fogod
  tenni (a repo vagy leánykori nevén repository egy tárhely, ahol a munkádat
  tartod). Tetszőleges helyre teheted, de érdemes könnyen elérhető helyet
  választani neki. Nálam pl. itt van (a pwd parancs mondja meg Linuxban, hogy
  melyik könyvtárban vagy):
  > pwd
  > /F/GIT/Kata
- A már megnyitott "Git Bash"-ben navigálj el ebbe a könyvtárba, nálam:
  > cd F:/GIT/Kata
- A sor elejéről a nagyobb-kisebb jelet nem kell beírni a Git Bash-be. :)
  Az F meghajtóra hivatkozás a Windows-Linux kavarodás miatt kell. A Git Bash
  azt hiszi magáról, hogy ő egy Linux. Ha elmész a root könyvtárba, akkor ott
  egy Linux fájlrendszer szerű valamit fogsz találni:
  > cd /
  > ls -l
  A "cd F:" paranccsal jutsz el valamilyen mágikus módon a Linux-ból a Windows
  fájlrendszer F: meghajtójára (ha egyáltalán van ilyened; ha nincs akkor
  navigálj pl. a C: maghajtóra: "cd C:").
- Ott tartottunk, hogy elnavigálsz az új könyvtáradba:
  > cd F:/GIT/Kata
- Kiadod a következő parancsot, hogy megszerezd a közös reponk tartalmát, amibe
  majd dolgozni fogunk:
  > git clone https://github.com/askuta/KATA.git
- Egy rövid ideig írkál mindenféle furákat, utána megjelenik egy KATA nevű
  könyvtár, benne fájlokkal és könyvtárakkal:
  > cd KATA
  > pwd
  > /F/GIT/Kata/KATA

Itt találsz egy interaktív Git tutorialt:
  https://learngitbranching.js.org/

Itt pedig megtalálod a Git talán legjobb leírását, amíből egyelőre nem sokat
értenél meg, de mentsd el a linket későbbi használatra:
  https://git-scm.com/book/en/v2
