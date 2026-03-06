package Cadeia01.Parte2.SistemadeTriagemAvançado;
public class main {
    public static int maiorrisco(String pacientes[], int risco[], int idade[], boolean planopremium[]){
        int indice = 0;
        for(int h = 0; h < risco.length; h++){
            if(risco[h] > risco[indice]){
                indice = h;
            }else if(risco[h] == risco[indice]){
              if(planopremium[h] && !planopremium[indice]){
                  indice = h;
              }else if(planopremium[h] == planopremium[indice]){
                  if(idade[h] > idade[indice]){
                      indice = h;
                  }
              }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] pacientes = {"João", "Maria", "Pedro", "Carla", "Bruno"};
        int[] risco = {4, 5, 5, 3, 5};
        int[] idade = {60, 40, 80, 90, 80};
        boolean[] planopremium = {false, true, false, true, true};
        int indice = maiorrisco(pacientes, risco, idade, planopremium);
        System.out.println("-----Paciente Maior Risco-----\nPaciente: "+pacientes[indice]+"\nRisco: "+risco[indice]+"\nIdade: "+idade[indice]+"\nPlano premium: "+planopremium[indice]);
    }
}
