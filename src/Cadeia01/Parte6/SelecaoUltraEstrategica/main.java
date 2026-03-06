package Cadeia01.Parte6.SelecaoUltraEstrategica;

public class main {
    public static int selecaoultra(String candidatos[],
                                   double tecnica[],
                                   double comportamental[],
                                   int experiencia[],
                                   int atrasos[],
                                   double expectativaSalarial[]) {
        int indice = 0;
        for (int i = 1; i < tecnica.length; i++) {
            double mediaatual = (tecnica[i] * 0.6) + (comportamental[i] * 0.4);
            double scoreatual = mediaatual + (experiencia[i] * 0.3) - (atrasos[i] * 0.5);
            double mediacampeao = (tecnica[indice] * 0.6) + (comportamental[indice] * 0.4);
            double scorecampeao = mediacampeao + (experiencia[indice] * 0.3) - (atrasos[indice] * 0.5);

            double diferenca = Math.abs(scoreatual - scorecampeao);
            //se for claramente melhor
            if (scoreatual > scorecampeao && diferenca >= 5) {
                indice = i;
            } else if (diferenca < 5) {
                if (expectativaSalarial[i] < expectativaSalarial[indice]) {
                    indice = i;
                } else if (expectativaSalarial[i] == expectativaSalarial[indice]) {
                    if (experiencia[i] > experiencia[indice]) {
                        indice = i;
                    } else if (experiencia[i] == experiencia[indice]) {
                        if (atrasos[i] < atrasos[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] candidatos = {"A", "B", "C", "D"};
        double[] tecnica = {9, 9, 8.5, 9};
        double[] comportamental = {8, 9, 9, 9};
        int[] experiencia = {2, 3, 3, 4};
        int[] atrasos = {0, 1, 0, 0};
        double[] expectativaSalarial = {4000, 5000, 4500, 4200};
        int indice = selecaoultra(candidatos, tecnica, comportamental, experiencia, atrasos, expectativaSalarial);
    }
}
