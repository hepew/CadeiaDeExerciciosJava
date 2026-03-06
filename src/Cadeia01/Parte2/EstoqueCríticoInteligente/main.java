package Cadeia01.Parte2.EstoqueCríticoInteligente;
public class main {
    public static int menorpreco(String produtos[], int quantidade[], double preco[]){
        int indice = 0;
        for(int i = 1; i < quantidade.length; i++) {
            if(quantidade[i] >= 10){
                continue;
            }
            if(quantidade[indice] > quantidade[i]){
                indice = i;
            }else if(quantidade[i] == quantidade[indice]){
                double valortotal = quantidade[i] * preco[i];
                double valorcampeao = quantidade[indice] * preco[indice];
                if(valortotal > valorcampeao){
                    indice = i;
                }else if(valortotal == valorcampeao){
                    if(preco[i] > preco[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"Arroz", "Feijão", "Macarrão", "Óleo", "Açúcar"};
        int[] quantidade = {5,20,8,3,3};
        double[] preco = {25.00, 8.00, 6.00, 10.00, 30.00};
        int indice = menorpreco(produtos, quantidade, preco);
        System.out.println("-----Estoque Crítico Inteligente-----\nProduto: "+produtos[indice]+"\nQuantidade: ("+quantidade[indice]+")\nPreço: ("+preco[indice]+")");
    }
}