import java.util.Scanner;
public class questao01 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Qual nome do vendedor:");
    String vendedor = input.next();

    System.out.println("Qual o salário fixo?");
    float salariofixo = input.nextFloat();

    System.out.println("Qual total de vendas efetuadas no mês em dinheiro?");
    double vendas = input.nextDouble();

    double comissao = vendas * 0.15;
    double salariofinal = salariofixo + comissao;

    System.out.println("O nome do vendedor é: " + vendedor);
    System.out.println("O salario fixo: " + salariofixo);
    System.out.println("O total de vendas efetuadas no mês foi de: " + vendas);
    System.out.println("O salario final com a comissão fica em torno de: " + salariofinal);
    }
}
