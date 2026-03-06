package Cadeia01.Parte3.AgenciaBancariadoAno;
public class main {
    public static int agenciabancaria(String agencias[], double lucro[], int clientesAtivos[], int reclamacoes[], double custoOperacional[]){
        int indice = 0;
        for(int i = 1; i < lucro.length; i++){
            if(lucro[i] > lucro[indice]){
                indice = i;
            }else if(lucro[i] == lucro[indice]){
                if(reclamacoes[i] < reclamacoes[indice]){
                    indice = i;
                }else if(reclamacoes[i] == reclamacoes[indice]){
                    if(custoOperacional[i] < custoOperacional[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] agencias = {"Centro", "Zona Sul", "Zona Norte", "Interior"};
        double[] lucro = {200000, 300000, 300000, 300000};
        int[] clientesAtivos = {500, 450, 500, 500};
        int[] reclamacoes = {10, 5, 3, 3};
        double[] custoOperacional = {100000, 150000, 140000, 130000};
        int i = agenciabancaria(agencias, lucro, clientesAtivos, reclamacoes, custoOperacional);
        System.out.println("-----Agência Bancária-----\nAgencia: "+agencias[i]+"\nLucro: "+lucro[i]+"\nClientes ativos: "+clientesAtivos[i]+"\nReclamações: "+reclamacoes[i]+"\nCusto operacional: "+custoOperacional[i]);
    }
}
