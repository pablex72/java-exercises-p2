import java.util.Scanner;

public class Ex17SemanasHoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;

        System.out.println("digitte el numero total de horas");
        horasTotales = entrada.nextInt();
        //1semana = 7*24 = 168 horas
        semanas = horasTotales/168;
        //lo que sobra de la division
        dias = horasTotales%168/24;
        horas = horasTotales%168%24;

        System.out.println("semanas"+semanas);
        System.out.println("dias"+dias);
        System.out.println("horas"+horas);

    }
}
