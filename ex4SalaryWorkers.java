import java.util.Scanner;

public class ex4SalaryWorkers {
    public static void main(String[] args) {

        int horasTrabajadas;
        float salarioTotal;


        Scanner intro = new Scanner(System.in);
        System.out.println("intrduce horas trabajadas");

        horasTrabajadas = intro.nextInt();

        if(horasTrabajadas<=40){
            salarioTotal = horasTrabajadas * 16;
        }
        else{

            salarioTotal = (40*16) + ((horasTrabajadas-40)*20);
        }
        System.out.println("salario total "  + salarioTotal + " $");
    }
}
