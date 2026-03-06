package Cadeia01.Parte6.MelhorJogadordaTemporada;

public class main {
    public static int melhorJogador(String jogadores[],
                                    int gols[],
                                    int assistencias[],
                                    int faltas[],
                                    int cartoesVermelhos[],
                                    int idade[]) {
        int indice = 0;
        int limite = 8;
        for (int i = 1; i < idade.length; i++) {
            double scoreatual = (gols[i] * 4) + (assistencias[i] * 3) - (faltas[i] * 1) - (cartoesVermelhos[i] * 5);
            double scorecampeao = (gols[indice] * 4) + (assistencias[indice] * 3) - (faltas[indice] * 1) - (cartoesVermelhos[indice] * 5);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (cartoesVermelhos[i] < cartoesVermelhos[indice]) {
                    indice = i;
                } else if (cartoesVermelhos[i] == cartoesVermelhos[indice]) {
                    if (gols[i] > gols[indice]) {
                        indice = i;
                    } else if (gols[i] == gols[indice]) {
                        if (idade[i] < idade[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] jogadores = {"Rafael", "Thiago", "André", "Victor"};
        int[] gols = {20, 18, 22, 18};
        int[] assistencias = {10, 12, 8, 14};
        int[] faltas = {15, 10, 20, 12};
        int[] cartoesVermelhos = {1, 0, 2, 0};
        int[] idade = {28, 24, 30, 23};
        melhorJogador(jogadores, gols, assistencias, faltas, cartoesVermelhos, idade);
    }
}
