import java.util.Scanner;

public class DescendingSequenceRecursive13 {

    static String printRecursive(int n) {
        if (n < 0)
            return "";
        return n + " " + printRecursive(n - 1);
    }

    static String printIterative(int n) {
        String result = "";
        for (int i = n; i >= 0; i--) {
            result += i + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();

        System.out.println("\nRecursive Output:");
        System.out.println(printRecursive(n));

        System.out.println("Iterative Output:");
        System.out.println(printIterative(n));

        sc.close();
    }
}
