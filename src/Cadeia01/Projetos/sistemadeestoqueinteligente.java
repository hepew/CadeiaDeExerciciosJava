package Cadeia01.Projetos;
import java.util.Scanner;
public class sistemadeestoqueinteligente {
    public static void cadastro(Scanner scanner, //(CADASTRO) //Concluído
                                String[] comidas,
                                double[] peso,
                                int[] validade,
                                double[] valor,
                                String[] lote){
        for(int i = 0; i < comidas.length; i++){
            System.out.println("Produto ("+(i+1)+")");

            System.out.print("-Nome: ");
            comidas[i] = scanner.nextLine();

            System.out.print("-Peso(KG): ");
            peso[i] = scanner.nextDouble();

            System.out.print("-Validade (dias): ");
            validade[i] = scanner.nextInt();

            System.out.print("-Valor (00.00): ");
            valor[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("-Lote: ");
            lote[i] = scanner.nextLine();
            System.out.println("");
        }
    }
    public static void produtoscadastrados(String[] comidas, //(PRODUTOS CADASTRADOS(1)) //Concluído
                                           double[] peso,
                                           int[] validade,
                                           double[] valor,
                                           String[] lote){
        System.out.println("\n----PRODUTOS CADASTRADOS(1)----");
        for(int c = 0; c < comidas.length; c++){
            System.out.println("ROBOT: [Produto: "+(c+1)+"]\n-Nome: "+comidas[c]+"\n-Peso (KG): "+peso[c]+"\n-Validade (dias): "+validade[c]+"\n-Valor (00.00): "+valor[c]+"\n-Lote: "+lote[c]+"\n");
        }
    }
    public static void produtopeso(String[] comidas, //(MENU PESOS(2))
                                        double[] peso,
                                        double[] valor,
                                         Scanner scanner){
        int rep = -1;
        System.out.println("\n----MENU PESOS(2)----");
        do {
            System.out.println("(1) Produto mais pesado");
            System.out.println("(2) Produto menos pesado");
            System.out.println("(0) Voltar...");
            System.out.print("R: ");
            rep = scanner.nextInt();
            switch (rep){
                case 1:{
                    int indice = produtomaispesado(comidas, peso, valor);
                    System.out.println("\nROBOT: [PRODUTO MAIS PESADO (KG)]\n-Produto: "+comidas[indice]+"\n-Peso: ("+peso[indice]+")\nValor: "+valor[indice]+"\n");
                    break;
                }
                case 2:{
                    int indice = produtomenospesado(comidas, valor, peso);
                    System.out.println("\nROBOT: [PRODUTO MENOS PESADO (KG)]\n-Produto: "+comidas[indice]+"\n-Peso: ("+peso[indice]+")\nValor: "+valor[indice]+"\n");
                    break;
                }
                case 0:{
                    System.out.println("\nROBOT: [VOLTANDO...]\n");
                    break;
                }
                default:{
                    System.out.println("\nROBOT: [ERRO]\n");
                }
            }
        }while (rep != 0);
    }
    public static void produtovalores(String[] comidas, //(MENU VALORES (3))
                                      double[] valor,
                                      int[] validade,
                                      Scanner scanner){
        int rep = -1;
        System.out.println("\n----VALORES DE CADA PRODUTO(3)----");
        do {
            System.out.println("(1) Produto mais caro");
            System.out.println("(2) Produto mais barato");
            System.out.println("(0) Voltar...");
            System.out.print("R: ");
            rep = scanner.nextInt();
            switch (rep){
                case 1: {
                    int indice = produtomaiscaro(comidas, valor, validade);
                    System.out.println("\nROBOT: [PRODUTO MAIS CARO]\n-Produto: "+comidas[indice]+"\n-Valor: "+valor[indice]+"\n");
                    break;
                }
                case 2:{
                    int indice = produtomaisbarato(comidas, valor, validade);
                    System.out.println("\nROBOT: [PRODUTO MAIS BARATO]\n-Produto: "+comidas[indice]+"\n-Valor: "+valor[indice]+"\n");
                    break;
                }
                case 0:{
                    System.out.println("\nROBOT: [VOLTANDO...]\n");
                    break;
                }
                default:{
                    System.out.println("\nROBOT: [ERRO]\n");
                }
            }
        }while(rep != 0);
    }
    public static int produtomaiscaro(String[] comidas, //(MAIS CARO (3.1))
                                      double[] valor,
                                      int[] validade){
        int indice = 0;
        for(int i = 0; i < comidas.length; i++){
            if(valor[i] > valor[indice]){
                indice = i;
            }else if(valor[i] == valor[indice]){
                if(validade[i] > validade[indice]){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static int produtomaisbarato(String[] comidas, //(MENOS CARO (3.2))
                                        double[] valor,
                                        int[] validade) {
        int indice = 0;
        for (int i = 0; i < comidas.length; i++) {
            if (valor[i] < valor[indice]) {
                indice = i;
            } else if (valor[i] == valor[indice]) {
                if (validade[i] > validade[indice]) {
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static int produtomaispesado(String[] comidas, //(MAIS PESADO 2.1)
                                         double[] valor,
                                         double[] peso){
        int indice = 0;
        for(int i = 0; i < comidas.length; i++){
            if(peso[i] > peso[indice]){
                indice = i;
            }else if(peso[i] == peso[indice]){
                if(valor[i] > valor[indice]){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static int produtomenospesado(String[] comidas, //(MENOS PESADO 2.2)
                                          double[] valor,
                                          double[] peso){
        int indice = 0;
        for(int i = 0; i < comidas.length; i++){
            if(peso[i] < peso[indice]){
                indice = i;
            }else if(peso[i] == peso[indice]){
                if(valor[i] < valor[indice]){
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static void validade(String[] comidas, //(MENU VALIDADE(4))
                                int[] validade,
                                Scanner scanner){
        int rep = -1;
            System.out.println("\n----MENU VALIDADE(4)----");
        do {
            System.out.println("(1) Validade Perto de vencer");
            System.out.println("(2) Validade Longe de vencer");
            System.out.println("(0) Voltar...");
            System.out.print("R: ");
            rep = scanner.nextInt();
            switch (rep){
                case 1:{
                    int indice = validadepertodevencer(comidas, validade);
                    System.out.println("\nROBOT: [PRODUTO MAIS PERTO DA VALIDADE]\n-Produto: "+comidas[indice]+"\n-Validade: "+validade[indice]+"\n");
                    break;
                }
                case 2:{
                    int indice = validadelongedevencer(comidas, validade);
                    System.out.println("\nROBOT: [PRODUTO MAIS LONGE DA VALIDADE]\n-Produto: "+comidas[indice]+"\n-Validade: "+validade[indice]+"\n");
                    break;
                }
                case 0:{
                    System.out.println("\nROBOT: [VOLTANDO...]\n");
                    break;
                }
                default:{
                    System.out.println("\nROBOT: [ERRO]\n");
                }
            }
        }while (rep != 0);
    }
    public static int validadepertodevencer(String comidas[], //(MAIS PERTO 4.1)
                                            int validade[]){
       int indice = 0;
       for(int i = 1; i < comidas.length; i++){
           if(validade[i] < validade[indice]){
               indice = i;
           }
       }
       return indice;
    }
    public static int validadelongedevencer(String comidas[], //(MAIS LONGE 4.2)
                                            int validades[]){
        int indice = 0;
        for(int i = 1; i < comidas.length; i++){
            if(validades[i] > validades[indice]){
                indice = i;
            }
        }
        return indice;
    }
    public static void lotes(String comidas[], //(LOTES (5))
                            String lote[],
                            Scanner scanner){
        System.out.println("----LOTES----");
        for(int i = 0; i < comidas.length; i++){
            System.out.println("ROBOT: [Produto: "+(1+i)+"]\n-Produto: "+comidas[i]+"\nLote: "+lote[i]+"\n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        System.out.println("----ESTOQUE----");
        System.out.print("ROBOT: [QUANTOS PRODUTOS?] R: ");
        size = scanner.nextInt();
        scanner.nextLine();

        String[] comidas = new String[size];
        double[] peso = new double[size];
        int[] validade = new int[size];
        double[] valor = new double[size];
        String[] lote = new String[size];

        cadastro(scanner, comidas, peso, validade, valor, lote);
        int escolha = -1;
        System.out.println("ROBOT: [OS DADOS FORAM CADASTRADOS]\n");
        do{
            System.out.println("----MENU----");
            System.out.println("(1) Produtos Cadastrados");
            System.out.println("(2) Produto mais pesado");
            System.out.println("(3) Valores de cada produto");
            System.out.println("(4) Validade");
            System.out.println("(5) Lote");
            System.out.println("(0) Sair");
            System.out.print("R: ");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:{
                    produtoscadastrados(comidas, peso, validade, valor, lote);
                    break;
                }
                case 2:{
                    produtopeso(comidas, peso, valor, scanner);
                    break;
                }
                case 3:{
                    produtovalores(comidas, valor, validade, scanner);
                    break;
                }
                case 4:{
                    validade(comidas, validade, scanner);
                    break;
                }
                case 5:{
                    lotes(comidas, lote, scanner);
                    break;
                }
                case 0:{
                    System.out.println("\nROBOT: [SAINDO...]");
                    return;
                }
                default:{
                    System.out.println("\nROBOT: [ERRO]\n");
                }
            }
        }while (escolha != 0);
        scanner.close();
    }
}