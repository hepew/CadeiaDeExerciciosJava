package Cadeia01.Parte4.ProdutoMaisEstrategicoGlobal;
public class main {
    public static int produtoestrategico(String produtos[], double margemLucro[], double vendas[], double custoLogistico[], double satisfacaoCliente[], int devolucoes[]){
        int indice = 0;
        for(int i = 1; i < produtos.length; i++){
            if(margemLucro[i] > margemLucro[indice]){
                indice = i;
            }else if(margemLucro[i] == margemLucro[indice]){
                if(vendas[i] > vendas[indice]){
                    indice = i;
                }else if(vendas[i] == vendas[indice]){
                    if(custoLogistico[i] < custoLogistico[indice]){
                        indice = i;
                    }else if(custoLogistico[i] == custoLogistico[indice]){
                        if(satisfacaoCliente[i] > satisfacaoCliente[indice]){
                            indice = i;
                        }else if(satisfacaoCliente[i] == satisfacaoCliente[indice]){
                            if(devolucoes[i] < devolucoes[indice]){
                                indice = i;
                            }
                        }
                    }
                }
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] produtos = {"A", "B", "C", "D"};
        double[] margemLucro = {30, 30, 30, 30};
        double[] vendas = {10_000, 10_000, 9_000, 10_000};
        double[] custoLogistico = {5_000, 4_000, 4_000, 4_000};
        double[] satisfacaoCliente = {8.5, 9.0, 9.0, 9.0};
        int[] devolucoes = {100, 80, 80, 60};
        int indice = produtoestrategico(produtos, margemLucro, vendas, custoLogistico, satisfacaoCliente, devolucoes);
        System.out.println("Produto: "+produtos[indice]+"\nMargemLucro: "+margemLucro[indice]+"\nVendas: "+vendas[indice]+"\nCusto Logístico: "+custoLogistico[indice]+"\nSatisfação Cliente: "+satisfacaoCliente[indice]+"\nDevoluções: "+devolucoes[indice]);
    }
}
