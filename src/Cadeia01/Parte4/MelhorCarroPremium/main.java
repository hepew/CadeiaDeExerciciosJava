package Cadeia01.Parte4.MelhorCarroPremium;
public class main {
    public static int melhorcarro(String carros[], double potencia[], double consumo[], double preco[], int garantia[]){
        int indice = 0;
        for(int i = 1; i < carros.length; i++){
            if(potencia[i] > potencia[indice]){
                indice = i;
            }else if(potencia[i] == potencia[indice]){
                if(consumo[i] > consumo[indice]){
                    indice = i;
                }else if(consumo[i] == consumo[indice]){
                    if(garantia[i] > garantia[indice]){
                        indice = i;
                    }else if(garantia[i] == garantia[indice]){
                        if(preco[i] > preco[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] carros = {"A", "B", "C", "D"};
        double[] potencia = {200, 220, 220, 220};
        double[] consumo = {10, 9, 11, 11};
        double[] preco = {120000, 130000, 125000, 125000};
        int[] garantia = {3, 5, 4, 5};
        int indice = melhorcarro(carros, potencia, consumo, preco, garantia);
        System.out.println("Carro: "+carros[indice]+"\nPotência: "+potencia[indice]+"\nConsumo: "+consumo[indice]+"\nPreço: "+preco[indice]+"\nGarantia: "+garantia[indice]);
    }
}
