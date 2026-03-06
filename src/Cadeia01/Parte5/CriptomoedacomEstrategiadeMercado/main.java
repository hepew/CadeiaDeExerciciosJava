package Cadeia01.Parte5.CriptomoedacomEstrategiadeMercado;

public class main {
    public static int criptomoeda(String moedas[],
                                  double volatilidade[],
                                  double valorizacao[],
                                  double volume[],
                                  double risco[]){
        int indice = 0;
        for(int i = 1; i < moedas.length; i++){
            boolean ativoestavel = volatilidade[i] <=5;
            boolean ativoarriscado = volatilidade[indice] <= 5;
            if(ativoestavel && !ativoarriscado){
                indice = i;
            }else if(!ativoestavel && ativoarriscado){
                continue;
            }else{
                if(ativoestavel){
                    if(valorizacao[i] > valorizacao[indice]){
                        indice = i;
                    }else if(valorizacao[i] == valorizacao[indice]){
                        if(volume[i] > volume[indice]){
                            indice = i;
                        }else if(volume[i] == volume[indice]){
                            if(risco[i] < risco[indice]){
                                indice = i;
                            }
                        }
                    }
                }else{
                    if(volume[i] > volume[indice]){
                        indice = i;
                    }else if(volume[i] == volume[indice]){
                        if(valorizacao[i] > valorizacao[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] moedas = {"A", "B", "C", "D"};
        double[] volatilidade = {3, 12, 5, 8};
        double[] valorizacao = {15, 40, 20, 25};
        double[] volume = {1000000, 2000000, 1500000, 1800000};
        double[] risco = {2, 9, 4, 6};
        int indice = criptomoeda(moedas, volatilidade, valorizacao, volume, risco);
    }
}
