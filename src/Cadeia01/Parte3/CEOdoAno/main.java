package Cadeia01.Parte3.CEOdoAno;
public class main {
    public static int ceodoano(String ceos[], double crescimentoEmpresa[], double lucroLiquido[], int anosNoCargo[], double satisfacaoFuncionarios[]){
        int indice = 0;
        for(int i = 1; i < ceos.length; i++){
            if(crescimentoEmpresa[i] > crescimentoEmpresa[indice]){
                indice = i;
            }else if(crescimentoEmpresa[i] == crescimentoEmpresa[indice]){
                if(lucroLiquido[i] > lucroLiquido[indice]){
                    indice = i;
                }else if(lucroLiquido[i] == lucroLiquido[indice]){
                    if(satisfacaoFuncionarios[i] > satisfacaoFuncionarios[indice]){
                        indice = i;
                    }else if(satisfacaoFuncionarios[i] == satisfacaoFuncionarios[indice]){
                        if(anosNoCargo[i] > anosNoCargo[indice]){
                            indice = i;
                        }
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] ceos = {"A", "B", "C", "D"};
        double[] crescimentoEmpresa = {10.5, 12.0, 12.0, 12.0};
        double[] lucroLiquido = {5_000_000, 4_000_000, 5_000_000, 5_000_000};
        int[] anosNoCargo = {3, 5, 4, 4};
        double[] satisfacaoFuncionarios = {8.0, 9.0, 8.0, 8.5};
        int indice = ceodoano(ceos, crescimentoEmpresa, lucroLiquido, anosNoCargo, satisfacaoFuncionarios);
        System.out.println("Ceo: "+ceos[indice]+"\nCrescimento da Empresa: "+crescimentoEmpresa[indice]+"\nLucro Líquido: "+lucroLiquido[indice]+"\nAnos no Cargo: "+anosNoCargo[indice]+"\nSatisfação dos funcionários: "+satisfacaoFuncionarios[indice]);
    }


}
