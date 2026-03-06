package Cadeia01.Parte4.SelecaoFinaldeCandidato;
public class main {
    public static int finaldecandidado(String candidatos[], double notaTecnica[], double notaComportamental[], int anosExperiencia[], double pretensaoSalarial[]){
        int indice = 0;
        for(int i = 1; i < candidatos.length; i++){
            double mediafinal = (notaTecnica[i] + notaComportamental[i]) / 2;
            double mediafinalcampeao = (notaTecnica[indice] + notaComportamental[indice]) / 2;
            if(mediafinal > mediafinalcampeao){
                indice = i;
            }else if(mediafinal == mediafinalcampeao){
                if(anosExperiencia[i] > anosExperiencia[indice]){
                    indice = i;
                }else if(anosExperiencia[i] == anosExperiencia[indice]){
                    if(pretensaoSalarial[i] < pretensaoSalarial[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] candidatos = {"Ana", "Bruno", "Carlos", "Daniela"};
        double[] notaTecnica = {9.0, 9.0, 9.0, 8.5};
        double[] notaComportamental = {8.0, 9.0, 9.0, 10.0};
        int[] anosExperiencia = {2, 3, 3, 5};
        double[] pretensaoSalarial = {4000, 5000, 4500, 3000};
        int indice = finaldecandidado(candidatos, notaTecnica, notaComportamental, anosExperiencia, pretensaoSalarial);
        System.out.println("Candidato: "+candidatos[indice]+"\nNota técnica: "+notaTecnica[indice]+"\nNota comportamental: "+notaComportamental[indice]+"\nAnos Experiência: "+anosExperiencia[indice]+"\nPretensão Salarial: "+pretensaoSalarial[indice]);
    }
}
