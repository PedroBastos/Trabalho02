import java.util.Scanner;

public class questao10 {

    public static boolean verificarNumero(int numero) {
        int somaDivisores = 0;

        for (int verificarnumero = 1; verificarnumero < numero; verificarnumero++) {
            if (numero % verificarnumero == 0) {
                somaDivisores += verificarnumero;
            }
        }

        if (somaDivisores == numero) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (verificarNumero(numero)) {
            System.out.println("(" + numero + ")" + " é um número perfeito, de acordo com a INEP");
        } else {
            System.out.println(numero + " não é um número perfeito, de acordo com a INEP ");
        }

    }
}
