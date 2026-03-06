package Cadeia01.Parte1.ProdutoMaisProblematico;
public class Main {
    public static int menorquantidade(String produtos[], int quantidade[], double preco[]){
        int indice = 0;
        for(int i = 1; i < quantidade.length; i++){
            if(quantidade[i] < quantidade[indice]){
                indice = i;
            }else if(quantidade[i] == quantidade[indice]){
                double valortotal = quantidade[i] * preco[i];
                double valorCampeao = quantidade[indice] * preco[indice];
                if(valortotal > valorCampeao){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"Arroz", "Feijjão", "Macarrão", "Óleo"};
        int[] quantidade = {5,5,8,5};
        double[] preco = {25.00, 10.00, 6.00, 12.00};
        int indice = menorquantidade(produtos, quantidade, preco);
        System.out.println("----Menor quantidade---- \nProduto: "+produtos[indice]+"\nQuantidade: "+quantidade[indice]+"\nPreço: "+preco[indice]);
    }
}