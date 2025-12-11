import java.util.Scanner;

public class PowerRecursive13 {
    static int calculatePower(int base, int pow) {
        if (pow==0)
            return 1;
        else return base*calculatePower(base, pow-1);
    }

    static void printSeries(int base, int pow) {
    for(int i = 0; i < pow; i++) {
        System.out.print(base + " x ");
    }
    System.out.print("1 = ");
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = sc.nextInt();
        System.out.println("Input Power Number: ");
        int power = sc.nextInt();

        printSeries(base, power);
        System.out.println(calculatePower(base, power));
        System.out.println("Result of " +base+" power "+power+" = " + calculatePower(base, power));
        sc.close();
    }
}
