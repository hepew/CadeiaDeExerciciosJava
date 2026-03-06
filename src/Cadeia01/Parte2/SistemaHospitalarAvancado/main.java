package Cadeia01.Parte2.SistemaHospitalarAvancado;
public class main {
    public static int maiorrisco(String pacientes[], int risco[], int idade[], boolean planopremium[], int tempoespera[]){
        int indice = 0;
        for(int i = 1; i < risco.length; i++){
            if(risco[i] > risco[indice]){
                indice = i;
            }else if(risco[i] == risco[indice]){
                if(tempoespera[i] > tempoespera[indice]){
                    indice = i;
                }else if(tempoespera[i] == tempoespera[indice]){
                    if(planopremium[i] && !planopremium[indice]){
                        indice = i;
                    }else if(planopremium[i] == planopremium[indice]){
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
        String[] pacientes = {"João", "Maria", "Pedro", "Carla", "Bruno"};
                           int[] risco = {4, 5, 5, 5, 5};
                        int[] idade = {60, 40, 80, 90, 80};
        boolean[] planopremium = {false, true, false, true, true};
                     int[] tempoespera = {30, 10, 50, 5, 50};
        int indice = maiorrisco(pacientes, risco, idade, planopremium, tempoespera);
        System.out.println("-----Paciente Com Maior Risco-----\nPaciente: "+pacientes[indice]+"\nRisco: "+risco[indice]+"\nIdade: "+idade[indice]+"\nPlano Premium: "+planopremium[indice]+"\nTempo de Espera: "+tempoespera[indice]);
    }
}
