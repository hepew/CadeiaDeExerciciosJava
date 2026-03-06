package Cadeia01.Parte1.FuncionarioMaisCaro;
public class main {
    public static int maiorsalario(String funcionarios[], double salario[], int faltas[]){
        int maiorsalario = 0;
        for(int m = 1; m < salario.length; m++){
            if(salario[m] > salario[maiorsalario]){
                maiorsalario = m;
            }else if(salario[m] == salario[maiorsalario]){
                if(faltas[m] < faltas[maiorsalario]){
                    maiorsalario = m;
                }
            }
        }
        return maiorsalario;
    }
    public static void main(String[] args) {
        String[] funcionarios = {"Ana", "Carlos", "Marcos", "Julia"};
        double[] salario = {3000, 4500, 4500, 2800};
        int[] faltas = {2, 5 ,1 ,0};
        int indice = maiorsalario(funcionarios, salario, faltas);
        System.out.println("-----Funcionário Mais Caro-----\nFuncionário: "+funcionarios[indice]+"\nSalário: "+salario[indice]+"\nFaltas: "+faltas[indice]);

    }
}
