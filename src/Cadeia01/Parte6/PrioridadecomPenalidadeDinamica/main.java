package Cadeia01.Parte6.PrioridadecomPenalidadeDinamica;

public class main {
    public static int prioridadepenalidadedinamica(String pacientes[],
                                                   int risco[],
                                                   int idade[],
                                                   int tempoespera[],
                                                   boolean fumante[]) {
        int indice = 0;
        for (int i = 1; i < risco.length; i++) {
            double prioridadeatual = risco[i] * 3 + tempoespera[i];
            double prioridadecampeao = risco[indice] * 3 + tempoespera[indice];
            //penalidade
            if (fumante[i]) {
                prioridadeatual -= 5;
            }
            if (fumante[indice]) {
                prioridadecampeao -= 5;
            }
            //comparação principal
            if (prioridadeatual > prioridadecampeao) {
                indice = i;
            } else if (prioridadeatual == prioridadecampeao) {
                if (idade[i] > idade[indice]) {
                    indice = i;
                } else if (idade[i] == idade[indice]) {
                    if (risco[i] > risco[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pacientes = {"A", "B", "C", "D"};
        int[] risco = {5, 5, 4, 5};
        int[] idade = {60, 30, 90, 70};
        int[] tempoEspera = {20, 50, 40, 50};
        boolean[] fumante = {true, false, true, false};
        prioridadepenalidadedinamica(pacientes, risco, idade, tempoEspera, fumante);
    }
}