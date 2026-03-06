package Cadeia01.Parte1.AtendimentoPrioritario;
public class Main {
    public static int maiorurgencia(String clientes[], int idade[], int urgencia[]){
        int maior = 0;
        for(int c = 1; c < urgencia.length; c++){
            if(urgencia[c] > urgencia[maior]){
                maior = c;
            }else if(urgencia[c] == urgencia[maior]){
                if(idade[c] > idade[maior]){
                    maior = c;
                }
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        String[] clientes = {"João", "Maria", "Pedro", "Carlos"};
        int[] idade = {20, 70, 30, 65};
        int[] urgencia = {3, 4, 5, 4};
        int indice = maiorurgencia(clientes, idade, urgencia);
        System.out.println("Maior urgência: "+clientes[indice]);
    }
}