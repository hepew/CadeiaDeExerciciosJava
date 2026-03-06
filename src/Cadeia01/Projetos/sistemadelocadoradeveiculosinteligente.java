package Cadeia01.Projetos;

class main {
    public static int proximoPaciente(String pacientes[],
                                      int idade[],
                                      int gravidade[],
                                      int tempoEsperaMin[],
                                      boolean doencaCronica[],
                                      boolean[] riscoVida) {
        int indice = 0;
        for (int i = 1; i < gravidade.length; i++) {
            if (riscoVida[i] == true) {
                return i; //prioridade absoluta
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String[] pacientes = {"Carlos", "Ana", "Marcos", "Beatriz", "João"};
        int[] idade = {45, 70, 30, 65, 50};
        int[] gravidade = {7, 6, 9, 5, 8};
        int[] tempoEsperaMin = {40, 20, 15, 60, 25};
        boolean[] doencaCronica = {false, true, false, true, false};
        boolean[] riscoVida = {false, false, true, false, false};
        int indice = proximoPaciente(pacientes, idade, gravidade, tempoEsperaMin, doencaCronica, riscoVida);
    }
}



