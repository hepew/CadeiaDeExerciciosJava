package Cadeia01.Parte4.SelecaoMilitarElite;
public class main {
    public static int selecaomilitar(String candidatos[], int resistencia[], int tiro[], int estrategia[], int disciplina[], int faltas[]){
        int indice = 0;
        for(int i = 1; i < candidatos.length; i++){
            if(resistencia[i] > resistencia[indice]){
                indice = i;
            }else if(resistencia[i] == resistencia[indice]){
                if(tiro[i] > tiro[indice]){
                    indice = i;
                }else if(tiro[i] == tiro[indice]){
                    if(estrategia[i] > estrategia[indice]){
                        indice = i;
                    }else if(estrategia[i] == estrategia[indice]){
                        if(disciplina[i] > disciplina[indice]){
                            indice = i;
                        }else if(disciplina[i] == disciplina[indice]){
                            if(faltas[i] < faltas[indice]){
                                indice = i;
                            }
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] candidatos = {"A", "B", "C", "D"};
        int[] resistencia = {90, 95, 95, 95};
        int[] tiro = {85, 88, 88, 88};
        int[] estrategia = {80, 85, 85, 90};
        int[] disciplina = {100, 95, 100, 100};
        int[] faltas = {0, 1, 0, 0};
        int posicao = selecaomilitar(candidatos, resistencia, tiro, estrategia, disciplina, faltas);
        System.out.println("Candidato: "+candidatos[posicao]+"\nResistência: "+resistencia[posicao]+"\nDisciplina: "+disciplina[posicao]+"\nFaltas: "+faltas[posicao]);
    }
}
