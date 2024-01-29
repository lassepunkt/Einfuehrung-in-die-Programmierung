import java.util.Scanner;

public class FibonacciBerechner {
    public long fibonacci(int n) {
        // *** Fuegen Sie hier Ihre Implementierung ein.    
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long r = new FibonacciBerechner().fibonacci(n);
        System.out.println(r);
    }
}
