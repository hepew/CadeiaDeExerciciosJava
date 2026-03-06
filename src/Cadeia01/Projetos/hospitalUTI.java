package Cadeia01.Projetos;

public class hospitalUTI {
    public static int proximoUTI(String pacientes[],
                                 int idade[],
                                 int gravidade[],
                                 int oxigenio[],
                                 int tempoEsperaMin[],
                                 boolean riscoVida[],
                                 boolean doencaCronica[],
                                 int pressao[]) {
        int indice = 0;
        for (int i = 1; i < pressao.length; i++) {
            if (riscoVida[i] && !riscoVida[indice]) {
                indice = i;
                continue;
            }
            double scoreAtual =
                    (gravidade[i] * 4)
                            + ((100 - oxigenio[i]) * 1.5)
                            + (tempoEsperaMin[i] * 0.05);
            double scoreCampeao =
                    (gravidade[indice] * 4)
                            + ((100 - oxigenio[indice]) * 1.5)
                            + (tempoEsperaMin[indice] * 0.05);
            if (doencaCronica[i]) scoreAtual += 10;
            if (doencaCronica[indice]) scoreCampeao += 10;
            if (idade[i] >= 60) scoreAtual += 5;
            if (idade[indice] >= 60) scoreCampeao += 5;
            if (pressao[i] <= 9 || pressao[i] >= 14) scoreAtual += 8;
            if (pressao[indice] <= 9 || pressao[indice] >= 14) scoreCampeao += 8;
            double diferenca = Math.abs(scoreAtual - scoreCampeao);
            if (scoreAtual > scoreCampeao && diferenca >= 6) {
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

    }

}
