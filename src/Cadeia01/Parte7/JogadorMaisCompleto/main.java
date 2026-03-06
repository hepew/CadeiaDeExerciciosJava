package Cadeia01.Parte7.JogadorMaisCompleto;

public class main {
    public static int jogadorMaisCompleto(String nome[],
                                          int gols[],
                                          int assistencias[],
                                          int desarmes[],
                                          int jogos[],
                                          int cartoesAmarelos[]) {
        int indice = 0;
        for (int i = 1; i < gols.length; i++) {
            if (jogos[i] == 0) {
                continue;
            }
            double eficienciaatual = (gols[i] * 4.0 + assistencias[i] * 3.0 + desarmes[i] * 2.0)
                    / jogos[i]
                    - (cartoesAmarelos[i] * 0.5);
            double eficienciacampeao = (gols[indice] * 4 + assistencias[indice] * 3 + desarmes[indice] * 2)
                    / jogos[indice]
                    - (cartoesAmarelos[indice] * 0.5);

            if (eficienciaatual > eficienciacampeao) {
                indice = i;
            } else if (eficienciaatual == eficienciacampeao) {
                if (jogos[i] > jogos[indice]) {
                    indice = i;
                } else if (jogos[i] == jogos[indice]) {
                    if (cartoesAmarelos[i] < cartoesAmarelos[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String nomeJog[] = {
                "Carlos",
                "Bruno",
                "Mateus",
                "Rafael",
                "Diego"
        };
        int gols[] = {10, 8, 15, 4, 7};
        int assistencias[] = {5, 10, 3, 12, 6};
        int desarmes[] = {20, 15, 5, 30, 18};
        int jogos[] = {20, 0, 25, 30, 20}; // ⚠️ Bruno deve ser ignorado
        int cartoesAmarelos[] = {3, 1, 5, 2, 4};
        int indice = jogadorMaisCompleto(nomeJog, gols, assistencias, desarmes, jogos, cartoesAmarelos);
    }
}
