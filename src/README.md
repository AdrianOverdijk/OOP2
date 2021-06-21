# Garage App

Voornaam: Adrian
Achternaam: Overdijk
Studentnummer: 500863134

### Inleiding

Beheer van voertuigen in een garage.

### UML class diagram

![garageUML](/garageUML.png)  

### Voorwaarden programma

#### OOP1

##### 1. Het commando `git log --pretty=format:"%hx %ad%x09%s" --date=short` bevat inzichtelijke atomaire commits op.

```
adrian@adrians-mbp overdijk-adrian-tentamen % git log --pretty=format:"%hx %ad%x09%s" --date=short
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

Bewijs:  [terminalOutput.txt](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/terminalOutput.txt)

##### 2. Abstract class 'A' correct geïmplementeerd

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

Bewijs:  [Voertuig.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Voertuig.java)

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

Bewijs:  [Auto.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Auto.java)

##### 4. Interface correct geïmplementeerd.

```java
public interface Reparatie {
    void kosten(int bedrag);
}
```

Bewijs:  [Reparatie.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Reparatie.java)

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

Bewijs:  [Garage.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Garage.java)

##### 6. `super` keyword gebruikt voor aanroep constructor.

```java
public class Fiets extends Voertuig implements Reparatie {

    private int WIEL_SNELHEID = 25;
    private int FIETSEN_KORTING = 3;
    private boolean heeftBel;
    private int bedrag;

    public Fiets(String type, int aantalWielen, boolean heeftBel) {
        super(type, aantalWielen);
        this.heeftBel = heeftBel;
    }
}
```

Bewijs:  [Fiets.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Fiets.java)

##### 7. `super` keyword gebruikt voor aanroep methode.

```
Niet kunnen inplementeren :-(
```

Bewijs:  [NIET TOEGEPAST](https://static.freemake.com/blog/wp-content/uploads/2013/01/Awkward-Family-Photos.jpg)

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

Bewijs:  [Garage.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Garage.java)

##### 9. cast gebruikt voor gebruik van klasse-specifieke methodes.

```java
public class Garage {

    public void checkInVoertuig(Voertuig nieuweVoertuig) {
        this.voertuigen.add(nieuweVoertuig);
    }
}    

```

Bewijs:  [Garage.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Garage.java)

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

Bewijs:  [Main.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Main.java)

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

Bewijs:  [Garage.java](https://gitlab.fdmci.hva.nl/2020-2021-oop-dt/id1s1/overdijk-adrian-tentamen/-/blob/master/src/nl/overdijk/Garage.java)