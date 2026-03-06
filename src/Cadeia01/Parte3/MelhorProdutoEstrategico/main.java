package Cadeia01.Parte3.MelhorProdutoEstrategico;
public class main {
    public static int melhorproduto(String produtos[], double custo[], double preco[], int vendidos[], int devolvidos[]){
        int indice = 0;
        for(int i = 1; i < custo.length; i++){
            double lucroReal = (double) (preco[i] - custo[i]) * (vendidos[i] - devolvidos[i]);
            double lucroRealcampeao = (double) (preco[indice] - custo[indice]) * (vendidos[indice] - devolvidos[indice]);
            double taxaDevolucao = (double) devolvidos[i] / vendidos[i];
            double taxaDevolucaocampeao = (double) devolvidos[indice] / vendidos[indice];
            if(lucroReal > lucroRealcampeao){
                indice = i;
            }else if(lucroReal == lucroRealcampeao){
                if(taxaDevolucao < taxaDevolucaocampeao){
                    indice = i;
                }else if(taxaDevolucao == taxaDevolucaocampeao){
                    if(preco[i] > preco[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"A", "B", "C", "D"};
        double[] custo = {50, 40, 50, 50};
        double[] preco = {100, 90, 100, 100};
        int[] vendidos = {100, 200, 100, 100};
        int[] devolvidos = {5, 10, 2, 5};
        int indice = melhorproduto(produtos, custo, preco, vendidos, devolvidos);
        System.out.println("Produto: "+produtos[indice]+"\nCusto: "+custo[indice]+"\nPreço: "+preco[indice]+"\nVendidos: "+vendidos[indice]+"\nDevolvidos: "+devolvidos[indice]);
    }
}
