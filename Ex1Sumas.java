import java.util.Scanner;

public class Ex1Sumas {
    public static void main(String[] args) {
        //instanciar la clase scanner
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        //Guardamos las 3 ntas
        System.out.println("give 3 numbers:  ");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();

        suma = nota1 + nota2 + nota3;
        System.out.println("\n" + suma);

    }
}
