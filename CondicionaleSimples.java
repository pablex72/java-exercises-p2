import javax.swing.*;

public class CondicionaleSimples {
    public static void main(String[] args) {
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero:  "));

        if (numero==dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }

    }
}
