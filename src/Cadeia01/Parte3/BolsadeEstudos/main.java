package Cadeia01.Parte3.BolsadeEstudos;
public class main {
    public static int bolsadeestudos(String alunos[], double nota1[], double nota2[], int rendaFamiliar[], int faltas[]){
        int indice = 0;
        for(int i = 1; i < faltas.length; i++){
            double media = (nota1[i] + nota2[i]) /2;
            double mediacamp = (nota1[indice] + nota2[indice]) / 2;
            if(media > mediacamp){
                indice = i;
            }else if(media == mediacamp){
                if(rendaFamiliar[i] < rendaFamiliar[indice]){
                    indice = i;
                }else if(rendaFamiliar[i] == rendaFamiliar[indice]){
                    if(faltas[i] < faltas[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] alunos = {"Lucas", "Fernanda", "Rafael", "Bruna"};
        double[] nota1 = {9.0, 9.0, 8.5, 9.0};
        double[] nota2 = {8.0, 9.0, 9.0, 9.0};
        int[] rendaFamiliar = {3000, 5000, 2000, 3000};
        int[] faltas = {1, 0, 2, 0};
        int indice = bolsadeestudos(alunos, nota1, nota2, rendaFamiliar, faltas);
        System.out.println("Aluno: "+alunos[indice]+"\nNota 1: "+nota1[indice]+"\nNota 2: "+nota2[indice]+"\nRenda Familiar: "+rendaFamiliar[indice]+"\nFaltas: "+faltas[indice]);
    }
}
