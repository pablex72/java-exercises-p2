import java.util.Scanner;

public class Ex7Ordenar3Numeros {
    /*
    de mayor --> menor
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner intro = new Scanner(System.in);

        n1 = intro.nextInt();
        n2 = intro.nextInt();
        n3 = intro.nextInt();

        if((n1>n2) && (n1>n3)){
            System.out.println(n1 + " "  + n2 + " " + n3);
        }
        else if((n1>n3) && (n3>n2)){
            System.out.println(n1 + " "  + n3 + " " + n2);
        }
        else if((n2>n1) && (n1>n3)){
            System.out.println(n2 + " "  + n1 + " " + n3);
        }
        else if((n2>n3) && (n3>n1)){
            System.out.println(n2 + " "  + n3 + " " + n1);
        }
        else if((n3>n1) && (n1>n2)){
            System.out.println(n3 + " "  + n1 + " " + n2);
        }
        else {
            System.out.println(n3 + " "  + n2 + " " + n1);
        }
    }
}
