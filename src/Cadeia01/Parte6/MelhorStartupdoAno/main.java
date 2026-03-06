package Cadeia01.Parte6.MelhorStartupdoAno;

public class main {
    public static int melhorStartup(String nome[],
                                    double receita[],
                                    double custo[],
                                    double crescimento[],
                                    double investimento[],
                                    int clientes[]) {
        int indice = 0;
        double limite = 5000;

        for (int i = 1; i < receita.length; i++) {
            double lucroatual = (receita[i] - custo[i]);
            double lucrocampeao = (receita[indice] - custo[indice]);
            double scoreatual = (lucroatual * 0.5) + (crescimento[i] * 0.3) + (clientes[i] * 0.0001);
            double scorecampeao = (lucrocampeao * 0.5) + (crescimento[indice] * 0.3) + (clientes[indice] * 0.0001);
            double diferenca = Math.abs(scoreatual - scorecampeao);

            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (investimento[i] < investimento[indice]) {
                    indice = i;
                } else if (investimento[i] == investimento[indice]) {
                    if (crescimento[i] > crescimento[indice]) {
                        indice = i;
                    } else if (crescimento[i] == crescimento[indice]) {
                        if (lucroatual > lucrocampeao) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] nome = {"TechX", "Inova+", "GreenSoft", "DataPro"};
        double[] receita = {1_000_000, 950_000, 1_200_000, 980_000};
        double[] custo = {700_000, 600_000, 900_000, 650_000};
        double[] crescimento = {20, 25, 18, 22};
        double[] investimento = {300_000, 250_000, 400_000, 200_000};
        int[] clientes = {10000, 8500, 12000, 9000};
        melhorStartup(nome, receita, custo, crescimento, investimento, clientes);
    }
}
