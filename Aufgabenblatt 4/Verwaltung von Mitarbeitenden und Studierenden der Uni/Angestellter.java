public class Angestellter extends Person {
    private double gehalt = 24.465;
    private String abteilung = "ZUV";
    
    public Angestellter(String name, String vorname) {
        super(name, vorname);
    }
    
    public double getGehalt() {
        return this.gehalt;
    }
    
    public void setAbteilung(String bezeichnung) {
        this.abteilung = bezeichnung;
    }
    
    @Override
    public void drucken() {
        if (super.email == null) {
            System.out.println(super.getName()+", E-Mail: fehlt, Abteilung: "+this.abteilung);
        } else {
            System.out.println(super.getName()+", E-Mail: "+super.email+", Abteilung: "+this.abteilung);
        }
    }
    
    @Override
    public boolean hatUrlaub() {
        return false;
    }
}
