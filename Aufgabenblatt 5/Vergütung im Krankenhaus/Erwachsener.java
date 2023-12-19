/**
 * Klasse zur Modellierung eines Erwachsenen
 */
class Erwachsener extends Patient {
    /**
     * Erzeugt einen Erwachsenen
     * @param name Name des Patienten
     * @param krankheitsklasse Krankheitsklasse des Patienten
     */
    public Erwachsener(String name, int krankheitsklasse) {
        super(name, krankheitsklasse);
    }
    /**
     * Gibt den Namen und den Typ (Erwachsener) des Patienten aus
     */
    @Override
    public void zeigePatient() {
        System.out.println(super.getName()+" (Erwachsener)");
    }
}
