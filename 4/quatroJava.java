import javax.swing.JOptionPane;

public class quatroJava {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
            int numero = Integer.parseInt(input);
            vetor[i] = numero;
        }

        JOptionPane.showMessageDialog(null, "Valor na posição 3: " + vetor[2]);
    }
}
