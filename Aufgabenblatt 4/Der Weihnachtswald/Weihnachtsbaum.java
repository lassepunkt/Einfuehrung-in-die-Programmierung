public class Weihnachtsbaum {
    private int hoehe;
    private int breite;
    private int laengeQuadrat;
    
    public Weihnachtsbaum(int hoehe) {
        this.hoehe = hoehe;
        this.breite = 2*(this.hoehe-1) + 1;
        this.laengeQuadrat = 2*(int)((hoehe)/4)+1;
    }
    public void zeichne() {
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < ((hoehe-i)-1); j++) {
                System.out.print(".");
            }
            for (int j = 0; j < (2*i+1); j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < laengeQuadrat; i++) {
            for (int j = 0; j < ((breite-laengeQuadrat)/2); j++) {
                System.out.print(".");
            }
            for (int j = 0; j < laengeQuadrat; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
