package Cadeia01.Parte7.MelhorFabricaSustentavel;

public class main {
    public static int melhorFabrica(String nome[],
                                    double eficienciaEnergetica[],
                                    int producaoMensal[],
                                    int emissoesCO2[],
                                    int acidentesTrabalho[],
                                    double custoOperacional[]) {
        int indice = 0;
        int limite = 2;
        for (int i = 1; i < nome.length; i++) {
            double scoreatual = (eficienciaEnergetica[i] * 0.5)
                    + (producaoMensal[i] * 0.01)
                    - (emissoesCO2[i] * 0.02)
                    - (acidentesTrabalho[i] * 1.0)
                    - (custoOperacional[i] * 0.0001);
            double scorecampeao = (eficienciaEnergetica[i] * 0.5)
                    + (producaoMensal[i] * 0.01)
                    - (emissoesCO2[i] * 0.02)
                    - (acidentesTrabalho[i] * 1.0)
                    - (custoOperacional[i] * 0.0001);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (acidentesTrabalho[i] < acidentesTrabalho[indice]) {
                    indice = i;
                } else if (acidentesTrabalho[i] == acidentesTrabalho[indice]) {
                    if (emissoesCO2[i] < emissoesCO2[indice]) {
                        indice = i;
                    } else if (emissoesCO2[i] == emissoesCO2[indice]) {
                        if (eficienciaEnergetica[i] > eficienciaEnergetica[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] nome = {"EcoSteel", "GreenMetal", "FutureIron", "CleanForge"};
        double[] eficienciaEnergetica = {85, 90, 88, 87};
        int[] producaoMensal = {10000, 9500, 11000, 10500};
        int[] emissoesCO2 = {300, 250, 400, 280};
        int[] acidentesTrabalho = {2, 1, 3, 1};
        double[] custoOperacional = {500000, 520000, 480000, 510000};
        int indice = melhorFabrica(nome, eficienciaEnergetica, producaoMensal, emissoesCO2, acidentesTrabalho, custoOperacional);
    }
}
