package Cadeia01.Parte3.MelhorAlunoGeral;
public class Main {
    public static int melhoraluno(String alunos[], double media[], int faltas[], int participacao[]) {
        int indice = 0;
        for (int i = 1; i < faltas.length; i++) {
            if (media[i] > media[indice]) {
                indice = i;
            } else if (media[i] == media[indice]) {
                if (faltas[i] < faltas[indice]) {
                    indice = i;
                } else if (faltas[i] == faltas[indice]) {
                    if (participacao[i] > participacao[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] alunos = {"Lucas", "Fernanda", "Rafael", "Bruna"};
        double[] media = {8.5, 9.0, 9.0, 8.0};
        int[] faltas = {2, 1, 1, 0};
        int[] participacao = {7, 8, 6, 9};
        int indice = melhoraluno(alunos, media, faltas, participacao);
        System.out.println("------Melhor Aluno-----\nAluno: "+alunos[indice]+"\nMédia: "+media[indice]+"\nFaltas: "+faltas[indice]+"\nParticipação: "+participacao[indice]);
    }
}