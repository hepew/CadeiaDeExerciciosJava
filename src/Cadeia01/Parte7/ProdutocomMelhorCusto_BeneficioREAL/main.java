package Cadeia01.Parte7.ProdutocomMelhorCusto_BeneficioREAL;

public class main {
    public static int melhorProduto(String nome[],
                                    double preco[],
                                    double qualidade[],
                                    double durabilidadeMeses[],
                                    int devolucoes[]) {
        int indice = 0;
        for (int i = 1; i < preco.length; i++) {
            if (qualidade[i] <= 0) {
                continue;
            }
            double scoreatual = (qualidade[i] * 0.5)
                    + (durabilidadeMeses[i] * 0.3)
                    - (preco[i] * 0.1)
                    - (devolucoes[i] * 2);
            double scorecampeao = (qualidade[indice] * 0.5)
                    + (durabilidadeMeses[indice] * 0.3)
                    - (preco[indice] * 0.1)
                    - (devolucoes[indice] * 2);
            if (scoreatual > scorecampeao) {
                indice = i;
            } else if (scoreatual == scorecampeao) {
                if (preco[i] < preco[indice]) {
                    indice = i;
                } else if (preco[i] == preco[indice]) {
                    if (durabilidadeMeses[i] > durabilidadeMeses[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String nomeProd[] = {
                "Fone X",
                "Mouse Pro",
                "Teclado Mec",
                "Monitor HD",
                "Webcam Plus"
        };
        double preco[] = {250, 180, 320, 900, 210};
        double qualidade[] = {8.5, 7.0, 9.0, 8.0, 0.0}; // ⚠️ Webcam deve ser ignorada
        double durabilidadeMeses[] = {24, 18, 36, 48, 12};
        int devolucoes[] = {2, 5, 1, 0, 3};
        int indice = melhorProduto(nomeProd, preco, qualidade, durabilidadeMeses, devolucoes);
    }
}
