import java.util.Scanner;

public class ex16CalificacionPorStudent {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, priEx, segEx, finEx, notaFinal;

        System.out.println("digite nota de participacion");
        participacion = entrada.nextFloat();

        System.out.println("digite nota de primer examen");
        priEx = entrada.nextFloat();

        System.out.println("digite nota de seg examen");
        segEx = entrada.nextFloat();

        System.out.println("digite nota de FINAL");
        finEx = entrada.nextFloat();

        participacion *=0.1f;
        priEx *= 0.25f;
        segEx *= 0.25f;
        finEx *= 0.40f;

        notaFinal = participacion + priEx + segEx +finEx;

        System.out.println("notaFinal" + notaFinal);

    }
}
