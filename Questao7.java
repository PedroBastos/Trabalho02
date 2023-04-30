import java.util.Scanner;
public class questao06 {
    public static void Main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ttdeCarrrosate2010 = 0;
        int ttgeral = 0;

        while (true) {
            System.out.println("Entre com o ano do veículo: yyyy");
            int ano = input.nextInt();
            System.out.println("Informe valor do veículo: ");
            float valor = input.nextFloat();

            double desconto;
            if (ano <= 2010) {
                desconto = valor * 0.12;
                ttdeCarrrosate2010++;
                }
            else{
                desconto = valor * 0.07;
            }

        }
    }
}
