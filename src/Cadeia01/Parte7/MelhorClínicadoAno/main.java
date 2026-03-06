package Cadeia01.Parte7.MelhorClínicadoAno;

public class main {
    public static int melhorClinica(String nome[],
                                    double avaliacaoPacientes[],
                                    int numeroEspecialidades[],
                                    int tempoMedioEspera[],
                                    int reclamacoes[],
                                    double custoConsulta[]) {
        int indice = 0;
        double limite = 1.5;
        for (int i = 1; i < reclamacoes.length; i++) {
            double scoreatual = (avaliacaoPacientes[i] * 0.5)
                    + (numeroEspecialidades[i] * 0.3)
                    - (tempoMedioEspera[i] * 0.1)
                    - (reclamacoes[i] * 0.4);
            double scorecampeao = (avaliacaoPacientes[indice] * 0.5)
                    + (numeroEspecialidades[indice] * 0.3)
                    - (tempoMedioEspera[indice] * 0.1)
                    - (reclamacoes[indice] * 0.4);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (custoConsulta[i] < custoConsulta[indice]) {
                    indice = i;
                } else if (custoConsulta[i] == custoConsulta[indice]) {
                    if (reclamacoes[i] < reclamacoes[indice]) {
                        indice = i;
                    } else if (reclamacoes[i] == reclamacoes[indice]) {
                        if (avaliacaoPacientes[i] > avaliacaoPacientes[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] nome = {"Vida+", "SaudeMax", "ClinBem", "TotalCare"};
        double[] avaliacaoPacientes = {8.5, 9.0, 8.8, 9.1};
        int[] numeroEspecialidades = {10, 8, 12, 9};
        int[] tempoMedioEspera = {30, 20, 40, 25};
        int[] reclamacoes = {5, 3, 4, 2};
        double[] custoConsulta = {200, 250, 180, 220};
        int indice = melhorClinica(nome, avaliacaoPacientes, numeroEspecialidades, tempoMedioEspera, reclamacoes, custoConsulta);
    }
}
