import java.util.Scanner;

public class ex5EvenOrOdd {
    public static void main(String[] args) {
        int num1, num2;

        Scanner intro = new Scanner(System.in);

        System.out.println("intro first number ");
        num1  = intro.nextInt();

        System.out.println("intro sec number ");
        num2  = intro.nextInt();

        if (num1%2==0){
            System.out.println("num1 is even");
        }
        else{
            System.out.println("num1 is odd");
        }
    }
}
