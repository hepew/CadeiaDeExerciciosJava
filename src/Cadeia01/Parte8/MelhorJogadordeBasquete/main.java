package Cadeia01.Parte8.MelhorJogadordeBasquete;

public class main {
    public static int melhorJogadorNBA(String jogadores[],
                                       int pontos[],
                                       int assistencias[],
                                       int rebotes[],
                                       int turnovers[],
                                       int idade[]) {
        int indice = 0;
        int limite = 7;
        for (int i = 1; i < idade.length; i++) {
            double score = (pontos[i] * 2)
                    + (assistencias[i] * 1.5)
                    + (rebotes[i] * 1.2)
                    - (turnovers[i] * 2);
            double scorecampeao = (pontos[indice] * 2)
                    + (assistencias[indice] * 1.5)
                    + (rebotes[indice] * 1.2)
                    - (turnovers[indice] * 2);
            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (turnovers[i] < turnovers[indice]) {
                    indice = i;
                } else if (turnovers[i] == turnovers[indice]) {
                    if (pontos[i] > pontos[indice]) {
                        indice = i;
                    } else if (pontos[i] == pontos[indice]) {
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
        String[] jogadores = {"Carlos", "Mateus", "Rafael", "Diego", "Bruno"};
        int[] pontos = {28, 24, 30, 22, 26};
        int[] assistencias = {6, 9, 4, 7, 5};
        int[] rebotes = {8, 5, 10, 6, 7};
        int[] turnovers = {3, 2, 4, 3, 2};
        int[] idade = {27, 25, 29, 24, 26};
    }
}