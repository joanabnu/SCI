import javax.swing.JOptionPane;

public class cincoJava {
    public static void main(String[] args) {
        int numAlunos = 3;
        int numNotas = 4;
        String[] nomes = new String[numAlunos];
        double[][] notas = new double[numAlunos][numNotas];
        double[] medias = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o nome do " + (i + 1) + "º aluno:");
            double totalNotas = 0;

            for (int j = 0; j < numNotas; j++) {
                String input = JOptionPane.showInputDialog(null, "Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ":");
                double nota = Double.parseDouble(input);
                notas[i][j] = nota;
                totalNotas += nota;
            }

            medias[i] = totalNotas / numNotas;
        }

        String resultado = "";
        int indexMaiorMedia = 0;
        int indexMenorMedia = 0;

        for (int i = 0; i < numAlunos; i++) {
            resultado += "Nome do aluno: " + nomes[i] + "\nMédia: " + medias[i] + "\n\n";
            if (medias[i] > medias[indexMaiorMedia]) {
                indexMaiorMedia = i;
            }
            if (medias[i] < medias[indexMenorMedia]) {
                indexMenorMedia = i;
            }
        }

        resultado += "Aluno com maior média: " + nomes[indexMaiorMedia] + " (Média: " + medias[indexMaiorMedia] + ")\n";
        resultado += "Aluno com menor média: " + nomes[indexMenorMedia] + " (Média: " + medias[indexMenorMedia] + ")";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
