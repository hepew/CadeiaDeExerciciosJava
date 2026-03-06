package Cadeia01.Parte8.MelhorNotebook;

public class main {
    public static int melhorNotebook(String modelos[],
                                     int ram[],
                                     int armazenamento[],
                                     int bateria[],
                                     double preco[],
                                     int peso[]) {
        int indice = 0;
        int limite = 6;
        for (int i = 1; i < peso.length; i++) {
            if (preco[i] < preco[indice]) {
                indice = i;
            } else if (preco[i] == preco[indice]) {
                if (ram[i] > ram[indice]) {
                    indice = i;
                } else if (ram[i] == ram[indice]) {
                    if (peso[i] < peso[indice]) {
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] modelos = {"NoteX", "UltraBook", "PowerLap", "SpeedBook", "LitePro"};
        int[] ram = {16, 8, 32, 16, 8};
        int[] armazenamento = {512, 256, 1024, 512, 256};
        int[] bateria = {8, 10, 7, 9, 11};
        double[] preco = {5500, 4200, 8000, 6000, 3900};
        int[] peso = {1800, 1500, 2200, 1700, 1400};
        int indice = melhorNotebook(modelos, ram, armazenamento, bateria, preco, peso);
    }
}
