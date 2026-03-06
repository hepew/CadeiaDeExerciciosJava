package Cadeia01.Parte8.SistemadeSelecaodeAstronautas;

public class main {
    public static int melhorAstronauta(String candidatos[],
                                       int idade[],
                                       int horasVoo[],
                                       int resistenciaFisica[],
                                       int inteligencia[],
                                       boolean problemasSaude[],
                                       boolean experienciaMilitar[],
                                       int missoesSimuladas[]) {
        int indice = 0;
        int limite = 10;
        for (int i = 1; i < inteligencia.length; i++) {
            if (problemasSaude[i] && !problemasSaude[indice]) {
                continue;
            }
            double score = (horasVoo[i] * 0.01)
                    + (resistenciaFisica[i] * 3)
                    + (inteligencia[i] * 0.2)
                    + (missoesSimuladas[i] * 1.5);
            double scorecampeao = (horasVoo[i] * 0.01)
                    + (resistenciaFisica[i] * 3)
                    + (inteligencia[i] * 0.2)
                    + (missoesSimuladas[i] * 1.5);
            if (experienciaMilitar[i] && !experienciaMilitar[indice]) score += 5;
            if (experienciaMilitar[indice] && !experienciaMilitar[i]) scorecampeao += 5;
            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca > limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (missoesSimuladas[i] > missoesSimuladas[indice]) {
                    indice = i;
                } else if (missoesSimuladas[i] == missoesSimuladas[indice]) {
                    if (resistenciaFisica[i] > resistenciaFisica[indice]) {
                        indice = i;
                    } else if (resistenciaFisica[i] == resistenciaFisica[indice]) {
                        if (idade[i] < idade[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] candidatos = {"Carlos", "Ana", "Roberto", "Juliana", "Marcos"};
        int[] idade = {35, 29, 42, 31, 38};
        int[] horasVoo = {1200, 800, 2000, 950, 1500};
        int[] resistenciaFisica = {8, 9, 7, 9, 8};
        int[] inteligencia = {130, 140, 125, 135, 128};
        boolean[] problemasSaude = {false, false, true, false, false};
        boolean[] experienciaMilitar = {true, false, true, false, true};
        int[] missoesSimuladas = {15, 10, 20, 12, 18};
        int indice = melhorAstronauta(candidatos, idade, horasVoo, resistenciaFisica, inteligencia, problemasSaude, experienciaMilitar, missoesSimuladas);
    }
}
