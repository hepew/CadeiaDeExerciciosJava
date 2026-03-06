package Cadeia01.Parte4.FundodeInvestimentoSupremo;
public class main {
    public static int fundosupremo(String fundos[], double retornoAnual[], double volatilidade[], double patrimonio[], int anosAtivo[], double taxaAdministracao[]){
        int posicao = 0;
        for(int a = 1; a < volatilidade.length; a++){
            if(retornoAnual[a] > retornoAnual[posicao]){
                posicao = a;
            }else if(retornoAnual[a] == retornoAnual[posicao]){
                if(volatilidade[a] < volatilidade[posicao]){
                    posicao = a;
                }else if(volatilidade[a] == volatilidade[posicao]){
                    if(patrimonio[a] > patrimonio[posicao]){
                        posicao = a;
                    }else if(patrimonio[a] == patrimonio[posicao]){
                        if(anosAtivo[a] > anosAtivo[posicao]){
                            posicao = a;
                        }else if(anosAtivo[a] == anosAtivo[posicao]){
                            if(taxaAdministracao[a] < taxaAdministracao[posicao]){
                                posicao = a;
                            }
                        }
                    }
                }
            }
        }
        return posicao;
    }
    public static void main(String[] args) {
        String[] fundos = {"Alpha", "Beta", "Gamma", "Delta"};
        double[] retornoAnual = {15.0, 15.0, 15.0, 14.5};
        double[] volatilidade = {8.0, 6.0, 6.0, 5.0};
        double[] patrimonio = {1_000_000, 2_000_000, 2_000_000, 3_000_000};
        int[] anosAtivo = {5, 4, 6, 10};
        double[] taxaAdministracao = {1.5, 1.2, 1.2, 1.0};
        int posicao = fundosupremo(fundos, retornoAnual, volatilidade, patrimonio, anosAtivo, taxaAdministracao);
        System.out.println("Fundos: "+fundos[posicao]+"\nRetorno Anual: "+patrimonio[posicao]+"\nAnos Ativo: "+anosAtivo[posicao]+"\nTaxa de Administração: "+taxaAdministracao[posicao]);
    }
}
