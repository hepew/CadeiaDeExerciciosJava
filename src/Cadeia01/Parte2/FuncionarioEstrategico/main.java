package Cadeia01.Parte2.FuncionarioEstrategico;
public class main {
    public static int melhorfuncionario(String funcionarios[], int produtividade[], int faltas[], double salario[]){
        int indice = 0;
        for(int i = 1; i < produtividade.length; i++){
            if(produtividade[i] > produtividade[indice]){
                indice = i;
            }else if(produtividade[i] == produtividade[indice]){
                if(faltas[i] < faltas[indice]){
                    indice = i;
                }else if(faltas[i] == faltas[indice]){
                    if(salario[i] < salario[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] funcionarios = {"Ana", "Carlos", "Marcos", "Julia", "Fernanda"};
                   int[] produtividade = {80, 90, 90, 85, 90};
                             int[] faltas = {2, 1, 3, 0, 1};
                    double[] salario = {3000, 4500, 4500, 2800, 3500};
        int indice = melhorfuncionario(funcionarios, produtividade, faltas, salario);
        System.out.println("-----Melhor Funcionário-----\nFuncionário: "+funcionarios[indice]+"\nProdutividade: "+produtividade[indice]+"\nFaltas: "+faltas[indice]+"\nSalário: "+salario[indice]);
    }
}