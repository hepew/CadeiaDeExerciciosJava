package Cadeia01.Parte7.MelhorJogodoAno;

public class main {
    public static int melhorJogo(String nome[],
                                 double notaCritica[],
                                 double notaPublico[],
                                 int vendas[],
                                 int bugsReportados[],
                                 int duracaoHoras[]) {
        int indice = 0;
        double limite = 0.8;
        for (int i = 1; i < vendas.length; i++) {
            double scoreatual = (notaCritica[i] * 0.4)
                    + (notaPublico[i] * 0.4)
                    + (vendas[i] * 0.00001)
                    + (duracaoHoras[i] * 0.1)
                    - (bugsReportados[i] * 0.2);
            double scorecampeao = (notaCritica[indice] * 0.4)
                    + (notaPublico[indice] * 0.4)
                    + (vendas[indice] * 0.00001)
                    + (duracaoHoras[indice] * 0.1)
                    - (bugsReportados[indice] * 0.2);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (bugsReportados[i] < bugsReportados[indice]) {
                    indice = i;
                } else if (bugsReportados[i] == bugsReportados[indice]) {
                    if (notaPublico[i] > notaPublico[indice]) {
                        indice = i;
                    } else if (notaPublico[i] == notaPublico[indice]) {
                        if (vendas[i] > vendas[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] nome = {"BattleZone", "SkyWorld", "PixelHero", "DarkQuest"};
        double[] notaCritica = {8.5, 9.0, 8.8, 9.1};
        double[] notaPublico = {8.7, 8.9, 9.0, 8.8};
        int[] vendas = {500000, 600000, 450000, 550000};
        int[] bugsReportados = {30, 25, 20, 40};
        int[] duracaoHoras = {40, 35, 50, 45};
        melhorJogo(nome, notaCritica, notaPublico, vendas, bugsReportados, duracaoHoras);
    }
}
