import java.util.Scanner;
public class questao06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int qnthomem = 0; int qntmulher = 0;

        for(int pessoa = 1; pessoa <=30;  pessoa++){
            System.out.println("Digite o nome da " + pessoa + " pessoa: ");
            String nome = input.nextLine();


            System.out.println("Digite o sexo da " + pessoa + " pessoa! (M) para Homem | (F) para Mulher: ");
            char sexo = input.nextLine().toUpperCase().charAt(0);
            //CHAR PORQUE É STRING(letras), MAS STRING DENTRO DE ALGUM MÉTODO É SE USADO "CHAR"

            if(sexo == 'M') {
                System.out.println(pessoa + " é homem");
                qnthomem++;
            }

            else if (sexo == 'F') {
                System.out.println(pessoa + " é mulher");
                qntmulher++;
            }

                else {
                System.out.println("Error: Digite novamente o seu sexo!");
                pessoa--;
                //Metodo utilizado para a contagem de pessoa comece do zero ou um.
            }

            }
            System.out.println("Total de homens: " + qnthomem);
            System.out.println("Total de mulheres: " + qntmulher);
        }
    }
