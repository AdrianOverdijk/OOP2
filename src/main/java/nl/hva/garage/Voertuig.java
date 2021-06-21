/*
  Voertuig is de parent van Fiets en Auto, deze instanties kunnen worden opgenomen in een garage object
 */
package nl.hva.garage;

public abstract class Voertuig {
    /**
     * Type beschrijft merk van een voertuig instantie
     */
    private String type;
    private int aantalWielen;

    public Voertuig(String type, int aantalWielen) {
        this.type = type;
        this.aantalWielen = aantalWielen;
    }

    /**
     * @return geeft het aantal wielen op het voertuig
     */
    public int getAantalWielen() {
        return this.aantalWielen;
    }

    /**
     * @return geeft een maximale snelheid van het voertuig
     */
    public abstract int maxSnelheid() throws Exception;

    /**
     * @return laat de reparatiekosten zien
     */
    public abstract int reparatiekosten();

    public void waarschuwingSignaal() {
        System.out.println("Kijk uit!!!");
    }

    @Override
    public String toString() {
        return this.type;
    }
}
