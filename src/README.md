# Garage App

Voornaam: Adrian
Achternaam: Overdijk
Studentnummer: 500863134

### Inleiding

Beheer van voertuigen in een garage.

### UML class diagram

![garageUML](https://github.com/AdrianOverdijk/OOP2/blob/master/src/garageUML.png)  

### Voorwaarden programma

#### OOP1

##### 1. Het commando `git log --pretty=format:"%hx %ad%x09%s" --date=short` bevat inzichtelijke atomaire commits op.

```
adrian@adrians-mbp overdijk-adrian-tentamen % git log --pretty=format:"%hx %ad%x09%s" --date=short
538e458x 2021-07-01     Update garageUML.png
866fc86x 2021-07-01     Add stream
b4ede11x 2021-06-30     Add exception class to UML
34a4238x 2021-06-30     Add assignment 5 for OOP2, custom exception is used through a try/catch construction
cea96afx 2021-06-30     Add assignment 5 for OOP2, custom exception is used through a try/catch construction
17774f4x 2021-06-30     Add assignment 4 for OOP2, custom exception is used through a throws construction
e513efdx 2021-06-30     Add assignment 3 for OOP2, add custom exception
34b5965x 2021-06-30     Add assignment 1 for OOP2, two fucntional interfaces from java.util.function
997680dx 2021-06-30     OOP1 add assignment 7, OOP2 add assignment 2
4155b45x 2021-06-30     Super keyword used for method call
0f41787x 2021-06-30     Make alleVoertuigen public
272365fx 2021-06-30     Add new classes
de49fccx 2021-06-30     Merge remote-tracking branch 'origin/master'


7914468x 2021-06-21     Add UML png
19b8a07x 2021-06-21     Add terminal output OOP1
60f6bebx 2021-06-21     Add UML diagram
564e95bx 2021-06-21     Add readme
b7a0ed7x 2021-06-21     Add exception
aa7a75ex 2021-06-21     Add exception
472a126x 2021-06-21     Create test
81391cax 2021-06-21     Add Javalin endpoints
0061e57x 2021-06-21     Create Tests
475bc65x 2021-06-21     Add Junit
31957fex 2021-06-21     Add Gson functionality
6b9aed8x 2021-06-18     Add Javalin support
15212aax 2021-06-18     Add Jackson support

a458a3ax 2021-03-29     Final cleanup
c065e31x 2021-03-29     Add comments and javadoc
d4baadbx 2021-03-29     Add comments and javadoc
8818365x 2021-03-29     Test the additions to README.md
16a1dabx 2021-03-29     Test the additions to README.md
3f96f91x 2021-03-29     Test the additions to README.md
8119c61x 2021-03-29     Add terminalOutput.txt
1df2dadx 2021-03-29     Test update, make garageUML.png show in README.md
4d1afe8x 2021-03-29     Test update
fdbd2eax 2021-03-29     Test update
10d893bx 2021-03-29     Create garageUML.png
39c5fedx 2021-03-29     Update README.md
eb3bd2cx 2021-03-29     Move UML file
d96dfa4x 2021-03-29     Add UML file
c5167bax 2021-03-29     Remove redundant methods
f163b87x 2021-03-23     Add main menu
21c518dx 2021-03-23     Fix connection with interface
d36a03cx 2021-03-23     Fix connection with interface
709a15ax 2021-03-23     Add laatKostenZien()
4b7ca03x 2021-03-23     Add checkUitVoertuigen()
96dbc5ex 2021-03-23     Add reparatie.java
5fee944x 2021-03-23     Add object builders
12b9156x 2021-03-23     Add toString override
64dd586x 2021-03-23     Add Garage.java with constructors and overrides
74dba3ex 2021-03-23     Add Auto.java with constructors and overrides
cc155cfx 2021-03-23     Add constructor and methods
0d53011x 2021-03-23     Add Fiets.java
657a392x 2021-03-23     Add constructor and methods
3f604d5x 2021-03-23     Add Voertuig.java
bf33723x 2021-03-23     Delete all, start over
1c9e55cx 2021-03-22     Move int[]bankAccounts to User.java
4e8f5b7x 2021-03-22     Add additional constructor and getters
bba13c2x 2021-03-22     Add getFullName()
3e23778x 2021-03-22     Rearrange code to Main.java
967e9f5x 2021-03-19     Add createAccount()
ebac7eax 2021-03-19     Add constructor, override viewAccount()
fcdd3c5x 2021-03-19     Create Admin.java
83c72aax 2021-03-19     Reformat code
4480d1dx 2021-03-19     Add constructor, override viewAccount()
f053055x 2021-03-19     Create Kid.java
73f1982x 2021-03-19     Add constants
9819fb6x 2021-03-19     Add constructors and get & set
291027fx 2021-03-19     Create BankAccount.java
a2dbe0cx 2021-03-19     Add constructor, override viewAccount()
fe6716bx 2021-03-19     Create Adult.java
3856bd5x 2021-03-19     Format viewAccount()
5a3f644x 2021-03-18     Make  class abstract
ccbc7a3x 2021-03-18     Make  class abstract
573ec31x 2021-03-18     Add constructor, override viewAccount()
163e429x 2021-03-18     Create Client.java
cc6c035x 2021-03-18     Add constructor and viewAccount()
11d1de4x 2021-03-18     Create User.java
a802c59x 2021-03-18     Create Main.java
6d5cf4dx 2021-02-05     Update name and student number
51e5cb6x 2021-02-05     Add more entries
218cc28x 2021-02-05     Move .gitignore to root
5eff0b4x 2021-02-05     Add entries in .gitignore
b6e6919x 2021-02-05     Initial commit
7dc6d59x 2021-02-03     Update README.md
e1d7395x 2021-02-03     Update README.md
59d09cax 2021-02-03     Initial commit
```

Bewijs:  [terminalOutput.txt](https://github.com/AdrianOverdijk/OOP2/blob/master/src/terminalOutput.txt)

##### 2. Abstract class 'A' correct ge??mplementeerd

```java
public abstract class Voertuig {

    private String type;
    private int aantalWielen;

    public Voertuig(String type, int aantalWielen){
        this.type = type;
        this.aantalWielen = aantalWielen;
    }
}
```

Bewijs:  [Voertuig.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Voertuig.java)

##### 3. Subclass implementeert abstract class

```java
public class Auto extends Voertuig implements Reparatie {

    private final int VASTE_KOSTEN_AUTO = 20;
    private int bedrag;
    private final int WIEL_SNELHEID = 10;
    private int aantalCilinders;

    public Auto(String type, int aantalWielen, int aantalCilinders) {
        super(type, aantalWielen);
        this.aantalCilinders = aantalCilinders;
    }
}
```

Bewijs:  [Auto.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Auto.java)

##### 4. Interface correct ge??mplementeerd.

```java
public interface Reparatie {
    void kosten(int bedrag);
}
```

Bewijs:  [Reparatie.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Reparatie.java)

##### 5. Er is een klasse aanwezig met minimaal twee constructors. 

```java
public class Garage {

    private ArrayList<Voertuig> voertuigen;
    private String garageNaam;

    public Garage(String garageNaam) {
        this.garageNaam = garageNaam;
        this.voertuigen = new ArrayList<Voertuig>();
    }

    public Garage() {
        this.garageNaam = "Default Garage";
        this.voertuigen = new ArrayList<Voertuig>();
    }
}
```

Bewijs:  [Garage.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Garage.java)

##### 6. `super` keyword gebruikt voor aanroep constructor.

```java
public class Fiets extends Voertuig implements Reparatie {

    private int WIEL_SNELHEID = 25;
    private int FIETSEN_KORTING = 3;
    private boolean heeftBel;
    private int bedrag;

    public Fiets(String type, int aantalWielen, boolean heeftBel) {
        super(type, aantalWielen);
        super.waarschuwingSignaal();
        this.heeftBel = heeftBel;
    }
}
```

Bewijs:  [Fiets.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Fiets.java)

##### 7. `super` keyword gebruikt voor aanroep methode.

```java
    public Fiets(String type, int aantalWielen, boolean heeftBel) {
        super(type, aantalWielen);
        super.waarschuwingSignaal();
        this.heeftBel = heeftBel;
    }
```

Bewijs:  [Fiets.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Fiets.java)

##### 8. `instanceof` aangetoond

```java
public class Garage {
    
    public void laatKostenZien() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Kosten voor de verschillende voertuigen:%n"));
        for (Voertuig v : this.voertuigen) {
            if (v instanceof Fiets) {
                sb.append(String.format("%s: %s euro --> kosten minus korting%n", v, v.reparatiekosten()));
            } else {
                sb.append(String.format("%s: %s euro --> kosten plus heffing%n", v, v.reparatiekosten()));
            }
        }
        System.out.println(sb.toString());
    }
}        
```

Bewijs:  [Garage.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Garage.java)

##### 9. cast gebruikt voor gebruik van klasse-specifieke methodes.

```java
public class Garage {

    public void checkInVoertuig(Voertuig nieuweVoertuig) {
        this.voertuigen.add(nieuweVoertuig);
    }
}    

```

Bewijs:  [Garage.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Garage.java)

##### 10. Er is testcode aanwezig om de punten hierboven te demonstreren. (Als je ook OOP2 doet: gebruik testcode-voorwaarden van OOP2).

```java

public class Main {
    
    boolean loop = true;

        while(loop){
        System.out.println("\t\t\t*** HOOFD MENU ***\nDruk [1] om te zien hoeveel voertuigen zijn ingecheckt.");
        System.out.println("Druk [2] om de waarschuwingssignalen te beluisteren.");
        System.out.println("Druk [3] om de maximale snelheden te bekijken.");
        System.out.println("Druk [4] om voertuigen uit te checken.");
        System.out.println("Druk [5] om de kosten van de verschillende voertuigen te bekijken.");
        System.out.println("Druk [6] om het programma te verlaten.");
        Scanner input = new Scanner(System.in);
        int keuze = input.nextInt();
        if (keuze == 1) {
            System.out.println(goedkoop.hoeveelIngechecked());
        } else if (keuze == 2) {
            System.out.println("Van welk voertuig wil je het geluid horen?\nDruk op bijbehorend getal:");
            System.out.println(goedkoop.toString());
            int subKeuze = input.nextInt();
            subKeuze -= 1;
            Voertuig voertuig = voertuigen.get(subKeuze);
            voertuig.waarschuwingSignaal();
        } else if (keuze == 3) {
            System.out.println("Van welk voertuig wil je de maximum snelheid zien?\nDruk op bijbehorend getal:");
            System.out.println(goedkoop.toString());
            int subKeuze = input.nextInt();
            subKeuze -= 1;
            Voertuig voertuig = voertuigen.get(subKeuze);
            System.out.println(voertuig.maxSnelheid() + " KM per uur.");
        } else if (keuze == 4) {
            System.out.println("Welk voertuig wil je uitchecken?\nDruk op bijbehorend getal:");
            System.out.println(goedkoop.toString());
            int subKeuze = input.nextInt();
            subKeuze -= 1;
            Voertuig voertuig = voertuigen.get(subKeuze);
            goedkoop.checkUitVoertuig(subKeuze);
        } else if (keuze == 5) {
            goedkoop.laatKostenZien();
        } else if (keuze == 6) {
            System.out.println("Tot ziens......");
            loop = false;
        } else {
            System.out.println("\tVERKEERDE INVOER, PROBEER NOGMAALS\n\n");
        }
    }
}
```

Bewijs:  [Main.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Main.java)

##### 11. Classes en methodes zijn voldoen aan HBO-ICT coding standards.

```java
public class Garage{
    /**
     * geeft een String, die de kosten laat zien van de voertuigen in het garage object
     */
    public void laatKostenZien() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Kosten voor de verschillende voertuigen:%n"));

        //Er vindt een controle plaats of de voertuigen instanties van het type fiets of auto is
        for (Voertuig v : this.voertuigen) {
            if (v instanceof Fiets) {
                sb.append(String.format("%s: %s euro --> kosten minus korting%n", v, v.reparatiekosten()));
            } else {
                sb.append(String.format("%s: %s euro --> kosten plus heffing%n", v, v.reparatiekosten()));
            }
        }
        System.out.println(sb.toString());
    }
}  
```

Bewijs:  [Garage.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Garage.java)

Naast de OOP1 voorwaarden dient je OOP2 programma aan de volgende voorwaarden te voldoen:

##### 1. Gebruikt en implementeert minimaal 2 functionele interfaces uit de package `java.util.function`
```java
        // Welkomsboodschap met een methode als lambda, met fuctional interface uit java.util.function
        UnaryOperator<String> welkomsBoodschap = "   Hallo, "::concat;
        System.out.println(welkomsBoodschap.apply("Gebruiker 1"));

        // App titel gecreeerd met java.util.function.Supplier
        Supplier<String> s = ()-> "   Dit is Garage App 2000!";
        System.out.println(s.get());
```

Bewijs:  [Main.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Main.java)

##### 2. Een classe met 2 endpoints (d.m.v. Javalin framework)

1. GET request waarbij er data uit een tekstbestand wordt gelezen en terug gestuurd.
2. POST request waarbij er data wordt weggeschreven naar een tekstbestand.
```java
        //Create App
        Javalin app = Javalin.create().start(8000);

                //GET request
                app.get("/", VoertuigLijst::getAlleVoertuigen);
                app.get("/:zoekopdracht", VoertuigLijst::zoekVoertuig);

```

Bewijs:  [ShowVoertuig.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/ShowVoertuig.java)

```java
        //POST request
        app.post("/",ctx -> {
                ctx.status(201);
                System.out.println("Voertuig toegevoegd.");
                });
```

Bewijs:  [ShowVoertuig.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/ShowVoertuig.java)

##### 3. Een custom Exception "E" gedefini??erd.

```java
public class WaarschuwingError extends Exception{
    public WaarschuwingError(String errorBoodschap){
        super(errorBoodschap);
    }
}
```

Bewijs:  [WaarschuwingError.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/WaarschuwingError.java)

##### 4. Custom Exception "E" wordt gebruikt via een `throws` constructie.

```java
    public int maxSnelheid() throws Exception {
        int wielen = getAantalWielen();
        if(wielen == 0){
        throw new WaarschuwingError("Een auto moet wielen hebben.");
        }
        return wielen * WIEL_SNELHEID * aantalCilinders;
        }
```

Bewijs:  [Auto.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Auto.java)

##### 5. Custom Exception "E" wordt gebruikt via een `catch` constructie

```java
        try {
        if(wielen != 0){
        return wielen * WIEL_SNELHEID;
        }
        }catch (WaarschuwingError e){
        if(wielen == 0){
        throw new WaarschuwingError("Een fiets moet wielen hebben")}
        }
        return wielen * WIEL_SNELHEID;
        }
```

Bewijs:  [Fiets.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Fiets.java)

##### 6. Minimaal 1 `intermediate operation` op een stream

```java
.filter(vehicles -> vehicles.contains(opoe))
```

Bewijs:  [Main.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Main.java)

##### 7. Minimaal 1 `terminal operation` op een stream

```java
.forEach(vehicles -> System.out.println(vehicles));
```

Bewijs:  [Main.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/main/java/nl/hva/garage/Main.java)

##### 8. Unit tests met minimaal 60% code coverage (getters en setters tellen niet mee)

```java
class AutoTest {

    @Test
    void bij_geen_cylinders_geef_een_error() {
        Auto kadet = new Auto("kadet", 4, 4);
        kadet.setAantalCilinders(0);

        int actual = 4;
        Assertions.assertEquals(kadet.getAantalCilinders(), actual);

    }

    @Test
    void klopt_de_berekening_van_maximale_snelheid() throws Exception {
        Auto kadet = new Auto("kadet", 4, 4);

        int actual = 160;
        Assertions.assertEquals(kadet.maxSnelheid(), actual);
    }


    @Test
    void repartiekosten_moet_goed_zijn() {
        Auto kadet = new Auto("kadet", 4, 4);
        kadet.kosten(50);

        int actual = 120;
        Assertions.assertEquals(kadet.reparatiekosten(), actual);
    }
}
```

Bewijs:  [AutoTest.java](https://github.com/AdrianOverdijk/OOP2/tree/master/src/test/java/nl/hva/garage/AutoTest.java)

