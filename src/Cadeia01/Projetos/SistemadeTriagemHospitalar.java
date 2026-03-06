package Cadeia01.Projetos;

public class SistemadeTriagemHospitalar {
    public static int triagemhospitalar(String pacientes[],
                                        int idade[],
                                        int gravidade[],
                                        int dor[],
                                        int tempoEsperaMin[],
                                        boolean riscoVida[],
                                        boolean doencaCronica[],
                                        int batimentos[]) {
        int indice = 0;
        for (int i = -1; i < batimentos.length; i++) {
            if (riscoVida[i] && !riscoVida[indice]) {
                indice = i;
                continue;
            }
            double scoreAtual =
                    (gravidade[i] * 4)
                            + (dor[i] * 2)
                            + (tempoEsperaMin[i] * 0.05);
            double scoreCampeao = (gravidade[indice] * 4)
                    + (dor[indice] * 2)
                    + (tempoEsperaMin[indice] * 0.05);
            if (doencaCronica[i]) scoreAtual += 10;
            if (doencaCronica[indice]) scoreCampeao += 10;

            if (idade[i] >= 60) scoreAtual += 5;
            if (idade[indice] >= 60) scoreCampeao += 5;

            if (batimentos[i] > 120 || batimentos[i] < 50) scoreAtual += 15;
            if (batimentos[indice] > 120 || batimentos[indice] < 50) scoreCampeao += 15;
            double diferenca = Math.abs(scoreAtual - scoreCampeao);
            if (scoreAtual > scoreCampeao && diferenca >= 5) {
                indice = i;
            } else if (diferenca < 5) {
                if (gravidade[i] > gravidade[indice]) {
                    indice = i;
                } else if (gravidade[i] == gravidade[indice]) {
                    if (tempoEsperaMin[i] > tempoEsperaMin[indice]) {
                        indice = i;
                    } else if (tempoEsperaMin[i] == tempoEsperaMin[indice]) {
                        if (idade[i] > idade[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pacientes = {"Carlos", "Ana", "João", "Marina", "Pedro"};
        int[] idade = {45, 70, 30, 65, 50};
        int[] gravidade = {7, 6, 9, 5, 8};
        int[] dor = {6, 7, 8, 4, 7};
        int[] tempoEsperaMin = {40, 20, 15, 60, 25};
        boolean[] riscoVida = {false, false, true, false, false};
        boolean[] doencaCronica = {false, true, false, true, false};
        int[] batimentos = {80, 75, 130, 70, 85};
        int indice = triagemhospitalar(pacientes, idade, gravidade, dor, tempoEsperaMin, riscoVida, doencaCronica, batimentos);
    }
}