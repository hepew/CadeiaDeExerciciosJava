package Cadeia01.Parte5.JogadorcomEstrategiadeCampeonato;

public class main {
    public static int jogadorestrategiadecampeonato(String jogadores[],
                                                    double gols[],
                                                    double assistencias[],
                                                    double faltas[],
                                                    double minutos[]){
        int indice =0;
        for(int i = 1; i < gols.length; i++){
            boolean golsatual = gols[i] >= 20;
            boolean golscampeao = gols[indice] >=20;
            //caso 1
            if(golsatual && !golscampeao){
                indice = i;
            }
            //caso 2
            else if(!golsatual && golscampeao){
                continue;
            }
            //caso 3 >= 20 ATACANTE PRINCIPAL
            else{
                if(golsatual){
                    if(gols[i] > gols[indice]){
                        indice = i;
                    }else if(gols[i] == gols[indice]){
                        if(assistencias[i] > assistencias[indice]){
                            indice = i;
                        }else if(assistencias[i] == assistencias[indice]){
                            if(faltas[i] < faltas[indice]){
                                indice = i;
                            }
                        }
                    }
                }
                //ambos < 20 JOGADOR TÁTICO
                else{
                    if(assistencias[i] > assistencias[indice]){
                        indice = i;
                    }else if(assistencias[i] == assistencias[indice]){
                        if(faltas[i] < faltas[indice]){
                            indice = i;
                        }else if(faltas[i] == faltas[indice]){
                            if(minutos[i] > minutos[indice]){
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
        String[] jogadores = {"A", "B", "C", "D"};
        double[] gols = {20, 15, 30, 18};
        double[] assistencias = {10, 20, 5, 12};
        double[] faltas = {3, 5, 2, 4};
        double[] minutos = {2000, 2100, 1800, 1950};
    }
}
