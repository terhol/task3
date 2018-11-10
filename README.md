# Task 3
Second learning task from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Task description (Czech language only)

### Co je potřeba znát

Rozumět pojmům dědičnost, rozhraní, abstraktní třída.

### Popis úlohy

Úloha simuluje práci s geometrickými útvary.

### Zadání pro cvičení (3 body)

-   Vytvořte třídu `GeneralShape`, které představuje obecný geometrický
    útvar a která implementuje rozhraní `Shape`. Třída bude mít
    konstruktor, který útvaru nastaví jeho barvu a rozměry (výšku a
    šířku).
-   Vytvořte třídy `Circle` a `Rectangle`, které budou potomky třídy
    `GeneralShape`. Vhodně předefinujte zděděné metody (viz JavaDoc
    rozhraní `Shape`).
-   Třída `Circle` bude mít konstruktor se dvěma parametry: barva a
    poloměr.
-   Třída `Rectangle` bude mít konstruktor se třemi parametry: barva,
    šířka a výška. Navíc bude obsahovat metodu `boolean isSquare()`,
    která vrátí `true` pokud je výška a šířka obdélníku stejná. Podle
    toho bude také metoda `toString()` obsahovat buďto text "square",
    nebo "rectangle".
-   Vytvořte třídu `Demo` spustitelnou z příkazové řádky. V této třídě:
    -   vytvořte obecný útvar červené barvy široký 10 a vysoký 20 cm;
    -   vytvořte zelený kruh o poloměru 10 cm;
    -   vytvořte modrý obdélník o šířce 30 cm a výšce 50 cm;
    -   vytvořte hnědý obdélník o šířce 30 cm a výšce 30 cm;
    -   na std. vypište informace o těchto objektech, při správném
        řešení by se měl na výstupu objevit následující text:

            red shape
            green circle
            blue rectangle
            brown square

-   Všechny atributy budou privátní! (platí i pro domácí část).

### Zadání na doma (3 body)

-   Pro řešení této části se vám může hodit třída
    [java.lang.Math](http://download.oracle.com/javase/6/docs/api/java/lang/Math.html).
-   Upravte třídu `GeneralShape` tak, aby implementovala rozhraní
    `Measurable`, ale přitom neobsahovala kód předepsaných metod
    (univerzální algoritmus pro výpočet obvodu a obsahu neexistuje).
-   Upravte třídy `Circle` a `Rectangle` tak, aby správně implementovaly
    metody z rozhraní `Measurable`, které nebyly implementovány ve třídě
    `GeneralShape`.
-   Upravte metody `toString()` tak, aby třídy `GeneralShape`, `Circle`
    a `Rectangle` vracely řetězec podle vzoru (údaje v zobáčcích se
    nahradí hodnotami): "Perimeter: \<X\>, area: \<Y\>, color:
    \<color\>". Vyvarujte se zbytečné duplikaci kódu!
-   Ve třídě `Demo` zrušte instanciaci a práci s obecným útvarem,
    zůstane tam pouze kruh a dva obdélníky. Při správném řešení by se
    měl na výstupu objevit následující text:

        Perimeter: 62.83185307179586, area: 314.1592653589793, color: green
        Perimeter: 160.0, area: 1500.0, color: blue
        Perimeter: 120.0, area: 900.0, color: brown

-   Všechny třídy, které jste vytvořili, zdokumentujte pomocí JavaDoc.

## License
MIT