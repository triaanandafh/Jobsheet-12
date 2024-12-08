import java.util.Scanner;
public class SummationRecursive {
    public static int sumNumbers(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        sum = n + sumNumbers(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int n;
       
        System.out.print("Input the value of n: ");
        n = input21.nextInt();
        int result= sumNumbers(n);
        System.out.println("The sum of the number from 0 to "+n + " is: "+ result);
    }
}
