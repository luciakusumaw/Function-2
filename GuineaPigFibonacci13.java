import java.util.Scanner;

public class GuineaPigFibonacci13 {

    static int fib(int n) {
        if (n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input month: "); 
        int month = sc.nextInt();
        System.out.println("Total pairs at month " + month + " = " + fib(month));
    }
}

