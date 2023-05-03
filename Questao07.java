import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ttdeVeiculos_Ate2010 = 0;
        int ttVeiculos = 0;

        while (true) {
            System.out.println("Entre com o ano do veículo: yyyy");
            int ano = input.nextInt();
            System.out.println("Informe valor do veículo: ");
            float valor = input.nextFloat();

            double desconto;
            if (ano <= 2010) {
                desconto = valor * 0.12;
                ttdeVeiculos_Ate2010++;
            } else {
                desconto = valor * 0.07;
            }

            ttveiculos++;
            System.out.println("Desconto: R$" + desconto);

            System.out.println("Digite 1 para continuar ou qualquer outro número para sair.");
            int continuar = input.nextInt();
            if (continuar != 1) {
                break;
            }
        }

        System.out.println("Total de carros até 2010: " + ttdeVeiculos_Ate2010);
        System.out.println("Total de carros avaliados: " + ttVeiculos);
    }
}
