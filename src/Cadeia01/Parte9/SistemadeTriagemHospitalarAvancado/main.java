package Cadeia01.Parte9.SistemadeTriagemHospitalarAvancado;

public class main {
    public static int pacientePrioritario(String pacientes[],
                                          int idade[],
                                          int gravidade[],
                                          int dor[],
                                          int tempoEsperaMin[],
                                          boolean riscoVida[],
                                          boolean doencaCronica[],
                                          boolean gravida[],
                                          boolean crianca[],
                                          boolean idoso[],
                                          boolean deficiencia[],
                                          boolean planoPremium[],
                                          int historicoInternacoes[]) {
        int indice = 0;
        int limite = 6;
        for (int i = 1; i < dor.length; i++) {
            if (riscoVida[i] && !riscoVida[indice]) {
                indice = i;
                continue;
            }
            double score = (gravidade[i] * 5)
                    + (dor[i] * 2)
                    + (tempoEsperaMin[i] * 0.05)
                    + (historicoInternacoes[i] * 0.5);
            double scorecampeao = (gravidade[indice] * 5)
                    + (dor[indice] * 2)
                    + (tempoEsperaMin[indice] * 0.05)
                    + (historicoInternacoes[indice] * 0.5);

            if (crianca[i] && !crianca[indice]) score += 4;
            if (crianca[indice] && !crianca[i]) scorecampeao += 4;
            if (idoso[i] && !idoso[indice]) score += 3;
            if (idoso[indice] && !idoso[i]) scorecampeao += 3;
            if (gravida[i] && !gravida[indice]) score += 3;
            if (gravida[indice] && !gravida[i]) scorecampeao += 3;
            if (deficiencia[i] && !deficiencia[indice]) score += 2;
            if (deficiencia[indice] && !deficiencia[i]) scorecampeao += 2;
            if (doencaCronica[i] && !doencaCronica[indice]) score += 1;
            if (doencaCronica[indice] && !doencaCronica[i]) scorecampeao += 1;
            if (planoPremium[i] && !planoPremium[indice]) score += 1;
            if (planoPremium[indice] && !planoPremium[i]) score += 1;

            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (gravidade[i] > gravidade[indice]) {
                    indice = i;
                } else if (gravidade[i] == gravidade[indice]) {
                    if (dor[i] > dor[indice]) {
                        indice = i;
                    } else if (dor[i] == dor[indice]) {
                        if (tempoEsperaMin[i] > tempoEsperaMin[indice]) {
                            indice = i;
                        } else if (tempoEsperaMin[i] == tempoEsperaMin[indice]) {
                            if (idade[i] > idade[indice]) {
                                indice = i;
                            } else if (idade[i] == idade[indice]) {
                                if (historicoInternacoes[i] > historicoInternacoes[indice]) {
                                    indice = i;
                                }
                            }
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pacientes = {
                "Carlos",
                "Ana",
                "Roberto",
                "Fernanda",
                "Juliana",
                "Marcos",
                "Patricia",
                "Lucas"
        };

        int[] idade = {
                45,
                32,
                70,
                28,
                60,
                10,
                50,
                38
        };

        int[] gravidade = {
                7,
                6,
                8,
                5,
                6,
                7,
                9,
                6
        };

        int[] dor = {
                8,
                5,
                7,
                6,
                6,
                9,
                8,
                4
        };

        int[] tempoEsperaMin = {
                40,
                20,
                35,
                15,
                60,
                25,
                10,
                50
        };

        boolean[] riscoVida = {
                false,
                false,
                false,
                false,
                false,
                false,
                true,
                false
        };

        boolean[] doencaCronica = {
                true,
                false,
                true,
                false,
                true,
                false,
                false,
                true
        };

        boolean[] gravida = {
                false,
                true,
                false,
                false,
                false,
                false,
                false,
                false
        };

        boolean[] crianca = {
                false,
                false,
                false,
                false,
                false,
                true,
                false,
                false
        };

        boolean[] idoso = {
                false,
                false,
                true,
                false,
                true,
                false,
                false,
                false
        };

        boolean[] deficiencia = {
                false,
                false,
                false,
                false,
                true,
                false,
                false,
                false
        };

        boolean[] planoPremium = {
                false,
                true,
                false,
                false,
                false,
                false,
                true,
                false
        };

        int[] historicoInternacoes = {
                3,
                1,
                5,
                0,
                4,
                2,
                6,
                1
        };
        int indice = pacientePrioritario(pacientes, idade, gravidade, dor, tempoEsperaMin, riscoVida, doencaCronica, gravida, crianca, idoso, deficiencia, planoPremium, historicoInternacoes);
    }
}
