package Cadeia01.Parte5.RankingInteligentecomPenalidade;

public class main {
    public static int rankingInteligente(String candidatos[], double notaTecnica[], double notaComportamental[], int atrasos[], int advertencias[]){
        int indice = 0;
        for(int p = 0; p < candidatos.length; p++){
            double media = (notaTecnica[p] + notaComportamental[p]) / 2;
            double mediacamp = (notaTecnica[indice] + notaComportamental[indice]) / 2;
            double penalidade = (atrasos[p] * 0.2) + (advertencias[p] * 0.5);
            double penalidadecamp = (atrasos[indice] * 0.2) + (atrasos[indice] * 0.5);
            double scorefinal = media - penalidade;
            double scorefinalcamp = mediacamp - penalidadecamp;
            if(scorefinal > scorefinalcamp){
                indice = p;
            }else if(scorefinal == scorefinalcamp){
                if(advertencias[p] < advertencias[indice]){
                    indice = p;
                }else if(advertencias[p] == advertencias[indice]){
                    if(atrasos[p] < atrasos[indice]){
                        indice = p;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] candidatos = {"A", "B", "C", "D"};
        double[] notaTecnica = {9, 9, 8.5, 9};
        double[] notaComportamental = {8, 9, 9, 9};
        int[] atrasos = {0, 2, 1, 0};
        int[] advertencias = {0, 0, 1, 0};
        int indice = rankingInteligente(candidatos, notaTecnica, notaComportamental, atrasos, advertencias);
        System.out.println("Candidato: "+candidatos[indice]+"\nNota Técnica: "+notaTecnica[indice]+"\nNota comportamental: "+notaComportamental[indice]+"\nAtrasos: "+atrasos[indice]+"\nAdvertencias: "+advertencias[indice]);
    }
}