package Cadeia01.Parte8.SistemadeEscolhadeCidadeparaNovaFabrica;

public class main {
    public static int melhorCidade(String cidades[],
                                   int populacao[],
                                   double custoTerreno[],
                                   int distanciaPorto[],
                                   int infraestrutura[],
                                   boolean incentivosFiscais[],
                                   int maoDeObraQualificada[]) {
        int indice = 0;
        int limite = 12;
        for (int i = 1; i < infraestrutura.length; i++) {
            double score = (infraestrutura[i] * 4)
                    + (maoDeObraQualificada[i] * 0.3)
                    + (populacao[i] * 0.0001)
                    - (custoTerreno[i] * 0.5)
                    - (distanciaPorto[i] * 0.02);
            double scorecampeao = (infraestrutura[indice] * 4)
                    + (maoDeObraQualificada[indice] * 0.3)
                    + (populacao[indice] * 0.0001)
                    - (custoTerreno[indice] * 0.5)
                    - (distanciaPorto[indice] * 0.02);
            if (incentivosFiscais[i] && !incentivosFiscais[indice]) score += 6;
            if (incentivosFiscais[indice] && !incentivosFiscais[i]) scorecampeao += 6;
            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca > limite) {
                indice = i;
                continue;
            } else if (limite < diferenca) {
                if (custoTerreno[i] < custoTerreno[indice]) {
                    indice = i;
                } else if (custoTerreno[i] == custoTerreno[indice]) {
                    if (infraestrutura[i] > infraestrutura[indice]) {
                        indice = i;
                    } else if (infraestrutura[i] == infraestrutura[indice]) {
                        if (distanciaPorto[i] < distanciaPorto[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] cidades = {"NovaVale", "PortoSul", "IndusCity", "TechTown", "MetalVille"};
        int[] populacao = {500000, 300000, 700000, 450000, 380000};
        double[] custoTerreno = {120, 80, 150, 110, 90};
        int[] distanciaPorto = {200, 50, 300, 180, 120};
        int[] infraestrutura = {8, 7, 9, 8, 7};
        boolean[] incentivosFiscais = {false, true, false, true, false};
        int[] maoDeObraQualificada = {70, 60, 80, 75, 65};
        int posicao = melhorCidade(cidades, populacao, custoTerreno, distanciaPorto, infraestrutura, incentivosFiscais, maoDeObraQualificada);
    }
}
