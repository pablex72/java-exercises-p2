import java.util.Scanner;

public class Ex3ConditionalsIsMayus {

    public static void main(String[] args) {

        String letra;

        Scanner intro = new Scanner(System.in);
        letra = intro.next();
        if(Character.isUpperCase(letra.charAt(0))){
            System.out.println("is uppercase");
        }
        else{
            System.out.println("is not uppercase");
        }
    }
}
