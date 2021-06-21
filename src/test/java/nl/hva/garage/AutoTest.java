package nl.hva.garage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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