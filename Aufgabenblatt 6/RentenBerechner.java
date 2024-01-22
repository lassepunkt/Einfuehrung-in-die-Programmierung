import java.util.Scanner;

public class RentenBerechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sparbetrag = scanner.nextDouble();
        int dauer = scanner.nextInt();
        double zins = scanner.nextDouble()/100;
        double kontostand = 0;
        
        for (int i = 0; i < dauer; i++) {
            kontostand += sparbetrag;
            kontostand *= 1+zins;
            kontostand = (double)Math.round(kontostand * 100)/100;
        }
        System.out.println(kontostand);
    }
}
