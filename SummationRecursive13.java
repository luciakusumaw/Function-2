import java.util.Scanner;

public class SummationRecursive13 {

    static int summation(int n) {
        if (n == 1)
            return 1;
        return n + summation(n - 1);
    }

    static String buildSeries(int n) {
        if (n == 1)
            return "1";
        return buildSeries(n - 1) + " + " + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int n = sc.nextInt();

        String series = buildSeries(n);
        int result = summation(n);

        System.out.println(series + " = " + result);
    }
}

