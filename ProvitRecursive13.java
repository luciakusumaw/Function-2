import java.util.Scanner;

public class ProvitRecursive13 {
    static double calculateProfit(double balance, int period) {
        if(period==0)
            return balance;
        else
            return 1.11*calculateProfit(balance, period-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Input Investment Period: ");
        int investPeriod = sc.nextInt();

        System.out.println("Balance after " + investPeriod + " year = " + calculateProfit(initialBalance, investPeriod));
        sc.close();
    }
}
