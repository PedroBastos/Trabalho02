import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = input.nextInt();

        System.out.println("Digite um numero elevado");
        int numeroelevado = input.nextInt();
        valorElevado(numeri, numeroelevado);
    }

    public static void valorElevado(int numero, int numeroelevado){

        double resultado = Math.pow(numero, numeroelevado);
       System.out.println("O resultado é " + resultado);
    }
}
