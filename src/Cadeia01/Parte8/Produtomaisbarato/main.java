package Cadeia01.Parte8.Produtomaisbarato;

public class main {
    public static int melhorSmartphone(String modelos[],
                                       int bateria[],
                                       int camera[],
                                       double preco[],
                                       int armazenamento[],
                                       int resistenciaAgua[]) {
        int indice = 0;
        int limite = 6;
        for (int i = 1; i < preco.length; i++) {
            double scoreatual =
                    (bateria[i] * 0.002)
                            + (camera[i] * 2)
                            + (armazenamento[i] * 0.01)
                            + (resistenciaAgua[i] * 1.5)
                            - (preco[i] * 0.001);
            double scorecampeao = (bateria[indice] * 0.002)
                    + (camera[indice] * 2)
                    + (armazenamento[indice] * 0.01)
                    + (resistenciaAgua[indice] * 1.5)
                    - (preco[indice] * 0.001);
            double diferenca = Math.abs(scoreatual - scorecampeao);
            if (scoreatual > scorecampeao && diferenca >= limite) {
                indice = i;
                continue;
            } else if (diferenca < 6) {
                if (preco[i] < preco[indice]) {
                    indice = i;
                } else if (preco[i] == preco[indice]) {
                    if (camera[i] > camera[indice]) {
                        indice = i;
                    } else if (camera[i] == camera[indice]) {
                        if (bateria[i] > bateria[indice]) {
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] modelos = {"XPhone", "UltraCam", "PowerMax", "PhotoPro", "SpeedX"};
        int[] bateria = {4500, 4200, 5000, 4300, 4800};
        int[] camera = {8, 10, 7, 10, 9};
        double[] preco = {3500, 4200, 3300, 4100, 3700};
        int[] armazenamento = {128, 256, 128, 512, 256};
        int[] resistenciaAgua = {3, 5, 4, 5, 4};
        int indice = melhorSmartphone(modelos, bateria, camera, preco, armazenamento, resistenciaAgua);
    }
}
