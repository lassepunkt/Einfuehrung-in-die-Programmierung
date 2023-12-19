/**
 * Klasse zur Modellierung eines Patienten
*/
abstract class Patient {
    
    // Hier Ihre Loesung einfuegen
    /**
     * Name des Patienten
     */
    private String name;
    /**
     * Krankheitsklasse des Patienten
     */
    private int krankheitsklasse;
    /**
     * Erzeugt einen Patienten
     * @param name Name des Patienten
     * @param krankheitsklasse Krankheitsklasse des Patienten
     */
    public Patient(String name, int krankheitsklasse) {
        this.name = name;
        this.krankheitsklasse = krankheitsklasse;
    }
    /**
     * Gibt den Namen des Patienten zurück
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gibt die Vergütung des Patienten zurück
     */
    public double getVerguetung() {
        switch(krankheitsklasse) {
            case 1:
                return 150;
            case 2:
                return 500;
            case 3:
                return 1000;
            default:
                return 0;
        }
    }
    
    public abstract void zeigePatient();
}
