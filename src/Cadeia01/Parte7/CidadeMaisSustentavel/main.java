package Cadeia01.Parte7.CidadeMaisSustentavel;

public class main {
    public static int cidadeMaisSustentavel(String cidade[],
                                            double energiaRenovavel[],
                                            double areaVerde[],
                                            double poluicao[],
                                            double reciclado[]) {
        int posicao = -1;
        for (int i = 0; i < poluicao.length; i++) {
            if (poluicao[i] < 0) {
                continue;
            }
            if (posicao == -1) {
                posicao = i;
                continue;
            }
            double indiceatual = (energiaRenovavel[i] * 0.35)
                    + (areaVerde[i] * 0.25)
                    + (reciclado[i] * 0.25)
                    - (poluicao[i] * 0.4);
            double indicecampeao = (energiaRenovavel[posicao] * 0.35)
                    + (areaVerde[posicao] * 0.25)
                    + (reciclado[posicao] * 0.25)
                    - (poluicao[posicao] * 0.4);
            if (indiceatual > indicecampeao) {
                posicao = i;
            } else if (indiceatual == indicecampeao) {
                if (poluicao[i] < poluicao[posicao]) {
                    posicao = i;
                } else if (poluicao[i] == poluicao[posicao]) {
                    if (energiaRenovavel[i] > energiaRenovavel[posicao]) {
                        posicao = i;
                    }
                }
            }
        }
        return posicao;
    }

    public static void main(String[] args) {
        String cidade[] = {
                "Cidade Verde",
                "EcoVille",
                "Poluópolis",
                "Nova Esperança",
                "BioCity"
        };
        double energiaRenovavel[] = {60, 75, 20, 55, 80};
        double areaVerde[] = {40, 35, 10, 50, 45};
        double poluicao[] = {30, 25, 90, 28, -5}; // ⚠️ BioCity deve ser ignorada
        double reciclado[] = {50, 65, 15, 45, 70};
        int indice = cidadeMaisSustentavel(cidade, energiaRenovavel, areaVerde, poluicao, reciclado);
    }
}
