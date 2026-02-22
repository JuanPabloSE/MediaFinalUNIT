import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("==============================================");
            System.out.println(" UNIVERSIDADE TIRADENTES (UNIT)");
            System.out.println(" CALCULADORA DE MÉDIA FINAL");
            System.out.println("==============================================\n");

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            double prova = lerNota(sc, "Digite a nota da Prova Presencial - PP (0 a 10): ");
            double pas = lerNota(sc, "Digite a nota da PAS (0 a 10): ");

            // Criando o objeto Aluno
            Aluno aluno = new Aluno(nome, prova, pas);

            mostrarInformacoes(aluno);

            System.out.print("Deseja calcular novamente? (S/N): ");
            opcao = sc.next().trim().toUpperCase();
            sc.nextLine(); // limpar buffer

        } while (opcao.equals("S"));

        System.out.println("\nSistema finalizado. Obrigado!");
        sc.close();
    }

    public static double lerNota(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine();

            try {
                double nota = Double.parseDouble(entrada);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    System.out.println("Erro: a nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número válido.");
            }
        }
    }

    public static void mostrarInformacoes(Aluno aluno) {
        System.out.println("\n----------------------------------------------");
        System.out.printf("Aluno(a): %s%n", aluno.getNome());
        System.out.printf("Média Final: %.2f%n", aluno.calcularMedia());
        System.out.printf("Situação: %s%n", aluno.determinarSituacao());
        System.out.println("----------------------------------------------\n");
    }
}