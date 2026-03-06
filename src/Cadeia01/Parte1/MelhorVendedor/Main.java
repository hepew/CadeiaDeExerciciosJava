package Cadeia01.Parte1.MelhorVendedor;
public class Main {
    public static int totaldevendas(String vendedores[], int vendas[], double totalvendido[]){
        int maiornumero = 0;
        for(int i = 1; i < vendas.length; i++){
            if(vendas[i] > vendas[maiornumero]){
                maiornumero = i;
            }else if(vendas[i] == vendas[maiornumero]){
                if(totalvendido[i] > totalvendido[maiornumero]){
                    maiornumero = i;
                }
            }
        }
        return maiornumero;
    }
    public static void main(String[] args) {
        String[] vendedores = {"Ana", "Carlos", "Marcos", "Julia"};
        int[] vendas = {30, 45, 45, 20};
        double[] totalvendido = {5000, 7000, 6800, 3000};
        int indice = totaldevendas(vendedores,vendas, totalvendido);
        System.out.println("Funcionário com maior número de vendas: "+vendedores[indice]);
    }
}