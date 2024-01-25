import java.util.ArrayList;
import java.util.Arrays;

public class Gueterzug extends Zug {
    
    private String ladung;
    private static String gefahrenladung = "brennstaebe";
    
    public Gueterzug(String linie, String ladung, String von, String zu) {
        super(linie, new ArrayList<>(Arrays.asList(von, zu)));
        this.ladung = ladung;
    }
    
    public static void setGefahrenladung(String name) {
        gefahrenladung = name;
    }
    
    public static String getGefahrenladung() {
        return gefahrenladung;
    }
    
    @Override
    public void verlaengere(String haltestelle) {
        
    }
    
    @Override
    public int getVermutlicheVerspaetung(String haltestelle) {
        int verspaetung = 0;
        if (haltestelle.equals(super.getHaltestellen().get(1))) {
            if (ladung.equals(gefahrenladung)) {
                verspaetung += 24*60;
            }
            if (haltestelle.equals("Gorleben")) {
                verspaetung += 24*60;
            }
        }
        return verspaetung;
    }
}
