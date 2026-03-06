package Cadeia01.Parte1.PacientePrioritario2_0;
public class main {
    public static int maiorrisco(String pacientes[], int risco[], int idade[]){
       int indice = 0;
       for(int c = 1; c < risco.length; c++){
           if(risco[c] > risco[indice]){
               indice = c;
           }else if(risco[c] == risco[indice]){
               if(idade[c] > idade[indice]){
                   indice = c;
               }
           }
       }
       return indice;
    }
    public static void main(String[] args) {
        String[] pacientes = {"João", "Maria", "Pedro", "Carla"};
        int[] risco = {4, 5, 5, 3};
        int[] idade = {60, 40, 80, 90};
        int indice = maiorrisco(pacientes, risco, idade);
        System.out.println("-----Paciente Prioritário 2.0-----\nPaciente: "+pacientes[indice]+"\nRisco: "+risco[indice]+"\nIdade: "+idade[indice]);
    }
}
