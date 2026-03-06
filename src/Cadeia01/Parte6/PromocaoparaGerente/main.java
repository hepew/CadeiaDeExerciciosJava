package Cadeia01.Parte6.PromocaoparaGerente;

public class main {
    public static int promocaoGerente(String funcionarios[],
                                      double produtividade[],
                                      double lideranca[],
                                      int anosEmpresa[],
                                      int advertencias[],
                                      double salarioAtual[]) {
        int indice = 0;
        int limite = 3;
        for (int i = 1; i < funcionarios.length; i++) {
            double scoreatual = (produtividade[i] * 0.4)
                    + (lideranca[i] * 0.4)
                    + (anosEmpresa[i] * 0.2)
                    - (advertencias[i] * 1.5);
            double scorecampeao = (produtividade[indice] * 0.4)
                    + (lideranca[indice] * 0.4)
                    + (anosEmpresa[indice] * 0.2)
                    - (advertencias[indice] * 1.5);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (salarioAtual[i] < salarioAtual[indice]) {
                    indice = i;
                } else if (salarioAtual[i] == salarioAtual[indice]) {
                    if (anosEmpresa[i] > anosEmpresa[indice]) {
                        indice = i;
                    } else if (anosEmpresa[i] == anosEmpresa[indice]) {
                        if (advertencias[i] < advertencias[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] funcionarios = {"Carla", "Eduardo", "Fernanda", "Gabriel"};
        double[] produtividade = {8.5, 9.0, 8.8, 9.0};
        double[] lideranca = {8.0, 8.5, 9.0, 8.5};
        int[] anosEmpresa = {5, 3, 6, 4};
        int[] advertencias = {0, 1, 0, 0};
        double[] salarioAtual = {5000, 4800, 5200, 4900};
        promocaoGerente(funcionarios, produtividade, lideranca, anosEmpresa, advertencias, salarioAtual);
    }
}
