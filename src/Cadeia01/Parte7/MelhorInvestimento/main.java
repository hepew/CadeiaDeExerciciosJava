package Cadeia01.Parte7.MelhorInvestimento;

public class main {
    public static int melhorInvestimento(String nome[],
                                         double rendimentoAnual[],
                                         double risco[],
                                         double liquidezDias[],
                                         double taxaAdm[]) {
        int indice = 0;

        for (int i = 1; i < taxaAdm.length; i++) {
            double scoreatual = (rendimentoAnual[i] * 0.5)
                    - (risco[i] * 0.2)
                    - (taxaAdm[i] * 0.2)
                    - (liquidezDias[i] * 0.1);
            double scorecampeao = (rendimentoAnual[indice] * 0.5)
                    - (risco[indice] * 0.2)
                    - (taxaAdm[indice] * 0.2)
                    - (liquidezDias[indice] * 0.1);
            //double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao) {
                indice = i;
            } else if (scoreatual == scorecampeao) {
                if (risco[i] < risco[indice]) {
                    indice = i;
                } else if (risco[i] == risco[indice]) {
                    if (taxaAdm[i] < taxaAdm[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        double rendimentoAnual[] = {12.5, 13.2, 11.8, 14.0, 18.0};
        double risco[] = {1.2, 2.5, 1.0, 4.0, 8.5};
        double liquidezDias[] = {1, 30, 90, 15, 2};
        double taxaAdm[] = {0.2, 0.5, 0.3, 1.5, 2.0};
    }
}