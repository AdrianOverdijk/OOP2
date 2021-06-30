package nl.hva.garage;
import io.javalin.Javalin;

public class ShowVoertuig {
    public static void main(String[] args) {
        //Create App
        Javalin app = Javalin.create().start(8000);

        //GET request
        app.get("/", VoertuigLijst::getAlleVoertuigen);
        app.get("/:zoekopdracht", VoertuigLijst::zoekVoertuig);

        //POST request
        app.post("/",ctx -> {
            ctx.status(201);
            System.out.println("Voertuig toegevoegd.");
        });
    }
}
