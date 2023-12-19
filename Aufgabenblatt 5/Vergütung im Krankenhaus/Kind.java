/**
 * Klasse zur Modellierung eines Kindes
 */
class Kind extends Patient {
    /**
     * Alter des Patienten
     */
    private int alter;
    /**
     * Erzeugt ein Kind
     * @param name Name des Patienten
     * @param krankheitsklasse Krankheitsklasse des Patienten
     * @param alter Alter des Patiente
     */
    public Kind(String name, int krankheitsklasse, int alter) {
        super(name, krankheitsklasse);
        this.alter = alter;
    }
    /**
     * Gibt die Vergütung des Patienten zurück
     */
    @Override
    public double getVerguetung() {
        return super.getVerguetung()*1.25;
    }
    /**
     * Gibt den Namen, den Typ (Kind) und das Alter des Patienten aus
     */
    public void zeigePatient() {
        System.out.println(super.getName()+" (Kind, "+this.alter+" Jahre)");
    }
}
