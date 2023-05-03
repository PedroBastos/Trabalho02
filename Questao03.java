import java.util.Scanner;
public class questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite valor de A:");
        int a = input.nextInt();

        System.out.println("Digite valor de B:");
        int b = input.nextInt();

        int temporario = a;
        a = b;
        b = temporario;

        System.out.println("Valores Iniciais:");
        System.out.println("Valor de A = " + temporario);
        System.out.println("Valor de B = " + a);

        System.out.println("Valor trocado:");
        System.out.println("Valor de A = " + a);
        System.out.println("Valor de B = " + temporario);
    }
}
