package Cadeia01.Projetos;

public class SistemadePrioridadedeCirurgia {
    public static int pacientePrioritario(String pacientes[],
                                          int idade[],
                                          int riscoVida[],
                                          int dor[],
                                          int tempoEsperaDias[],
                                          boolean doencaRara[],
                                          boolean crianca[],
                                          boolean idoso[],
                                          boolean planoPremium[]) {
        int indice = 0;
        for (int i = 1; i < idade.length; i++) {
            double scoreatual =
                    (riscoVida[i] * 5)
                            + (dor[i] * 2)
                            + (tempoEsperaDias[i] * 0.5);
            double scorecampeao = (riscoVida[indice] * 5)
                    + (dor[indice] * 2)
                    + (tempoEsperaDias[indice] * 0.5);
            if (scoreatual > scorecampeao) {
                indice = i;
            }
            if (riscoVida[i] > riscoVida[indice]) {
                indice = i;
                continue;
            } else if (riscoVida[i] == riscoVida[indice]) {
                if (dor[i] > dor[indice]) {
                    indice = i;
                    continue;
                } else if (tempoEsperaDias[i] > tempoEsperaDias[indice]) {
                    indice = i;
                    continue;
                }
                if (crianca[i] && !crianca[indice]) scoreatual += 1;
                if (crianca[indice] && !crianca[i]) scorecampeao += 1;
                if (idoso[i] && !idoso[indice]) scoreatual += 1;
                if (idoso[indice] && !idoso[i]) scorecampeao += 1;
                if (doencaRara[i] && !doencaRara[indice]) scoreatual += 1;
                if (doencaRara[indice] && !doencaRara[i]) scorecampeao += 1;
                if (planoPremium[i] && !planoPremium[indice]) scoreatual += 1;
                if (planoPremium[indice] && !planoPremium[i]) scorecampeao += 1;

            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String pacientes[] = {
                "Carlos",
                "Ana",
                "Roberto",
                "Fernanda",
                "Juliana",
                "Marcos"
        };

        int idade[] = {
                45,
                12,
                70,
                33,
                55,
                28
        };

        int riscoVida[] = {
                6,
                7,
                5,
                8,
                6,
                9
        };

        int dor[] = {
                7,
                9,
                5,
                8,
                6,
                7
        };

        int tempoEsperaDias[] = {
                10,
                5,
                20,
                3,
                15,
                2
        };

        boolean doencaRara[] = {
                false,
                true,
                false,
                false,
                true,
                false
        };

        boolean crianca[] = {
                false,
                true,
                false,
                false,
                false,
                false
        };

        boolean idoso[] = {
                false,
                false,
                true,
                false,
                true,
                false
        };

        boolean planoPremium[] = {
                false,
                true,
                false,
                true,
                false,
                false
        };
        int indice = pacientePrioritario(pacientes, idade, riscoVida, dor, tempoEsperaDias, doencaRara, crianca, idoso, planoPremium);
    }
}