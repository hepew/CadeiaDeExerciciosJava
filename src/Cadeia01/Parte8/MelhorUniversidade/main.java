package Cadeia01.Parte8.MelhorUniversidade;

public class main {
    public static int melhorUniversidade(String universidades[],
                                         int rankingAcademico[],
                                         int empregabilidade[],
                                         double mensalidade[],
                                         int pesquisa[],
                                         int infraestrutura[]) {
        int indice = 0;
        int limite = 4;
        for (int i = 1; i < pesquisa.length; i++) {
            double score = (rankingAcademico[i] * 0.3)
                    + (empregabilidade[i] * 0.3)
                    + (pesquisa[i] * 0.25)
                    + (infraestrutura[i] * 0.15)
                    - (mensalidade[i] * 0.01);
            double scorecampeao = (rankingAcademico[indice] * 0.3)
                    + (empregabilidade[indice] * 0.3)
                    + (pesquisa[indice] * 0.25)
                    + (infraestrutura[indice] * 0.15)
                    - (mensalidade[indice] * 0.01);
            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (empregabilidade[i] > empregabilidade[indice]) {
                    indice = i;
                } else if (empregabilidade[i] == empregabilidade[indice]) {
                    if (pesquisa[i] > pesquisa[indice]) {
                        indice = i;
                    } else if (pesquisa[i] == pesquisa[indice]) {
                        if (mensalidade[i] < mensalidade[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] universidades = {"UniTech", "GlobalEdu", "FutureU", "SmartCollege", "PrimeAcademy"};
        int[] rankingAcademico = {85, 90, 88, 80, 92};
        int[] empregabilidade = {80, 85, 83, 78, 88};
        double[] mensalidade = {1500, 2000, 1800, 1200, 2100};
        int[] pesquisa = {75, 90, 80, 70, 95};
        int[] infraestrutura = {80, 85, 82, 78, 88};
        int indice = melhorUniversidade(universidades, rankingAcademico, empregabilidade, mensalidade, pesquisa, infraestrutura);
    }
}