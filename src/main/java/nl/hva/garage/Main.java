/*
  <p>Garagebeheer applicatie</p>

  @author Adrian Overdijk
 * @version 1.0
 */

package nl.hva.garage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static io.javalin.plugin.json.JavalinJson.toJson;

public class Main {

    public static void main(String[] args) {
        /*
          Om de gekozen menu item te laten overeenkomen met de index van voertuigen
         */
        final int SUBKEUZE_INDEX = 1;

        File bestand = new File("src/main/bestand.json");
        ObjectMapper objectMapper = new ObjectMapper();


        Garage goedkoop = new Garage("Garage goedkoop");

        Fiets mountainbike = new Fiets("Moutainbike", 2, true);
        Fiets opoe = new Fiets("Opoe fiets", 2, true);
        opoe.kosten(50);
        Fiets eenwieler = new Fiets("eenwieler", 1, false);
        Auto opel = new Auto("Astra", 4, 4);
        Auto ferrari = new Auto("Testarossa", 4, 8);
        ferrari.kosten(200);
        Auto kia = new Auto("Picanto", 4, 3);

        List<Voertuig> voertuigen = new ArrayList<>(Arrays.asList(
                mountainbike,
                opoe,
                eenwieler,
                opel,
                ferrari,
                kia
        ));

        /*
          Toevoegen van nieuwe voertuigen in garage goedkoop
         */
        for (Voertuig v : voertuigen) {
            goedkoop.checkInVoertuig(v);
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String JSONObject = gson.toJson(voertuigen);
        System.out.println("\nConverted JSONObject ==> " + JSONObject);

        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(voertuigen);
        System.out.println("\nPretty JSONObject ==> " + prettyJson);

        try {
            objectMapper.writeValue(bestand, gson.toJson(voertuigen));
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean loop = true;

        /*
          Main menu loop
         */
        while (loop) {
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
                subKeuze -= SUBKEUZE_INDEX;
                Voertuig voertuig = voertuigen.get(subKeuze);
                voertuig.waarschuwingSignaal();
            } else if (keuze == 3) {
                System.out.println("Van welk voertuig wil je de maximum snelheid zien?\nDruk op bijbehorend getal:");
                System.out.println(goedkoop.toString());
                int subKeuze = input.nextInt();
                subKeuze -= SUBKEUZE_INDEX;
                Voertuig voertuig = voertuigen.get(subKeuze);
                System.out.println(voertuig.maxSnelheid() + " KM per uur.");
            } else if (keuze == 4) {
                System.out.println("Welk voertuig wil je uitchecken?\nDruk op bijbehorend getal:");
                System.out.println(goedkoop.toString());
                int subKeuze = input.nextInt();
                subKeuze -= SUBKEUZE_INDEX;
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
}
