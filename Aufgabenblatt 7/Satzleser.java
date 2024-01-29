import java.util.Scanner;

/**
 * Assistenzklasse, die das Einlesen von ganzen Saetzen vereinfacht.
 */
public class Satzleser {
    /**
     * Liest einen Satz von der Standardeingabe ein. Der Satz wird mit
     * einem Punkt '.' beendet, allerdings koennen noch weitere Zeichen
     * hinter dem Punkt existieren.
     * @returns Der eingelesene Satz.
     */
    public static String leseSatz() {
        return new Scanner(System.in).nextLine();
    }
    
    public static void main(String[] args) {
        String satz = leseSatz();
        int wordcount = 0;
        for (int i = 1; i < satz.length(); i++) {
            if (satz.charAt(i-1) == '.') {
                break;
            }
            if (!istBuchstabe(satz.charAt(i)) && istBuchstabe(satz.charAt(i-1))) {
                wordcount++;
            }
        }
        System.out.println(wordcount);
    }
    
    public static boolean istBuchstabe(char zeichen) {
        return zeichen != ' ' && zeichen != ',' && zeichen != '.';
    }
}
