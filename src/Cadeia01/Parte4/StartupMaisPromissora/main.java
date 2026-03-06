package Cadeia01.Parte4.StartupMaisPromissora;
public class main {
    public static int startuppromissora(String startups[], double crescimentoUsuarios[], double receita[], double investimentoRecebido[], int funcionarios[], double churnRate[]){
        int posicao = 0;
        for(int i = 1; i < crescimentoUsuarios.length; i++) {
            if(crescimentoUsuarios[i] > crescimentoUsuarios[posicao]){
                posicao = i;
            }else if(crescimentoUsuarios[i] == crescimentoUsuarios[posicao]){
                if(receita[i] > receita[posicao]){
                    posicao = i;
                }else if(receita[i] == receita[posicao]){
                    if(investimentoRecebido[i] < investimentoRecebido[posicao]){
                        posicao = i;
                    }else if(investimentoRecebido[i] == investimentoRecebido[posicao]){
                        if(churnRate[i] < churnRate[posicao]){
                            posicao = i;
                        }else if(churnRate[i] == churnRate[posicao]){
                            if(funcionarios[i] < funcionarios[posicao]){
                                posicao = i;
                            }
                        }
                    }
                }
            }
        }
        return posicao;
    }

    public static void main(String[] args) {
        String[] startups = {"X", "Y", "Z", "W"};
        double[] crescimentoUsuarios = {200, 200, 200, 180};
        double[] receita = {1_000_000, 1_000_000, 900_000, 1_200_000};
        double[] investimentoRecebido = {500_000, 400_000, 400_000, 600_000};
        int[] funcionarios = {20, 15, 15, 30};
        double[] churnRate = {5.0, 4.0, 4.0, 6.0};
        int posicao = startuppromissora(startups, crescimentoUsuarios, receita, investimentoRecebido, funcionarios, churnRate);
        System.out.println("Startup: "+startups[posicao]+"\nCrescimento de Usuário: "+crescimentoUsuarios[posicao]+"\nReceita: "+receita[posicao]+"\nInvestimento Recebido: "+investimentoRecebido[posicao]+"\nFuncionários: "+funcionarios[posicao]+"\nChurn Rate: "+churnRate[posicao]);
    }
}
