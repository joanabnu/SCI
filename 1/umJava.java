import javax.swing.JOptionPane;
import java.util.ArrayList;

public class umJava {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
            int numero = Integer.parseInt(input);
            total += numero;

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        double media = (double) total / 5;

        JOptionPane.showMessageDialog(null, "Números pares: " + pares.toString() +
                "\nNúmeros ímpares: " + impares.toString() +
                "\nMédia geral: " + media);
    }
}
