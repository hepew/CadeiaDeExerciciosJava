package Cadeia01.Parte6.StartupcomEficienciaRelativa;

public class main {
    public static int startupeficiencia(String startups[],
                                        double receita[],
                                        double custo[],
                                        double investimento[],
                                        int clientes[]) {
        int indice = 0;
        for (int i = 1; i < receita.length; i++) {
            double margematual = receita[i] - custo[i];
            double margemcampeao = receita[indice] - custo[indice];
            double eficienciaInvestimentoatual = margematual / investimento[i];
            double eficienciaInvestimentocampeao = margemcampeao / investimento[indice];
            double receitaporclienteatual = receita[i] / clientes[i];
            double receitaporclientecampeao = receita[indice] / clientes[indice];

            if (eficienciaInvestimentoatual > eficienciaInvestimentocampeao) {
                indice = i;
            } else if (eficienciaInvestimentoatual == eficienciaInvestimentocampeao) {
                double diferenca = Math.abs(receitaporclienteatual - receitaporclientecampeao);
                if (receitaporclienteatual > receitaporclientecampeao && diferenca >= 5) {
                    indice = i;
                } else if (diferenca < 5) {
                    if (investimento[i] < investimento[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] startups = {"A", "B", "C", "D"};
        double[] receita = {1_000_000, 1_000_000, 900_000, 1_000_000};
        double[] custo = {800_000, 750_000, 600_000, 700_000};
        double[] investimento = {300_000, 200_000, 250_000, 200_000};
        int[] clientes = {10000, 8000, 9000, 8000};
        startupeficiencia(startups, receita, custo, investimento, clientes);
    }
}
