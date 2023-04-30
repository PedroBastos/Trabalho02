import java.util.Scanner;

public class questao04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de depósito: ");
        float deposito = input.nextFloat();

        System.out.println("Informe qual tipo de rendimento:");
        System.out.println("1. Poupança em 0.90% ao mês");
        System.out.println("2. CDB em 1,1% ao 9mês");
        System.out.println("3. Previdência privada 1,3% ao mês");
        int opcao = input.nextInt();

        double rendimento = 0;
        double total = deposito;

        switch (opcao){
            case 1:
                rendimento = deposito * 0.009;
                for(int m = 1; m <=12; m++){
                    total += rendimento;
                }
                break;
            case 2:
                rendimento = deposito * 0.011;
                for(int m = 1; m <=12; m++) {
                    total += rendimento;
                }
                break;
            case 3:
                rendimento = deposito * 0.013;
                for(int m = 1; m <=12; m++) {
                    total += rendimento;
                }
                break;
            default:
                System.out.println("Error: Digite o numero de 1 a 3 e tente novamente!");
                System.out.println(" ");
                break;

        }
        System.out.println("O rendimento do próximo mês é de: " + rendimento);
        System.out.println("O rendimento após 12 meses é de: " + total);
    }
}
