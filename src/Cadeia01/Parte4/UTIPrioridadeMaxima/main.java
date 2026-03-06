package Cadeia01.Parte4.UTIPrioridadeMaxima;
public class main {
    public static int utiprioridade(String pacientes[], int riscoVida[], int dor[], int pressao[], int idade[], int tempoEspera[]){
        int posicao = 0;
        for(int u = 1; u < riscoVida.length; u++){
            if(riscoVida[u] > riscoVida[posicao]){
                posicao = u;
            }else if(riscoVida[u] == riscoVida[posicao]){
                if(dor[u] > dor[posicao]){
                    posicao = u;
                }else if(dor[u] == dor[posicao]){
                    if(pressao[u] > pressao[posicao]){
                        posicao = u;
                    }else if(pressao[u] == pressao[posicao]){
                        if(tempoEspera[u] > tempoEspera[posicao]){
                            posicao = u;
                        }else if(tempoEspera[u] == tempoEspera[posicao]){
                            if(idade[u] > idade[posicao]){
                                posicao = u;
                            }
                        }
                    }
                }
            }
        }
        return posicao;
    }
    public static void main(String[] args) {
        String[] pacientes = {"A", "B", "C", "D"};
        int[] riscoVida = {5, 5, 5, 5};
        int[] dor = {9, 9, 8, 9};
        int[] pressao = {18, 20, 22, 20};
        int[] idade = {60, 70, 80, 75};
        int[] tempoEspera = {30, 25, 40, 25};
        int posicao = utiprioridade(pacientes, riscoVida, dor, pressao, idade, tempoEspera);
        System.out.println("Paciente: "+pacientes[posicao]+"\nRisco de Vida: "+riscoVida[posicao]+"\nDor: "+dor[posicao]+"\nPressão: "+pressao[posicao]+"\nIdade: "+idade[posicao]+"\nTempo de Espera: "+tempoEspera[posicao]);
    }
}