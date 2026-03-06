package Cadeia01.Parte8.MelhorInvestimento;

public class main {
    public static int melhorInvestimento(String ativos[],
                                         double retornoAnual[],
                                         double risco[],
                                         int liquidezDias[],
                                         double taxaAdministracao[],
                                         int anosMercado[]) {
        int indice = 0;
        int limite = 6;
        for (int i = 1; i < risco.length; i++) {
            double score =
                    (retornoAnual[i] * 4)
                            + (anosMercado[i] * 1)
                            - (risco[i] * 3)
                            - (taxaAdministracao[i] * 2)
                            - (liquidezDias[i] * 0.1);
            double scorecampeao =
                    (retornoAnual[indice] * 4)
                            + (anosMercado[indice] * 1)
                            - (risco[indice] * 3)
                            - (taxaAdministracao[indice] * 2)
                            - (liquidezDias[indice] * 0.1);
            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (risco[i] < risco[indice]) {
                    indice = i;
                } else if (risco[i] == risco[indice]) {
                    if (retornoAnual[i] > retornoAnual[indice]) {
                        indice = i;
                    } else if (retornoAnual[i] == retornoAnual[indice]) {
                        if (anosMercado[i] > anosMercado[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] ativos = {"FundoAlpha", "FundoBeta", "FundoGamma", "FundoDelta", "FundoOmega"};
        double[] retornoAnual = {12.5, 10.0, 14.0, 11.5, 13.0};
        double[] risco = {6.0, 4.5, 7.5, 5.0, 6.5};
        int[] liquidezDias = {30, 5, 60, 15, 20};
        double[] taxaAdministracao = {1.5, 1.0, 2.0, 1.2, 1.8};
        int[] anosMercado = {10, 8, 6, 12, 9};
        int indice = melhorInvestimento(ativos, retornoAnual, risco, liquidezDias, taxaAdministracao, anosMercado);
    }
}
