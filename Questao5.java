import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if(num > 10) {
            System.out.println("O numero: " + num +" é maior que 10!");

        }
    }
}
