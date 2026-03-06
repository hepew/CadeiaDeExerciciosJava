package Cadeia01.Parte5.StartupcomEstrategiaCondicional;
public class main {
    public static int estrategiacondicional(String startups[], double crescimento[], double lucro[], double investimento[], double churn[]){
        int indice = 0;
        for(int i = 1; i < startups.length; i++){
           boolean atual = crescimento[i] >= 200;
           boolean campeao = crescimento[indice] >= 200;

           // Caso 1: Um é high growth e outro não (uma é 200, a outra não)
            if(!atual && !campeao){
               indice = i;
           }else if(!atual && campeao){
               continue;
           }

            // Caso 2: Ambos high growth (ambas de 200)
            else if(atual && campeao){
                    if(lucro[i] > lucro[indice]){
                        indice = i;
                    }else if(lucro[i] == lucro[indice]){
                        if(churn[i] < churn[indice]){
                            indice = i;
                        }else if(churn[i] == churn[indice]){
                            if(investimento[i] < investimento[indice]){
                                indice = i;
                            }
                        }
                    }
                }
                // Caso 3: Ambos baixo crescimento (ambas menos de 200)
                else{
                    if(crescimento[i] > crescimento[indice]){
                        indice = i;
                    }else if(crescimento[i] == crescimento[indice]){
                        if(lucro[i] > lucro[indice]){
                            indice = i;
                        }
                    }
                }
            }
        return indice;
    }
    public static void main(String[] args) {
        String[] startups = {"A", "B", "C", "D"};
        double[] crescimento = {200, 170, 150, 200};
        double[] lucro = {100000, 50000, 200000, 100000};
        double[] investimento = {500000, 200000, 300000, 400000};
        double[] churn = {5, 3, 4, 3};
        int indice = estrategiacondicional(startups, crescimento, lucro, investimento, churn);
        System.out.println("Startup: "+startups[indice]+"\nCrescimento: "+crescimento[indice]+"\nLucro: "+lucro[indice]+"\nInvestimento: "+investimento[indice]+"\nChurn: "+churn[indice]);
    }
}