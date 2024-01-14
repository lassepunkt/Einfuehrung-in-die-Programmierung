public class Gummiwuerfel implements Produkt {
    private double breite;
	private double laenge;
	private double hoehe;
	private double pressfaktor;
    
    public Gummiwuerfel(double laenge) {
        this.breite = laenge;
        this.laenge = laenge;
        this.hoehe = laenge;
    }
    
    public void druecke(double pressfaktor) {
        this.pressfaktor += pressfaktor;
        for (; this.pressfaktor >= 5; this.pressfaktor -= 5) {
            this.hoehe *= 0.5;
        }
    }
    
    public void print() {
        System.out.format("Gummiwürfel: %.2fx%.2fx%.2f\n", laenge, breite, hoehe);
    }
}
