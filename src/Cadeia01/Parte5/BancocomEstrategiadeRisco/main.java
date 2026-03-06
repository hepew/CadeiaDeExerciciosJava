package Cadeia01.Parte5.BancocomEstrategiadeRisco;
public class main {
    public static int bancoestrategico(String bancos[],
                                       double inadimplencia[],
                                       double lucro[],
                                       double capital[],
                                       double crescimentoCarteira[]){
        int posicao = 0;
        for(int i = 1; i < bancos.length; i++){
            boolean atual = inadimplencia[i] <= 4;
            boolean atualcamp = inadimplencia[posicao] <= 4;

            //caso 1 atual é conservador e campeão não
           if(atual && !atualcamp){
               posicao = i;
           }
            //caso 2 campeão é conservador e atual não
            else if(!atual && atualcamp){
                continue;
            }
            //caso 3 AMBOS DO MESMO TIPO;
            else{
                if(atual){
                    if(lucro[i] > lucro[posicao]){
                        posicao = i;
                    }else if(lucro[i] == lucro[posicao]){
                        if(capital[i] > capital[posicao]){
                            posicao = i;
                        }else if(capital[i] == capital[posicao]){
                            if(crescimentoCarteira[i] > crescimentoCarteira[posicao]){
                                posicao = i;
                            }
                        }
                    }
                }
                //AMBOS ARRISCADOS
               else{
                   if(crescimentoCarteira[i] > crescimentoCarteira[posicao]){
                       posicao = i;
                   }else if(crescimentoCarteira[i] == crescimentoCarteira[posicao]){
                       if(lucro[i] > lucro[posicao]){
                           posicao = i;
                       }
                   }
                }
            }
        }
        return posicao;
    }
    public static void main(String[] args) {
        String[] bancos = {"A", "B", "C", "D"};
        double[] inadimplencia = {3, 8, 4, 2};
        double[] lucro = {500000, 900000, 700000, 400000};
        double[] capital = {2000000, 1500000, 1800000, 2200000};
        double[] crescimentoCarteira = {10, 25, 15, 8};
        int indice = bancoestrategico(bancos, inadimplencia, lucro, capital, crescimentoCarteira);
        System.out.println("Bancos: "+bancos[indice]+"\nInadimplencia: "+inadimplencia[indice]+"\nLucro: "+lucro[indice]+"\nCapital: "+capital[indice]+"\nCrescimento Carteira"+crescimentoCarteira[indice]);
    }
}
