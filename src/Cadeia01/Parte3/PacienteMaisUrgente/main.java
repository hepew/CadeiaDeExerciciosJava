package Cadeia01.Parte3.PacienteMaisUrgente;
public class main {
    public static int pacienteurgente(String pacientes[], int risco[], int dor[], int idade[]){
        int posicao = 0;
        for(int p = 1; p < risco.length; p++){
            if(risco[p] > risco[posicao]){
                posicao = p;
            }else if(risco[p] == risco[posicao]){
                if(dor[p] > dor[posicao]){
                    posicao = p;
                }else if(dor[p] == dor[posicao]){
                    if(idade[p] > idade[posicao]){
                        posicao = p;
                    }
                }
            }
        }
        return posicao;
    }
    public static void main(String[] args) {
        String[] pacientes = {"João", "Maria", "Pedro", "Carla"};
        int[] risco = {4, 5, 5, 5};
        int[] dor = {6, 3, 8, 8};
        int[] idade = {60, 40, 70, 65};
        int c = pacienteurgente(pacientes, risco, dor, idade);
        System.out.println("System.out.println(\"-----Paciente Urgente-----\nPaciente: "+pacientes[c]+"\nRisco: "+risco[c]+"\nDor: "+dor[c]+"\nIdade: "+idade[c]);
    }
}