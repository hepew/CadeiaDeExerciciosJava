package Cadeia01.Parte4.UnidadeEmpresarialMaisEstrategica;
public class main {
    public static int unidadeempresarialmaisestrategica(String unidades[], double faturamento[], double lucro[], int funcionarios[], int processosJudiciais[]){
        int indice = 0;
        for(int i = 1; i < faturamento.length; i++){
            if(faturamento[i] > faturamento[indice]){
                indice = i;
            }else if(faturamento[i] == faturamento[indice]){
                if(processosJudiciais[i] < processosJudiciais[indice]){
                    indice = i;
                }else if(processosJudiciais[i] == processosJudiciais[indice]){
                    if(funcionarios[i] < funcionarios[indice]){
                        indice = i;
                    }
                }
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        String[] unidades = {"Sul", "Norte", "Leste", "Oeste"};
        double[] faturamento = {500000, 500000, 500000, 450000};
        double[] lucro = {80000, 90000, 90000, 100000};
        int[] funcionarios = {50, 40, 45, 30};
        int[] processosJudiciais = {2, 3, 1, 0};
        int indice = unidadeempresarialmaisestrategica(unidades, faturamento, lucro, funcionarios, processosJudiciais);
        System.out.println("Unidades: "+unidades[indice]+"\nFaturamento: "+faturamento[indice]+"\nLucro: "+lucro[indice]+"\nFuncionarios: "+funcionarios[indice]+"\nProcessos Judiciais: "+processosJudiciais[indice]);
    }
}
