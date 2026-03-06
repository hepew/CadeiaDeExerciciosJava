package Cadeia01.Parte6.PrioridadeInteligentedeCirurgia;

public class main {
    public static int prioridadeCirurgia(String pacientes[],
                                         int risco[],
                                         int dor[],
                                         int tempoEspera[],
                                         boolean diabetico[],
                                         int idade[]) {
        int indice = 0;
        for (int i = 1; i < dor.length; i++) {
            double scoreatual = (risco[i] * 4) + (dor[i] * 2) + tempoEspera[i];
            double scorecampeao = (risco[indice] * 4) + (dor[indice] * 2) + tempoEspera[indice];
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= 10) {
                indice = i;
            } else if (diferenca < 10) {
                //diabetico primeiro (o atual é diabetico, o campeao não é)
                if (diabetico[i] && !diabetico[indice]) {
                    indice = i;
                } else if (diabetico[i] == diabetico[indice]) {
                    if (idade[i] > idade[indice]) {
                        indice = i;
                    } else if (idade[i] == idade[indice]) {
                        if (risco[i] > risco[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pacientes = {"Ana", "Bruno", "Carlos", "Daniela"};
        int[] risco = {8, 9, 7, 9};
        int[] dor = {7, 6, 8, 6};
        int[] tempoEspera = {20, 15, 25, 15};
        boolean[] diabetico = {false, true, false, false};
        int[] idade = {60, 55, 70, 65};
        prioridadeCirurgia(pacientes, risco, dor, tempoEspera, diabetico, idade);
    }
}