package Cadeia01.Parte3.PrioridadeHospitalarComplexa;
public class main {
    public static int prioridadehosp(String pacientes[], int risco[], int dor[], int idade[], int tempoEspera[]){
        int indice = 0;
        for(int i = 1; i < dor.length; i++){
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
        return indice;
    }
    public static void main(String[] args) {
        String[] pacientes = {"João", "Maria", "Pedro", "Carla", "Bruno"};
        int[] risco = {5, 5, 5, 4, 5};
        int[] dor = {7, 9, 9, 10, 9};
        int[] idade = {60, 30, 80, 90, 81};
        int[] tempoEspera = {20, 50, 50, 5, 50};
        int indice = prioridadehosp(pacientes, risco, dor, idade, tempoEspera);
        System.out.println("Paciente: "+pacientes[indice]+"\nDor: "+dor[indice]+"\nIdade: "+idade[indice]+"\nTempo de Espera: "+tempoEspera[indice]);
    }
}
