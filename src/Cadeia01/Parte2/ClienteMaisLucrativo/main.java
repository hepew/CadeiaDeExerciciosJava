package Cadeia01.Parte2.ClienteMaisLucrativo;
public class main {
    public static int clientelucrativo(String clientes[], double totalcomprado[], double custoatendimento[], int anoscliente[]){
        int indice = -1;
        for(int i = 0; i < totalcomprado.length; i++){
            double lucroatual = totalcomprado[i] - custoatendimento[i];
            //ignora lucro negativo
            if(lucroatual < 0){
                continue;
            }
            //se ainda não existir campeão
            if(indice == -1){
                indice = i;
                continue;
            }
            double lucrocampeao = totalcomprado[indice] - custoatendimento[indice];
            if(lucroatual > lucrocampeao){
                indice = i;
            }else if(lucroatual == lucrocampeao){
                if(anoscliente[i] > anoscliente[indice]){
                    indice = i;
                }else if(anoscliente[i] == anoscliente[indice]){
                    if(custoatendimento[i] < custoatendimento[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] clientes = {"João", "Marina", "Carlos", "Fernanda", "Ricardo"};
        double[] totalcomprado = {10000, 20000, 20000, 5000, 20000};
        double[] custoatendimento = {2000, 5000, 3000, 1000, 4000};
                        int[] anoscliente = {2, 1, 5, 10, 5};
        int indice = clientelucrativo(clientes, totalcomprado, custoatendimento, anoscliente);
        System.out.println("-----Cliente Mais Lucrativo-----\nClientes: "+clientes[indice]+"\nTotal Comprado: "+totalcomprado[indice]+"\nCusto atendimento: "+custoatendimento[indice]+"\nAnos Cliente: "+anoscliente[indice]);
    }
}