package Cadeia01.Parte2.FuncionarioEstrategicoPremium;
public class main {
    public static int maiorprodutividade(String funcionarios[], int produtividade[], int advertencia[], double salario[], boolean lider[]){
        int indice = 0;

        for(int i = 1; i < produtividade.length; i++){
            if(produtividade[i] > produtividade[indice]){
                indice = i;
            }else if(produtividade[i] == produtividade[indice]) {
                if(lider[i] && !lider[indice]){
                    indice = i;
                }else if(lider[i] == lider[indice]){
                    if(advertencia[i] < advertencia[indice]) {
                        indice = i;
                    }else if(advertencia[i] == advertencia[indice]){
                        if(salario[i] < salario[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] funcionarios = {"Ana", "Carlos", "Marcos", "Julia", "Fernanda"};
        int[] produtividade = {80, 95, 95, 90, 95};
        int[] advertencia = {1, 0, 2, 0, 0};
        double[] salario = {3000, 5000, 4500, 4000, 5000};
        boolean[] lider = {false, true, false, true, false};
        int indice = maiorprodutividade(funcionarios, produtividade, advertencia, salario, lider);
        System.out.println("-----Funcionário Estratégico Premium-----\nFuncionário: "+funcionarios[indice]+"\nProdutividade: "+produtividade[indice]+"\nAdvertências: "+advertencia[indice]+"\nSalário: "+salario[indice]+"\nLider: "+lider[indice]);
    }
}