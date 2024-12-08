import java.util.Scanner;
public class PrimeCheckingRecursive {
    public static boolean isPrime(int n, int current){
        if(current == 1){
            return true;
        }

        if(n% current ==0){
            return false;
        }
        return isPrime(n, current - 1);
    }

    public static boolean isItPrimeNum(int n){
        if(n < 2){
            return false;
        }
        return isPrime(n, n - 1);
    }

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input21.nextInt();
        
        if(isItPrimeNum(n)) {
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
    }
}
