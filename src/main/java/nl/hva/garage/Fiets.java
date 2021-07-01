/*
  Fiets is een entiteit die kan worden opgenomen in een garage object
 */

package nl.hva.garage;

public class Fiets extends nl.hva.garage.Voertuig implements nl.hva.garage.Reparatie {

    private int WIEL_SNELHEID = 25;
    private int FIETSEN_KORTING = 3;
    private boolean heeftBel;
    private int bedrag;

    public Fiets(String type, int aantalWielen, boolean heeftBel) {
        super(type, aantalWielen);
        super.waarschuwingSignaal();
        this.heeftBel = heeftBel;
    }

    /**
     * @return geeft de maximale snelheid van de fiets terug
     */
    @Override
    public int maxSnelheid() throws Exception {
        int wielen = getAantalWielen();
        try {
            if (wielen != 0) {
                return wielen * WIEL_SNELHEID;
            }
        } catch (Exception e) {
            if (wielen == 0) {
                throw new WaarschuwingError("Een fiets moet wielen hebben");
            }
        }
        return wielen * WIEL_SNELHEID;
    }

    /**
     * laat de bel horen, als die aanwezig is
     */
    @Override
    public void waarschuwingSignaal() {
        if (!this.heeftBel) {
            System.out.println("Kijk uit!!!");
        } else System.out.println("Tring tring!!");
    }

    /**
     * @param bedrag kosten die kunnen worden ingevoerd om de reparatiekosten te berekenen
     *               set this.bedrag
     */
    public void kosten(int bedrag) {
        this.bedrag = bedrag;
    }

    /**
     * @return geeft de totale reparatiekosten terug
     */
    public int reparatiekosten() {
        return this.bedrag += (bedrag + FIETSEN_KORTING);
    }
}
