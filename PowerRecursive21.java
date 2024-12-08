import java.util.Scanner;
public class PowerRecursive21 {
    static int calculatePower(int base, int pow){
        if(pow==0){
            System.out.print("x1");
            return 1;
        }else{
            System.out.print(base);
            if(pow > 1){
                System.out.print("x");
            }
            return base*calculatePower(base, pow-1);
    }
        }
            
public static void main(String[] args) {
    Scanner input21 = new Scanner(System.in);
    System.out.print("Input Base Number: ");
    int base = input21.nextInt();
    System.out.print("Input Power Number: ");
    int power = input21.nextInt();

    System.out.println("Calculation series: ");
    int result = calculatePower(base, power);
    System.out.println(" = "+ result);
}
}
