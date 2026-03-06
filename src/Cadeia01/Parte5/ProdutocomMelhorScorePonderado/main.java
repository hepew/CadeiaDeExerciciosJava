package Cadeia01.Parte5.ProdutocomMelhorScorePonderado;
public class main {
    public static int melhorscore(String produtos[], double qualidade[], double durabilidade[], double custo[], double avaliacaoCliente[]){
        int indice = 0;
        for(int i = 1; i < produtos.length; i++){
            double score = (qualidade[i] * 3) + (durabilidade[i] * 2) + (avaliacaoCliente[i] * 5) - (custo[i] / 50);
            double scorecamp = (qualidade[indice] * 3) + (durabilidade[indice] * 2) + (avaliacaoCliente[indice] * 5) - (custo[indice] / 50);
            if(score > scorecamp){
                indice = i;
            }else if(score == scorecamp){
                if(avaliacaoCliente[i] > avaliacaoCliente[indice]){
                    indice =i;
                }else if(avaliacaoCliente[i] == avaliacaoCliente[indice]){
                    if(custo[i] < custo[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] produtos = {"A", "B", "C", "D"};
        double[] qualidade = {8, 9, 9, 8};
        double[] durabilidade = {7, 8, 8, 9};
        double[] custo = {100, 120, 110, 130};
        double[] avaliacaoCliente = {4.5, 4.8, 4.8, 4.7};
        int indice = melhorscore(produtos,qualidade,durabilidade,custo,avaliacaoCliente);
        System.out.println("Produto: "+produtos[indice]+"\nQualidade: "+qualidade[indice]+"\nDurabilidade: "+durabilidade[indice]+"\nCusto: "+custo[indice]+"\nAvaliação dos clientes: "+avaliacaoCliente[indice]);
    }
}
