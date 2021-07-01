package nl.hva.garage;

import io.javalin.http.Context;


public class VoertuigLijst {

    static public String[] alleVoertuigen = {"Auto", "Fiets"};

    public static void getAlleVoertuigen(Context context) {
        context.json(alleVoertuigen);
    }

    public static void zoekVoertuig(Context context) {
        for (var voertuig : alleVoertuigen) {
            if (voertuig.contains(context.pathParam("zoekopdracht"))) {
                context.result(voertuig);
                return;
            }
        }
        context.result("Dit voertuig is er niet!");
    }
}
