package Cadeia01.Parte4.CasoMedicoMaisCrítico;
public class main {
    public static int casomedico(String casos[], int riscoVida[], int dor[], int chanceRecuperacao[], int tempoInternado[]){
        int indice = 0;
        for(int i = 1; i < riscoVida.length; i++){
            if(riscoVida[i] > riscoVida[indice]){
                indice = i;
            }else if(riscoVida[i] == riscoVida[indice]){
                if(dor[i] > dor[indice]){
                    indice = i;
                }else if(dor[i] == dor[indice]){
                    if(chanceRecuperacao[i] > chanceRecuperacao[indice]){
                        indice = i;
                    }else if(chanceRecuperacao[i] == chanceRecuperacao[indice]){
                        if(tempoInternado[i] > tempoInternado[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] casos = {"Caso A", "Caso B", "Caso C", "Caso D"};
        int[] riscoVida = {5, 5, 5, 4};
        int[] dor = {8, 9, 9, 10};
        int[] chanceRecuperacao = {60, 50, 50, 80};
        int[] tempoInternado = {10, 20, 21, 5};
        int indice = casomedico(casos, riscoVida, dor, chanceRecuperacao, tempoInternado);
        System.out.println("Caso: "+casos[indice]+"\nRisco de vida: "+riscoVida[indice]+"\nDor: "+dor[indice]+"\nChance de Recuperação: "+chanceRecuperacao[indice]+"\nTempo Internado: "+tempoInternado[indice]);
    }
}
