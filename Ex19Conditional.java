import javax.swing.*;

public class Ex19Conditional {

    /*
    sentencia switch

    switch(dato){
        case 1: Instrucciones1;
                break;
        case 2: Instrucciones2;
                break;

        default: casoCOntrario;
                break;
                    }
     */
    // hacer un programa que muestre si es multiplo de 10
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "el numero"+ numero + "es multiplo de 10"
            );
                    }
        else{
            JOptionPane.showMessageDialog(null,"no es multiplo de 10");

        }
    }
}
