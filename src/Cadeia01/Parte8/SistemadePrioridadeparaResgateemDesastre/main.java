package Cadeia01.Parte8.SistemadePrioridadeparaResgateemDesastre;

public class main {
    public static int prioridadeResgate(String pessoas[],
                                        int idade[],
                                        int gravidadeFerimento[],
                                        int tempoPresoHoras[],
                                        boolean crianca[],
                                        boolean idoso[],
                                        boolean riscoMorte[]) {
        int indice = 0;
        int limite = 9;
        for (int i = 1; i < idade.length; i++) {
            if (riscoMorte[i] && !riscoMorte[indice]) {
                return i;
            }
            double score = (gravidadeFerimento[i] * 5)
                    + (tempoPresoHoras[i] * 2)
                    + (idade[i] * 0.05);
            double scorecampeao = (gravidadeFerimento[indice] * 5)
                    + (tempoPresoHoras[indice] * 2)
                    + (idade[indice] * 0.05);
            if (crianca[i] && !crianca[indice]) score += 4;
            if (crianca[indice] && !crianca[i]) scorecampeao += 4;
            if (idoso[i] && !idoso[indice]) score += 3;
            if (idoso[indice] && !idoso[i]) score += 3;
            double diferenca = Math.abs(score - scorecampeao);
            if (score > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < limite) {
                if (gravidadeFerimento[i] > gravidadeFerimento[indice]) {
                    indice = i;
                } else if (gravidadeFerimento[i] == gravidadeFerimento[indice]) {
                    if (tempoPresoHoras[i] > tempoPresoHoras[indice]) {
                        indice = i;
                    } else if (tempoPresoHoras[i] == tempoPresoHoras[indice]) {
                        if (idade[i] > idade[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pessoas = {"Carlos", "Ana", "Roberto", "Juliana", "Pedro"};
        int[] idade = {40, 8, 72, 30, 55};
        int[] gravidadeFerimento = {6, 8, 7, 5, 9};
        int[] tempoPresoHoras = {10, 6, 8, 12, 4};
        boolean[] crianca = {false, true, false, false, false};
        boolean[] idoso = {false, false, true, false, false};
        boolean[] riscoMorte = {false, true, false, false, true};
        int indice = prioridadeResgate(pessoas, idade, gravidadeFerimento, tempoPresoHoras, crianca, idoso, riscoMorte);
    }
}
