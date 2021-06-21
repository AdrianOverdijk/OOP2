/*
  Garage is een entiteit die voertuigen in zijn beheer heeft
 */
package nl.hva.garage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Garage {

    /**
     * voertuigen is een collectie van Voertuig objecten, deze staan in de garage
     * garagenaam geeft de naam van het gecreëerde garage object aan
     */
    private List<Voertuig> voertuigen;
    private String garageNaam;

    public Garage(String garageNaam) {
        this.garageNaam = garageNaam;
        this.voertuigen = new ArrayList<Voertuig>();
    }

    public Garage() {
        this.garageNaam = "Default Garage";
        this.voertuigen = new ArrayList<Voertuig>();
    }

    public List<Voertuig> listVehicles() throws IOException {
        return Garage.findAll();
    }
    public static List<Voertuig> findAll() throws IOException {
        URL url = Garage.class.getResource("/garage.json");

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader reader = objectMapper.readerFor(Garage.class);

        return reader.readValues(url).readAll(new ArrayList());
    }

    /**
     * @param nieuweVoertuig is een voertuig gecreëerd in Main, om in de garage object toe te voegen
     */
    public void checkInVoertuig(Voertuig nieuweVoertuig) {
        this.voertuigen.add(nieuweVoertuig);
    }

    /**
     * @param i is een voertuig, die verwijderd moet worden uit een garage object
     */
    public void checkUitVoertuig(int i) {
        this.voertuigen.remove(i);
    }

    /**
     * @return geeft een String terug met het aantal voertuigen die momenteel in een garage object aanwezig zijn
     */
    public String hoeveelIngechecked() {
        return String.format("%s heeft %d voertuigen ingecheckt.%n", this.garageNaam, this.voertuigen.size());
    }

    /**
     * @return geeft een selectie overzicht van de voertuigen in een garage object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Voertuig v : this.voertuigen) {
            i++;
            sb.append(String.format(" [%s] -->%s%n", i, v));
        }
        return sb.toString();
    }

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
