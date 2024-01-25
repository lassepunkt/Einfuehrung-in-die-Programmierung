import java.util.ArrayList;

public abstract class Zug {
    
    private ArrayList<String> haltestellen;
    private String linie;
    
    public Zug(String linie, ArrayList<String> haltestellen) {
        this.haltestellen = haltestellen;
        this.linie = linie;
    }
    
    public abstract int getVermutlicheVerspaetung(String haltestelle);
    
    protected ArrayList<String> getHaltestellen() {
        return this.haltestellen;
    }
    
    public String getLinie() {
        return this.linie;
    }
    
    public void verlaengere(String haltestelle) {
        haltestellen.add(haltestelle);
    }
}
