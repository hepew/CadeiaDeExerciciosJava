package Cadeia01.Parte2.ProdutoMaisRentavel;
public class main {
    public static int melhorproduto(String produtos[], double custo[], double precovenda[], int quantidadevendida[], int devolucoes[]){
        int indice = 0;
        for(int i = 1; i < quantidadevendida.length; i++){
           double lucroreal = (precovenda[i] - custo[i]) * (quantidadevendida[i] - devolucoes[i]);
           double lucrocampeao = (precovenda[indice] - custo[indice]) * (quantidadevendida[indice] - devolucoes[indice]);
           if(lucroreal > lucrocampeao){
               indice = i;
           }else if(lucroreal == lucrocampeao){
               if(devolucoes[i] > devolucoes[indice]){
                   indice = i;
               }
           }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"Mouse", "Teclado", "Monitor", "Headaset"};
        double[] custo = {50, 80, 400, 120};
        double[] precovenda = {80, 120, 650, 200};
        int[] quantidadevendida = {100, 50, 10, 80};
        int[] devolucoes = {5, 2, 1, 10};
        int indice = melhorproduto(produtos, custo, precovenda, quantidadevendida, devolucoes);
        System.out.println("-----Produto Mais Rentável-----\nProduto: "+produtos[indice]+"\nCusto: "+custo[indice]+"\nPrecoVenda: "+precovenda[indice]+"\nQuantidade Vendida: "+quantidadevendida[indice]+"\nDevoluções: "+devolucoes[indice]);
    }
}
