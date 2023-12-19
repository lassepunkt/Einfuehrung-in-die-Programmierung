/**
 * Klasse zur Modellierung eines Operationssaals
 */
public class Operationssaal {
    // *** Ergaenzen Sie hier Ihre Implementierung
    private String name;
    private int raumnummer;
    private Medizingeraet[] geraete;
    
    public Operationssaal(String name, int raumnummer, Medizingeraet[] geraete) {
        this.name = name;
        this.raumnummer = raumnummer;
        this.geraete = geraete;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getRaumnummer() {
        return this.raumnummer;
    }
    
    public void zeigeGeraete() {
        for (int i = 0; i < geraete.length; i++) {
            System.out.println(geraete[i].getName()+": "+geraete[i].getTyp());
        }
    }
    
    public boolean istVollstaendig() {
        boolean bool1 = false;
        boolean bool2 = false;
        for (int i = 0; i < geraete.length; i++) {
            if (geraete[i].getTyp().equals("Patientenmonitor")) {
                bool1 = true;
            }
            if (geraete[i].getTyp().equals("Beatmungsmaschine")) {
                bool2 = true;
            }
        }
        return bool1 && bool2;
    }
}
