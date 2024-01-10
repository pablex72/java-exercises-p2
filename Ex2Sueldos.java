import java.util.Scanner;

public class Ex2Sueldos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float guillermo, juan ,luis, total;

        System.out.println("dgite guillerm");
        guillermo =  input.nextFloat();
        luis = guillermo/2;
        juan = (luis+guillermo)/2;

        total = guillermo + luis + juan;

        System.out.println("total" + total);

    }
}
