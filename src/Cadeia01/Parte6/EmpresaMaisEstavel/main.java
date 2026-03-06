package Cadeia01.Parte6.EmpresaMaisEstavel;

public class main {
    public static int empresaestavel(String empresas[],
                                     double lucroAno1[],
                                     double lucroAno2[],
                                     double divida[],
                                     int funcionarios[]) {
        int indice = 0;
        for (int i = 1; i < empresas.length; i++) {
            //atual
            double crescimentoPercentual = ((lucroAno2[i] - lucroAno1[i]) / lucroAno1[i]) * 100;
            double indiceEstabilidade = crescimentoPercentual - (divida[i] / 10000);
            //campeao
            double crescimentoPercentualcamp = ((lucroAno2[indice] - lucroAno1[indice]) / lucroAno1[indice]) * 100;
            double indiceEstabilidadecamp = crescimentoPercentualcamp - (divida[indice] / 10000);
            //diferença entre (indiceEstabilidade e indiceEstabilidadecamp) (Math.abs serve pra tirar o SINAL NEGATIVO)
            double difereca = Math.abs(indiceEstabilidade - indiceEstabilidadecamp);
            //criterio 1
            if (indiceEstabilidade > indiceEstabilidadecamp) {
                if (difereca >= 2) {
                    indice = i;
                } else {
                    //diferença pequena -> olhar divida
                    if (divida[i] < divida[indice]) {
                        indice = i;
                    } else if (divida[i] == divida[indice]) {
                        if (funcionarios[i] < funcionarios[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] empresas = {"A", "B", "C", "D"};
        double[] lucroAno1 = {100000, 200000, 150000, 100000};
        double[] lucroAno2 = {110000, 260000, 180000, 130000};
        double[] divida = {50000, 100000, 40000, 20000};
        int[] funcionarios = {50, 80, 40, 30};
    }
}
