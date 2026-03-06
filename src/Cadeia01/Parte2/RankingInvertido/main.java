package Cadeia01.Parte2.RankingInvertido;
public class main {
    public static int pioraluno(String alunos[], double nota1[], double nota2[], int faltas[]){
        int indice = 0;
        for(int i = 1; i < alunos.length; i++){
            double mediareal = (nota1[i] + nota2[i]) /2;
            double mediacampeao = (nota1[indice] + nota2[indice]) /2;
            if(mediareal < mediacampeao){
                indice = i;
            }else if(mediareal == mediacampeao){
                if(faltas[i] > faltas[indice]){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] alunos = {"Lucas", "Fernanda", "Rafael", "Bruna"};
        double[] nota1 = {8.0, 9.0, 9.0, 7.5};
        double[] nota2 = {7.0, 8.0, 9.5, 8.0};
        int[] faltas = {2, 0, 1, 0};
        int indice = pioraluno(alunos, nota1, nota2, faltas);
        System.out.println("-----Ranking Invertido-----\nAlunos: "+alunos[indice]+"\nNota 1: "+nota1[indice]+"\nNota 2: "+nota2[indice]+"\nFaltas: "+faltas[indice]);
    }
}
