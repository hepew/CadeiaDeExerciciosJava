package Cadeia01.Parte8.MelhorFilme;

public class main {
    public static int melhorFilme(String filmes[],
                                  double notaCritica[],
                                  double notaPublico[],
                                  int bilheteriaMilhoes[],
                                  int premios[],
                                  int duracaoMin[]) {
        int indice = 0;
        int limite = 5;
        for (int i = 1; i < premios.length; i++) {
            double scoreatual = (notaCritica[i] * 4)
                    + (notaPublico[i] * 4)
                    + (premios[i] * 2)
                    + (bilheteriaMilhoes[i] * 0.01);
            double scorecampeao = (notaCritica[indice] * 4)
                    + (notaPublico[indice] * 4)
                    + (premios[indice] * 2)
                    + (bilheteriaMilhoes[indice] * 0.01);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (premios[i] > premios[indice]) {
                    indice = i;
                } else if (premios[i] == premios[indice]) {
                    if (notaPublico[i] > notaPublico[indice]) {
                        indice = i;
                    } else if (notaPublico[i] > notaPublico[indice]) {
                        if (bilheteriaMilhoes[i] > bilheteriaMilhoes[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] filmes = {"Galaxy War", "Ocean Heart", "Night Code", "Golden Path", "Final Horizon"};
        double[] notaCritica = {8.5, 9.2, 8.8, 8.0, 9.0};
        double[] notaPublico = {9.0, 8.7, 9.3, 8.5, 8.9};
        int[] bilheteriaMilhoes = {900, 700, 850, 400, 950};
        int[] premios = {5, 8, 4, 2, 6};
        int[] duracaoMin = {130, 150, 140, 110, 160};
        int indice = melhorFilme(filmes, notaCritica, notaPublico, bilheteriaMilhoes, premios, duracaoMin);
    }
}
