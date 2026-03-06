package Cadeia01.Projetos;

public class SistemadeAprovacaodeCreditoBancario {
    public static int avaliarCredito(String clientes[],
                                     int idade[],
                                     double rendaMensal[],
                                     int scoreCredito[],
                                     double dividaAtual[],
                                     int anosEmprego[],
                                     boolean nomeNegativado[],
                                     boolean clienteAntigo[],
                                     int dependentes[]) {
        int indice = -1;
        double melhorScore = -999999;
        for (int i = 0; i < clientes.length; i++) {
            if (nomeNegativado[i] || scoreCredito[i] < 300) {
                continue;
            }
            double score = (scoreCredito[i] * 0.5)
                    + (rendaMensal[i] * 0.002)
                    + (anosEmprego[i] * 2)
                    - (dividaAtual[i] * 0.001)
                    - (dependentes[i] * 5);
            if (clienteAntigo[i]) score += 40;
            if (idade[i] >= 60) score += 20;
            if (anosEmprego[i] >= 10) score += 30;
            if (dividaAtual[i] > rendaMensal[i] * 4) score -= 50;
            if (score > melhorScore) {
                melhorScore = score;
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] clientes = {"Carlos", "Ana", "Roberto", "Fernanda", "Juliana"};
        int[] idade = {35, 62, 29, 45, 50};
        double[] rendaMensal = {5000, 12000, 3000, 8000, 7000};
        int[] scoreCredito = {720, 680, 280, 510, 450}; //0 a 1000
        double[] dividaAtual = {10000, 15000, 2000, 1000, 25000};
        int[] anosEmprego = {5, 20, 2, 8, 12};
        boolean[] nomeNegativado = {false, false, false, false, false};
        boolean[] clienteAntigo = {true, true, false, false, true};
        int[] dependentes = {2, 0, 1, 3, 2};
        int indice = avaliarCredito(clientes, idade, rendaMensal, scoreCredito, dividaAtual, anosEmprego, nomeNegativado, clienteAntigo, dependentes);
    }
}
