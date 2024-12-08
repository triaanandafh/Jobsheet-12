import java.util.Scanner;
public class ProvitRecursiveStudent21 {
    static double calculateProfit(double balance, int period){
        if(period == 0)
            return balance;
        else 
            return 1.11*calculateProfit(balance, period-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Balance: ");
        double initialBalance = input.nextInt();
        System.out.print("Input Investment Period: ");
        int investPeriod = input.nextInt();
        double finalBalance = calculateProfit(initialBalance, investPeriod);

        System.out.println("Balance after " + investPeriod + " year = "+ finalBalance);
    }
}
