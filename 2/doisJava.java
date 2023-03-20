import javax.swing.JOptionPane;

public class doisJava {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
            int numero = Integer.parseInt(input);

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "Número maior: " + maior + "\nNúmero menor: " + menor);
    }
}
