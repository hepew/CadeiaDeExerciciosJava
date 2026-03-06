package Cadeia01.Parte5.HospitalcomCenariodeEmergencia;

public class main {
    public static int hospitalemergencia(String hospitais[],
                                         double taxaOcupacao[],
                                         double avaliacao[],
                                         double tempoEspera[],
                                         double recursos[]){
        int indice= 0;
        for(int i = 1; i < taxaOcupacao.length; i++){
            boolean taxaocup = taxaOcupacao[i] >= 90;
            boolean taxacamp = taxaOcupacao[indice] >= 90;

            //caso 1:
            if(taxaocup && !taxacamp){
                indice = i;
            }else if(!taxaocup && taxacamp){
                continue;
            }else{
                if(taxaocup){
                    if(recursos[i] > recursos[indice]){
                        indice = i;
                    }else if(recursos[i] == recursos[indice]){
                        if(tempoEspera[i] < tempoEspera[indice]){
                            indice = i;
                        }
                    }
                }else{
                    if(avaliacao[i] > avaliacao[indice]){
                        indice = i;
                    }else if(avaliacao[i] == avaliacao[indice]){
                        if(tempoEspera[i] < tempoEspera[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] hospitais = {"A", "B", "C", "D"};
        double[] taxaOcupacao = {95, 70, 85, 60};
        double[] avaliacao = {4.5, 4.9, 4.7, 4.8};
        double[] tempoEspera = {30, 45, 20, 35};
        double[] recursos = {80, 60, 75, 90};
        int indice = hospitalemergencia(hospitais, taxaOcupacao, avaliacao, tempoEspera, recursos);
    }
}
