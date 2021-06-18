/*
  Auto is een entiteit die kan worden opgenomen in een garage object
 */
package nl.hva.garage;

public class Auto extends nl.hva.garage.Voertuig implements nl.hva.garage.Reparatie {
    /**
     * Met WIEL_SNELHEID en aantal cilinders wordt de maximale snelheid berekend
     * Met bedrag en VASTE_KOSTEN_AUTO wordt de reparatiekosten berekend
     */
    private final int VASTE_KOSTEN_AUTO = 20;
    private int bedrag;
    private final int WIEL_SNELHEID = 10;
    private int aantalCilinders;

    public Auto(String type, int aantalWielen, int aantalCilinders) {
        super(type, aantalWielen);
        this.aantalCilinders = aantalCilinders;
    }

    /**
     * @return geeft de maximale snelheid van de auto terug
     */
    @Override
    public int maxSnelheid() {
        int wielen = getAantalWielen();
        return wielen * WIEL_SNELHEID * aantalCilinders;
    }

    /**
     * laat de toeter horen
     */
    @Override
    public void waarschuwingSignaal() {
        System.out.println("Toet toet");
    }

    /**
     * @param bedrag kosten die kunnen worden ingevoerd om de reparatiekosten te berekenen
     * set this.bedrag
     */
    public void kosten(int bedrag) {
        this.bedrag = bedrag;
    }

    /**
     * @return geeft de totale reparatiekosten terug
     */
    public int reparatiekosten() {
        return this.bedrag += (bedrag + VASTE_KOSTEN_AUTO);
    }
}
