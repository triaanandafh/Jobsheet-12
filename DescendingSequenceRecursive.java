import java.util.Scanner;
public class DescendingSequenceRecursive {
    public static void recursiveFunction(int n){
        if(n<0){
            return;
        }
        System.out.print(n+" ");
        recursiveFunction(n-1);
    }

    public static  void iterativeFunction(int n){
        for(int i=n; i >= 0; i--){
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int n;
        System.out.print("Input the value of n: ");
        n = input21.nextInt();
        
        System.out.println("Descending sequence using recursive: ");
        recursiveFunction(n);
        System.out.println("\nDescending sequence using iteration: ");
        iterativeFunction(n);
    }
}
