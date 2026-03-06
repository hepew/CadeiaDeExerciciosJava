package Cadeia01.Parte3.MelhorLojadoMes;
public class main {
    public static int maiorfaturamento(String lojas[], double faturamento[], int reclamacoes[]){
        int indice = 0;
        for(int i = 1; i < faturamento.length; i++){
            if(faturamento[i] > faturamento[indice]){
                indice = i;
            }else if(faturamento[i] == faturamento[indice]){
                if(reclamacoes[i] < reclamacoes[indice]){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] lojas = {"Centro", "Shopping", "Bairro", "Outlet"};
        double[] faturamento = {50000, 80000, 80000, 60000};
        int[] reclamacoes = {5, 8, 3, 2};
        int melhorloja = maiorfaturamento(lojas, faturamento, reclamacoes);
        System.out.println("-----Melhor Loja-----\nLoja: "+lojas[melhorloja]+"\nFaturamento: "+faturamento[melhorloja]+"\nReclamações: "+reclamacoes[melhorloja]);
    }
}
