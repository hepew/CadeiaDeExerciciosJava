package Cadeia01.Parte7.MelhorCarroparaCompra;

public class main {
    public static int melhorCarro(String modelo[],
                                  double consumo[],
                                  int potencia[],
                                  double preco[],
                                  int seguranca[],
                                  int manutencaoAnual[]) {
        int indice = 0;
        int limite = 5;
        for (int i = 1; i < seguranca.length; i++) {
            double scoreatual = (consumo[i] * 2)
                    + (potencia[i] * 0.05)
                    + (seguranca[i] * 1.5)
                    - (manutencaoAnual[i] * 0.001);
            double scorecampeao = (consumo[indice] * 2)
                    + (potencia[indice] * 0.05)
                    + (seguranca[indice] * 1.5)
                    - (manutencaoAnual[indice] * 0.001);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (preco[i] < preco[indice]) {
                    indice = i;
                } else if (preco[i] == preco[indice]) {
                    if (seguranca[i] > seguranca[indice]) {
                        indice = i;
                    } else if (seguranca[i] == seguranca[indice]) {
                        if (potencia[i] > potencia[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] modelo = {"X1", "TurboZ", "EcoDrive", "PowerMax"};
        double[] consumo = {14, 10, 16, 12};
        int[] potencia = {130, 180, 110, 160};
        double[] preco = {70000, 85000, 75000, 80000};
        int[] seguranca = {4, 5, 4, 5};
        int[] manutencaoAnual = {3000, 5000, 2500, 4000};
        melhorCarro(modelo, consumo, potencia, preco, seguranca, manutencaoAnual);
    }
}
