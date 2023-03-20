import javax.swing.JOptionPane;

public class tresJava {
    public static void main(String[] args) {
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");

            double totalNotas = 0;
            for (int i = 0; i < 4; i++) {
                String input = JOptionPane.showInputDialog(null, "Digite a nota " + (i + 1) + " do aluno " + nomeAluno + ":");
                double nota = Double.parseDouble(input);
                totalNotas += nota;
            }

            double media = totalNotas / 4;
            String status = media < 6 ? "Reprovado" : "Aprovado";

            JOptionPane.showMessageDialog(null, "Nome do aluno: " + nomeAluno + "\nMédia: " + media + "\nStatus: " + status);

            continuar = JOptionPane.showInputDialog(null, "Deseja continuar? Digite 'S' para continuar ou 'N' para encerrar.");
        }
    }
}
