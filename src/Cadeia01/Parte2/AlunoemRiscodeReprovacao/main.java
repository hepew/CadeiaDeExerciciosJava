package Cadeia01.Parte2.AlunoemRiscodeReprovacao;
public class main {
    public static int alunoemrisco(String alunos[], double nota1[], double nota2[], int faltas[]){
        int indice = -1;
        for(int i = 0; i < faltas.length; i++){
            double media = (nota1[i] + nota2[i]) /2.0;
            if(media >= 6){
                continue;
            }
            if(indice == -1){
                indice = i;
                continue;
            }
            double mediacam = (nota1[indice] + nota2[indice]) /2.0;
            if(media < mediacam){
                indice = i;
            }else if(media == mediacam){
                if(faltas[i] > faltas[indice]){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] alunos = {"Lucas", "Fernanda", "Rafael", "Bruna", "Camila"};
        double[] nota1 = {8.0, 4.0, 6.0, 7.5, 4.0};
        double[] nota2 = {7.0, 5.0, 5.0, 8.0, 3.0};
        int[] faltas = {2, 10, 3, 0, 15};
        int indice = alunoemrisco(alunos, nota1, nota2, faltas);

        if(indice == -1){
            System.out.println("Nenhum aluno abaixo da média.");
        }else{
            System.out.println("-----Aluno em Risco-----\nAluno: "+alunos[indice]+"\nNota 1: "+nota1[indice]+"\nNota 2: "+nota2[indice]+"\nFaltas: "+faltas[indice]);
        }
    }
}
