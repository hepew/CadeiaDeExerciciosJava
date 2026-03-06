package Cadeia01.Parte7.MelhorHotelparaTurismo;

public class main {
    public static int melhorHotel(String nome[],
                                  double avaliacao[],
                                  int estrelas[],
                                  double precoDiaria[],
                                  int distanciaCentro[],
                                  int reclamacoes[]) {
        int indice = 0;
        double limite = 1.0;
        for (int i = 1; i < estrelas.length; i++) {
            double scoreatual = (avaliacao[i] * 0.6)
                    + (estrelas[i] * 0.5)
                    - (precoDiaria[i] * 0.002)
                    - (distanciaCentro[i] * 0.1)
                    - (reclamacoes[i] * 0.3);
            double scorecampeao = (avaliacao[indice] * 0.6)
                    + (estrelas[indice] * 0.5)
                    - (precoDiaria[indice] * 0.002)
                    - (distanciaCentro[indice] * 0.1)
                    - (reclamacoes[indice] * 0.3);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (precoDiaria[i] < precoDiaria[indice]) {
                    indice = i;
                } else if (precoDiaria[i] == precoDiaria[indice]) {
                    if (distanciaCentro[i] < distanciaCentro[indice]) {
                        indice = i;
                    } else if (distanciaCentro[i] == distanciaCentro[indice]) {
                        if (avaliacao[i] > avaliacao[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] nome = {"LuxStay", "CityInn", "RoyalPalace", "ComfortLife"};
        double[] avaliacao = {8.8, 9.2, 8.5, 9.0};
        int[] estrelas = {4, 5, 4, 5};
        double[] precoDiaria = {400, 600, 350, 500};
        int[] distanciaCentro = {2, 1, 3, 2};
        int[] reclamacoes = {10, 5, 8, 6};
        int indice = melhorHotel(nome, avaliacao, estrelas, precoDiaria, distanciaCentro, reclamacoes);
    }
}
