package Cadeia01.Projetos;

public class SistemadePrioridadedaUTI {
    public static int proximopaciente(String pacientes[],
                                      int idade[],
                                      int gravidade[],
                                      int oxigenio[],
                                      int tempoEsperaMin[],
                                      boolean riscoVida[],
                                      boolean doencaCronica[],
                                      int pressao[]) {
        int indice = 0;
        for (int i = 1; i < gravidade.length; i++) {
            if (riscoVida[i] && !riscoVida[i]) {
                return i;
            }
            double scoreatual = gravidade[i] * 4
                    + (100 - oxigenio[i]) * 1.5
                    + tempoEsperaMin[i] * 0.05;
            double scorecampeao = gravidade[indice] * 4
                    + (100 - oxigenio[indice]) * 1.5
                    + tempoEsperaMin[indice] * 0.05;
            if (doencaCronica[i]) scoreatual += 10;
            if (doencaCronica[indice]) scorecampeao += 10;
            if (idade[i] >= 60) scoreatual += 5;
            if (idade[indice] >= 60) scorecampeao += 5;
            if (pressao[i] <= 9 && pressao[i] >= 14) scoreatual += 8;
            if (pressao[indice] <= 9 && pressao[indice] >= 14) scorecampeao += 8;
            if (oxigenio[i] < 85) scoreatual += 15;
            if (oxigenio[indice] < 85) scorecampeao += 15;
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= 6) {
                indice = i;
            } else if (diferenca < 6) {
                if (gravidade[i] > gravidade[indice]) {
                    indice = i;
                } else if (gravidade[i] == gravidade[indice]) {
                    if (oxigenio[i] < oxigenio[indice]) {
                        indice = i;
                    } else if (oxigenio[i] == oxigenio[indice]) {
                        if (tempoEsperaMin[i] > tempoEsperaMin[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pacientes = {"Carlos", "Ana", "Pedro", "Marina", "Lucas"};
        int[] idade = {45, 72, 30, 65, 50};
        int[] gravidade = {7, 6, 9, 5, 8};
        int[] oxigenio = {94, 88, 82, 96, 90};
        int[] tempoEsperaMin = {40, 20, 15, 60, 25};
        boolean[] riscoVida = {false, false, true, false, false};
        boolean[] doencaCronica = {false, true, false, true, false};
        int[] pressao = {12, 14, 9, 13, 11};
        int indice = proximopaciente(pacientes, idade, gravidade, oxigenio, tempoEsperaMin, riscoVida, doencaCronica, pressao);
    }
}
