package Cadeia01.Parte6.BolsadeEstudosPremium;

public class main {
    public static int bolsaElite(String alunos[],
                                 double notaAcademica[],
                                 double notaProjeto[],
                                 int atividadesExtracurriculares[],
                                 int rendaFamiliar[],
                                 int faltas[]) {
        int indice = 0;
        double limite = 0.5;
        for (int i = 1; i < faltas.length; i++) {
            double scoreatual = (notaAcademica[i] * 0.5) + (notaProjeto[i] * 0.3) + (atividadesExtracurriculares[i] * 0.2) - (faltas[i] * 0.5);
            double scorecampeao = (notaAcademica[indice] * 0.5) + (notaProjeto[indice] * 0.3) + (atividadesExtracurriculares[indice] * 0.2) - (faltas[indice] * 0.5);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
            } else if (diferenca < limite) {
                if (rendaFamiliar[i] < rendaFamiliar[indice]) {
                    indice = i;
                } else if (rendaFamiliar[i] == rendaFamiliar[indice]) {
                    if (notaAcademica[i] > notaAcademica[indice]) {
                        indice = i;
                    } else if (notaAcademica[i] == notaAcademica[indice]) {
                        if (faltas[i] < faltas[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] alunos = {"Lucas", "Marina", "Pedro", "Juliana"};
        double[] notaAcademica = {8.5, 9.0, 8.8, 9.0};
        double[] notaProjeto = {9.0, 8.5, 9.2, 8.8};
        int[] atividadesExtracurriculares = {5, 4, 6, 3};
        int[] rendaFamiliar = {3000, 5000, 2500, 2800};
        int[] faltas = {2, 1, 0, 3};
    }
}
