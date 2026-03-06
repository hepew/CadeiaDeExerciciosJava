package Cadeia01.Parte5.ProdutocomMercadoInstavel;
public class main {
    public static int mercadoinstavel(String produtos[],
                                      double demanda[],
                                      double margemLucro[],
                                      double estoque[],
                                      double variacaoPreco[]){
        int indice = 0;
        for(int i = 1; i < produtos.length; i++){
            boolean estavel = variacaoPreco[i] <= 5;
            boolean volatil = variacaoPreco[indice] <= 5;

            //caso 1:
            if(estavel && !volatil){
                indice = i;
            }
            //caso 2:
            else if(!estavel && volatil){
                continue;
            }
            //caso 3:
            //ambos ESTAVEIS
            else{
                if(estavel){
                    if(demanda[i] > demanda[indice]){
                        indice = i;
                    }else if(demanda[i] == demanda[indice]){
                        if(margemLucro[i] > margemLucro[indice]){
                            indice = i;
                        }else if(margemLucro[i] == margemLucro[indice]){
                            if(estoque[i] < estoque[indice]){
                                indice = i;
                            }
                        }
                    }
                }
                //AMBOS VOlÁTEIS
                else{
                    if(margemLucro[i] > margemLucro[indice]){
                        indice = i;
                    }else if(margemLucro[i] == margemLucro[indice]){
                        if(estoque[i] < estoque[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"A", "B", "C", "D"};
        double[] demanda = {500, 300, 700, 450};
        double[] margemLucro = {20, 35, 15, 25};
        double[] estoque = {1000, 500, 1200, 800};
        double[] variacaoPreco = {5, 12, 3, 7};
        int indice = mercadoinstavel(produtos, demanda, margemLucro, estoque, variacaoPreco);

    }
}
