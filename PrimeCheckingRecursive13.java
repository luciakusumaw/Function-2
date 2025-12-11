import java.util.Scanner;

public class PrimeCheckingRecursive13 {
    static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Number: ");
        
        int n = sc.nextInt();

        if (isPrime(n, n - 1))
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");

        sc.close();
    }
    
}
