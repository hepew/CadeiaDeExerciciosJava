package Cadeia01.Parte5.EmpresaMaisEficiente;
public class main {
    public static int empresamaiseficiente(String empresas[], double faturamento[], double lucro[], int funcionarios[], double crescimento[]){
        int posicao = 0;
        for(int i = 1; i < empresas.length; i++){
            double eficiencia = lucro[i] / funcionarios[i];
            double eficienciacamp = lucro[posicao] / funcionarios[posicao];
            if(faturamento[i] > faturamento[posicao]){
                    posicao = i;
            }else if(faturamento[i] == faturamento[posicao]){
                if(eficiencia > eficienciacamp){
                    posicao = i;
                }else if(eficiencia == eficienciacamp){
                    if(crescimento[i] > crescimento[posicao]){
                        posicao = i;
                    }else if(crescimento[i] == crescimento[posicao]){
                        if(funcionarios[i] < funcionarios[posicao]){
                            posicao = i;
                        }
                    }
                }
            }
        }
        return posicao;
    }
    public static void main(String[] args) {
        String[] empresas = {"A", "B", "C", "D"};
        double[] faturamento = {1_000_000, 1_000_000, 900_000, 1_000_000};
        double[] lucro = {200_000, 250_000, 300_000, 250_000};
        int[] funcionarios = {50, 60, 40, 60};
        double[] crescimento = {10, 8, 15, 8};
        int indice = empresamaiseficiente(empresas,faturamento,lucro,funcionarios,crescimento);
        System.out.println("Empresa: "+empresas[indice]+"\nFaturamento: "+faturamento[indice]+"\nLucro: "+lucro[indice]+"\nFuncionários: "+funcionarios[indice]+"\nCrescimento: "+crescimento[indice]);
    }
}
