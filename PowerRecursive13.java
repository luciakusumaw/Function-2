import java.util.Scanner;

public class PowerRecursive13 {
    static int calculatePower(int base, int pow) {
        if (pow==0)
            return 1;
        else return base*calculatePower(base, pow-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = sc.nextInt();
        System.out.println("Input Power Number: ");
        int power = sc.nextInt();

        System.out.println("Result of " +base+" power "+power+" = " + calculatePower(base, power));
        sc.close();
    }

    

}
