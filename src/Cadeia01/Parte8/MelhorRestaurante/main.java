package Cadeia01.Parte8.MelhorRestaurante;

public class main {
    public static int melhorRestaurante(String restaurantes[],
                                        double notaComida[],
                                        double notaAtendimento[],
                                        double precoMedio[],
                                        int tempoEspera[],
                                        int avaliacaoOnline[]) {
        int indice = 0;
        int limite = 5;
        for (int i = 1; i < tempoEspera.length; i++) {
            double scoreatual = (notaComida[i] * 4)
                    + (notaAtendimento[i] * 3)
                    + (avaliacaoOnline[i] * 0.01)
                    - (precoMedio[i] * 0.05)
                    - (tempoEspera[i] * 0.1);
            double scorecampeao = (notaComida[indice] * 4)
                    + (notaAtendimento[indice] * 3)
                    + (avaliacaoOnline[indice] * 0.01)
                    - (precoMedio[indice] * 0.05)
                    - (tempoEspera[indice] * 0.1);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (tempoEspera[i] < tempoEspera[indice]) {
                    indice = i;
                } else if (tempoEspera[i] == tempoEspera[indice]) {
                    if (notaComida[i] > notaComida[indice]) {
                        indice = i;
                    } else if (notaComida[i] == notaComida[indice]) {
                        if (precoMedio[i] < precoMedio[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] restaurantes = {"BellaMesa", "SaborMax", "ChefPrime", "TemperoBom", "CasaGourmet"};
        double[] notaComida = {9.0, 8.5, 9.5, 8.0, 9.2};
        double[] notaAtendimento = {8.5, 9.0, 8.0, 8.5, 9.0};
        double[] precoMedio = {120, 90, 150, 80, 130};
        int[] tempoEspera = {20, 30, 25, 15, 35};
        int[] avaliacaoOnline = {400, 650, 300, 500, 450};
        int indice = melhorRestaurante(restaurantes, notaComida, notaAtendimento, precoMedio, tempoEspera, avaliacaoOnline);
    }
}