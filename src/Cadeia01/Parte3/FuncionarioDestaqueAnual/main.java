package Cadeia01.Parte3.FuncionarioDestaqueAnual;
public class main {
    public static int maiorprodutividade(String funcionarios[], int produtividade[], int projetosEntregues[], int atrasos[]){
        int posicao = 0;
        for(int a = 1; a < produtividade.length; a++){
            if(produtividade[a] > produtividade[posicao]){
                posicao = a;
            }else if(produtividade[a] == produtividade[posicao]){
                if(projetosEntregues[a] > projetosEntregues[posicao]){
                    posicao = a;
                }else if(projetosEntregues[a] == projetosEntregues[posicao]){
                    if(atrasos[a] < atrasos[posicao]){
                        posicao = a;
                    }
                }
            }
        }
        return posicao;
    }
    public static void main(String[] args) {
        String[] funcionarios = {"Ana", "Carlos", "Marcos", "Julia"};
        int[] produtividade = {90, 95, 95, 95};
        int[] projetosEntregues = {5, 6, 6, 4};
        int[] atrasos = {1, 0, 2, 0};
        int b = maiorprodutividade(funcionarios, produtividade, projetosEntregues, atrasos);
        System.out.println("Funcionario :"+funcionarios[b]+"\nProdutividade: "+produtividade[b]+"\nProjetos Entregues: "+projetosEntregues[b]+"\nAtrasos: "+atrasos[b]);
    }
}
