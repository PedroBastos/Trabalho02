import java.util.Scanner;

public class questao01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a distancia percorrida em (km) ?");
        double distancia = ler.nextDouble();

        System.out.println("Qual o consumo médio do veículo?");
        double consumo = ler.nextDouble();

        double consumomedio = distancia / consumo;

        System.out.println("O consumo médio é: " + consumomedio);
    }
}

