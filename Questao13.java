import java.util.Scanner;

public class questao13 {
    String matricula;
    String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public questao13(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return ((notaProva1 + notaProva2) * 2.5 + notaTrabalho * 2) / 7.5;
    }

    public double calcularNotaFinal() {
        double media = calcularMedia();
        if (media >= 6.0) {
            return 0;
        } else {
            return 12.0 - media * 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.next();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Digite a nota da 1° prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2° prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota total do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        questao13 aluno = new questao13(matricula, nome, notaProva1, notaProva2, notaTrabalho);

        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Nota necessária na prova final: " + aluno.calcularNotaFinal());
        
    }
}
