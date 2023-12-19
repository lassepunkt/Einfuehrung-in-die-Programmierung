import java.util.ArrayList;

public class Weihnachtswald {
    private ArrayList<Weihnachtsbaum> liste;
    
    public Weihnachtswald() {
        this.liste = new ArrayList<Weihnachtsbaum>();
    }
    public void pflanze(int hoehe) {
        liste.add(new Weihnachtsbaum(hoehe));
    }
    
    public void zeichne() {
        for (int i = 0; i < liste.size(); i++) {
            liste.get(i).zeichne();
        }
    }
}
