package Cadeia01.Parte4.InvestimentoMaisInteligente;
public class main {
    public static int investimento(String investimentos[], double retornoPercentual[], double risco[], int tempoMeses[], double liquidez[]){
        int indice = 0;
        for(int i = 1; i < risco.length; i++){
            if(retornoPercentual[i] > retornoPercentual[indice]){
                indice = i;
            }else if(retornoPercentual[i] == retornoPercentual[indice]){
                if(risco[i] < risco[indice]){
                    indice = i;
                }else if(risco[i] == risco[indice]){
                    if(liquidez[i] > liquidez[indice]){
                        indice = i;
                    }else if(liquidez[i] == liquidez[indice]){
                        if(tempoMeses[i] < tempoMeses[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] investimentos = {"Ações", "Fundos", "Tesouro", "Cripto"};
        double[] retornoPercentual = {12.0, 12.0, 10.0, 12.0};
        double[] risco = {8.0, 5.0, 2.0, 9.0};
        int[] tempoMeses = {24, 36, 12, 18};
        double[] liquidez = {7.0, 9.0, 10.0, 6.0};
        int indice = investimento(investimentos, retornoPercentual, risco, tempoMeses, liquidez);
        System.out.println("Investimento: "+investimentos[indice]+"\nRetorno Percentual: "+retornoPercentual[indice]+"\nRisco: "+risco[indice]+"\nTempo (meses): "+tempoMeses[indice]+"\nLiquidez: "+liquidez[indice]);
    }
}
