package Cadeia01.Parte7.MelhorIAdoLaboratorio;

public class main {
    public static int melhorIA(String nome[],
                               double precisao[],
                               double recall[],
                               double latenciaMs[],
                               double consumoMemoria[],
                               int falhas[]) {
        int indice = -1;

        for (int i = 0; i < falhas.length; i++) {
            if (precisao[i] + recall[i] == 0) {
                continue;
            }
            if (indice == -1) {
                indice = i;
                continue;
            }
            double f1atual = 2 * (precisao[i] * recall[i]) / (precisao[i] + recall[i]);
            double scoreatual = (f1atual * 0.6)
                    - (latenciaMs[i] * 0.1)
                    - (consumoMemoria[i] * 0.05)
                    - (falhas[i] * 2);
            double f1campeao = 2 * (precisao[indice] * recall[indice]) / (precisao[indice] + recall[indice]);
            double scorecampeao = (f1campeao * 0.6)
                    - (latenciaMs[indice] * 0.1)
                    - (consumoMemoria[indice] * 0.05)
                    - (falhas[indice] * 2);
            if (scoreatual > scorecampeao) {
                indice = i;
            } else if (scoreatual == scorecampeao) {
                if (f1atual > f1campeao) {
                    indice = i;
                } else if (f1atual == f1campeao) {
                    if (latenciaMs[i] < latenciaMs[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String nomeIA[] = {
                "VisionNet",
                "DeepScan",
                "SmartAI",
                "QuickMind",
                "ZeroBrain"
        };
        double precisao[] = {0.92, 0.88, 0.95, 0.60, 0.0};
        double recall[] = {0.90, 0.91, 0.40, 0.65, 0.0}; // ⚠️ ZeroBrain inválida
        double latenciaMs[] = {120, 150, 200, 80, 50};
        double consumoMemoria[] = {512, 450, 800, 300, 200};
        int falhas[] = {2, 1, 5, 0, 0};
    }
}
