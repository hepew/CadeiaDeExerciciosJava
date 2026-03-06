package Cadeia01.Parte3.MelhorCarroCustoBeneficio;
public class main {
    public static int carrocustobeneficio(String carros[], double preco[], double consumo[], int garantia[]){
        int indice = 0;
        for(int c = 1; c < carros.length; c++){
            if(consumo[c] > consumo[indice]){
                indice = c;
            }else if(consumo[c] == consumo[indice]){
                if(garantia[c] > garantia[indice]){
                    indice = c;
                }else if(garantia[c] == garantia[indice]){
                    if(preco[c] < preco[indice]){
                        indice = c;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] carros = {"Modelo A", "Modelo B", "Modelo C", "Modelo D"};
        double[] preco = {70000, 90000, 90000, 85000};
        double[] consumo = {12.0, 10.0, 12.0, 14.0}; //Km por litro
        int[] garantia = {3, 5, 4, 3}; //anos
        int indice = carrocustobeneficio(carros, preco, consumo, garantia);
        System.out.println("-----Carro Custo-Benefício-----\nCarro: "+carros[indice]+"\nPreço: "+preco[indice]+"\nConsumo(km/l): "+consumo[indice]+"\nGarantia (anos): "+garantia[indice]);
    }
}