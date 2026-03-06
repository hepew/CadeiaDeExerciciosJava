package Cadeia01.Parte1.ProdutoqueDaMaisLucro;
public class main {
    public static int produtomaiorlucro(String produtos[], double custo[], double precovenda[]){
        int maiorlucro = 0;
        for(int i = 1; i < custo.length; i++){
            double lucro = precovenda[i] - custo[i];
            if(lucro > maiorlucro){
                maiorlucro = i;
            }
        }
        return maiorlucro;
    }
    public static void main(String[] args) {
        String[] produtos = {"Caneta", "Caderno", "Mouse", "Teclado"};
        double[] custo = {1.00, 10.00, 50.00, 90.00};
        double[] precovenda = {2.50, 18.00, 80.00, 120.00};
        int indice = produtomaiorlucro(produtos, custo, precovenda);
        System.out.println("Maior lucro: "+produtos[indice]);
    }
}