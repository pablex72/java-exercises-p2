import java.util.Scanner;

public class Ex2Conditional {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);

        System.out.println("introduce first number");
        num1 = input.nextInt();

        System.out.println("introduce second number");
        num2 = input.nextInt();

        if(num1>num2){
            System.out.println("first number es greater than second");
        }
        else{
            System.out.println("second is greater or are equals");
        }
    }
}
