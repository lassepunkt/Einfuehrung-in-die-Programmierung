public class Sensor extends Medizingeraet {
    private int messwert;
    
    public Sensor(String hersteller, int alarmSchwellwert) {
        super(hersteller, alarmSchwellwert);
    }
    
    private void messen() {
        this.messwert = rand.nextInt(100);
    }
    
    @Override
    public void ueberpruefeAlarm() {
        if (!super.istEingeschaltet) {
            System.out.println("Geraet ist ausgeschaltet!");
        } else {
            this.messen();
            if (this.messwert > super.alarmSchwellwert) {
                System.out.println("Alarm! Messwert uebersteigt Schwellwert.");
            } else {
                System.out.println("Messwert ist in Ordnung.");
            }
        }
    }
}
