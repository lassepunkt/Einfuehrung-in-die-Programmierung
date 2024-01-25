import java.util.ArrayList;

public class ICE extends Zug implements MitBordbistro {
    
    public ICE(String linie, ArrayList<String> haltestellen) {
        super(linie, haltestellen);
    }
    
    public boolean istLangstrecke() {
        return super.getHaltestellen().size() > 10;
    }
    
    public int getVermutlicheVerspaetung(String haltestelle) {
        for (int i = 0; i < super.getHaltestellen().size(); i++) {
            if (haltestelle.equals(super.getHaltestellen().get(i))) {
                return i*2;
            }
        }
        return 0;
    }
    
    public int getAnzahlSpeiseplaetze() {
        return 40;
    }
    
    public String getRestaurantSpezialitaet() {
        for (int i = 0; i < super.getHaltestellen().size(); i++) {
            if (super.getHaltestellen().get(i).equals("Lübeck")) {
                return "Marzipan";
            }
        }
        return "Brezeln";
    }
}
