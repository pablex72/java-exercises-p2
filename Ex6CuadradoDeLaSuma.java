import java.util.Scanner;

public class Ex6CuadradoDeLaSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a,b,resul;
        //(a+b)2 = a2 +b2 + 2ab
        System.out.println("introduce a");
        a = entrada.nextFloat();
        System.out.println("introduce b");
        b = entrada.nextFloat();
        resul = a*a + b*b + 2*a*b;
        System.out.println("resul"+ resul);
    }
}
