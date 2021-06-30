package nl.hva.garage;

public class WaarschuwingError extends Exception{
    public WaarschuwingError(String errorBoodschap){
        super(errorBoodschap);
    }
}
