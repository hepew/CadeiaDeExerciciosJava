package Cadeia01.Parte6.ProdutocomVantagemReal;

public class main {
    public static int produtovantagemreal(String produtos[],
                                          double vendas[],
                                          double devolucoes[],
                                          double avaliacao[],
                                          double custo[]) {
        int indice = 0;
        for (int i = 1; i < devolucoes.length; i++) {
            //atual
            double taxaconversao = (vendas[i] - devolucoes[i]) / vendas[i];
            double score = (taxaconversao * 5) + avaliacao[i] - (custo[i] / 100);
            //camepao
            double taxaconversaocamp = (vendas[indice] - devolucoes[indice]) / vendas[indice];
            double scorecamp = (taxaconversaocamp * 5) + avaliacao[indice] - (custo[indice] / 100);

            //criterio principal
            if (score > scorecamp) {
                indice = i;
            } else if (score == scorecamp) {
                double diferenca = Math.abs(taxaconversao - taxaconversaocamp);
                //diferença relevante
                if (diferenca >= 0.3) {
                    if (taxaconversao > taxaconversaocamp) {
                        indice = i;
                    }
                }
                //diferença pequena, desempate fino
                else {
                    if (taxaconversao > taxaconversaocamp) {
                        indice = i;
                    } else if (taxaconversao == taxaconversaocamp) {
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
        String[] produtos = {"A", "B", "C", "D"};
        double[] vendas = {10000, 10000, 9500, 10000};
        double[] devolucoes = {500, 300, 200, 300};
        double[] avaliacao = {4.5, 4.8, 4.8, 4.7};
        double[] custo = {50, 60, 55, 60};
        int indice = produtovantagemreal(produtos, vendas, devolucoes, avaliacao, custo);

    }
}