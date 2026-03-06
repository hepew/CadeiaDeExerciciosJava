package Cadeia01.Parte1.ProdutoMaisLucrativo;
public class main {
    public static int lucroTotal(String produtos[], double custo[], double precoVenda[], int quantidade[]){
        int indice = 0;
        for(int i = 1; i < custo.length; i++){
           double lucrototal = (precoVenda[i] - custo[i]) * quantidade[i];
           double lucrocampeao = (precoVenda[indice] - custo[indice]) * quantidade[indice];
           if(lucrototal > lucrocampeao){
               indice = i;
           }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"Mouse", "Teclado", "Monitor", "Headset"};
        double[] custo = {50, 80, 400, 120};
        double[] precoVenda = {80, 120, 650, 200};
        int[] quantidade = {10, 5, 3, 8};
        int indice = lucroTotal(produtos, custo, precoVenda, quantidade);
        System.out.println("-----Maior Lucro Total-----\nProduto: "+produtos[indice]+"\nCusto: "+custo[indice]+"\nPreço de venda: "+precoVenda[indice]+"\nQuantidade: "+quantidade[indice]);
    }
}
