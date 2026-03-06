package Cadeia01.Parte2.ProdutoMaisArriscadoFinanceiramente;
public class main {
    public static int produtoarriscado(String produtos[], int quantidade[], double custo[], double precovenda[]){
        int indice = 0;
        for(int i = 1; i < quantidade.length; i++){
            if(quantidade[i] >= 5){
                continue;
            }else{
                double lucrounitario = precovenda[i] - custo[i];
                double lucrounicampeao = precovenda[indice] - custo[indice];
                double riscofinanceiro = quantidade[i] * custo[i];
                double riscofincampeao = quantidade[indice] * custo[indice];
                if(riscofinanceiro < riscofincampeao){
                    indice = i;
                }else if(riscofinanceiro == riscofincampeao){
                    if(lucrounitario < lucrounicampeao){
                        indice = i;
                    }else if(lucrounitario == lucrounicampeao){
                        if(precovenda[i] > precovenda[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }

        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"Notebook", "Mouse", "Teclado", "Monitor", "Impressora"};
        int[] quantidade = {2, 50, 30, 5, 2};
        double[] custo = {3000, 50, 80, 900, 600};
        double[] precovenda = {4000, 80, 120, 1200, 750};
        int indice = produtoarriscado(produtos, quantidade, custo, precovenda);
        System.out.println("-----Maior Risco Financeiro-----\nProduto: "+produtos[indice]+"\nQuantidade: "+quantidade[indice]+"\nCusto: "+custo[indice]+"\nPrecoVenda: "+precovenda[indice]);
    }
}