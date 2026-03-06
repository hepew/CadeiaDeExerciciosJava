package Cadeia01.Parte5.SistemadePrioridadeAdaptativo;

public class main {
    public static int prioridadepaciente(String pacientes[], int risco[], int idade[], boolean emergencia[], int tempoEspera[]){
        int indice = 0;
        for(int i = 1; i < pacientes.length; i++){
            boolean atual = emergencia[i];
            boolean atualcampeao = emergencia[indice];

            //caso 1: um é emergência, outro não
            if(atual && !atualcampeao){
                indice = i;
            }
            //caso 2: o campeao é emergencia e o atual não
            else if(!atual && atualcampeao){
                continue;
            }
            //case 3: nenhum é emergência
            //ultimo, sempre ELSE
            else{
                if(risco[i] > risco[indice]){
                    indice = i;
                }else if(risco[i] == risco[indice]){
                    if(tempoEspera[i] > tempoEspera[indice]){
                        indice = i;
                    }else if(tempoEspera[i] == tempoEspera[indice]){
                        if(idade[i] > idade[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] pacientes = {"A", "B", "C", "D"};
        int[] risco = {5, 4, 5, 5};
        int[] idade = {30, 90, 70, 70};
        boolean[] emergencia = {false, true, false, false};
        int[] tempoEspera = {40, 10, 40, 30};
        int indice = prioridadepaciente(pacientes, risco, idade, emergencia, tempoEspera);
        System.out.println("Paciente: "+pacientes[indice]+"\nIdade: "+idade[indice]+"\nEmergência: "+emergencia[indice]+"\nTempo de espera: "+tempoEspera[indice]);
    }
}
