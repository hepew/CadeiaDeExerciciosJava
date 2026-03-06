package Cadeia01.Parte1.EstoqueCritico;
public class main {
    public static int menorquantidade(String produtos[], int quantidade[], double preco[]){
        int indice = 0;
        for(int i = 1; i < quantidade.length; i++){
            if(quantidade[i] < quantidade[indice]){
                indice = i;
            }else if(quantidade[i] == quantidade[indice]){
                double valorAtual = quantidade[i] * preco[i];
                double valorCampeao = quantidade[indice] * preco[indice];
                if(valorAtual > valorCampeao){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"Arroz", "Feijão", "Macarrão", "Óleo"};
        int[] quantidade = {5, 20, 8, 3};
        double[] preco = {25.00, 8.00, 16.00, 10.00};
        int indice = menorquantidade(produtos, quantidade, preco);
        System.out.println("Menor quantidade\nProduto: "+produtos[indice]+"\nQuantidade: "+quantidade[indice]+"\nValor: "+preco[indice]);
    }
}