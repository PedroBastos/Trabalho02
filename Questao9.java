import java.util.Scanner;
public class usuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, cpf, telefone, senha;
        int idusuario;
        int usuario;
        int proximoID = 1;

        System.out.print("Digite o nome do usuário: ");
        nome = input.nextLine();
        System.out.print("Digite o CPF do usuário: ");
        cpf = input.nextLine();
        System.out.print("Digite o telefone do usuário: ");
        telefone = input.nextLine();
        System.out.print("Digite a senha do usuário: ");
        senha = input.nextLine();

        idusuario = proximoID;
        proximoID++;

        cadastrarUsuario(nome, cpf, telefone, senha, idusuario);
        fazerLogin(idusuario);
    }
    //Chamando os métodos para dentro da Classe para ser usados.
    public static void cadastrarUsuario(String nome, String cpf, String telefone, String senha, int idusuario) {
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void fazerLogin(int idusuario) {
        System.out.println("Usuário " + idusuario + " logado com sucesso!");
    }
}
