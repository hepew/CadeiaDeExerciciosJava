package Cadeia01.Parte1.ClienteMaisImportante;
public class Main {
    public static int maiortotal(String clientes[], double totalcomprado[], int anosCliente[]){
        int indice = 0;
        for(int q = 1; q < totalcomprado.length; q++){
            if(totalcomprado[q] > totalcomprado[indice]){
                indice = q;
            }else if(totalcomprado[q] == totalcomprado[indice]){
                if(anosCliente[q] > anosCliente[indice]){
                    indice = q;
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] clientes = {"João", "Marina", "Carlos", "Fernanda"};
        double[] totalcomprado = {5000, 7000, 7000, 3000};
        int[] anosCliente = {2, 1, 5, 10};
        int indice = maiortotal(clientes, totalcomprado, anosCliente);
        System.out.println("-----Cliente Mais Importante-----\nCliente: "+clientes[indice]+"\nTotal Comprado: "+totalcomprado[indice]+"\nAnos Cliente: "+anosCliente[indice]);
    }
}
