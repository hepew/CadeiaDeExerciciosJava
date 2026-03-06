package Cadeia01.Parte1.FuncionarioDestaque;
public class main {
    public static int maiorprodutividade(String funcionario[],int produtividade[], int faltas[]){
        int maior = 0;
        for(int a = 1; a < produtividade.length; a++){
            if(produtividade[a] > produtividade[maior]){
                maior = a;
            }else if(produtividade[a] == produtividade[maior]){
                if(faltas[a] > faltas[maior]){
                    maior = a;
                }
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        String[] funcionario = {"Lucas", "Fernanda", "Rafael", "Bruna"};
        int[] produtividade = {80, 90, 90, 85};
        int[] faltas = {2,1,3,0};
        int indice = maiorprodutividade(funcionario, produtividade, faltas);
        System.out.println("Maior produtividade: "+funcionario[indice]);
    }
}
