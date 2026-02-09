import java.util.Locale;
import java.util.Scanner;

public class MediaFinal {
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

            double prova = lerNota(sc, "Digite a nota da PROVA OBJETIVA (0 a 10): ");
            double atividade = lerNota(sc, "Digite a nota da ATIVIDADE ORIENTADA (0 a 10): ");

            double mediaFinal = (prova * 6 + atividade * 4) / 10;

            System.out.println("\n----------------------------------------------");
            System.out.printf("Aluno(a): %s%n", nome);
            System.out.printf("Média Final: %.2f%n", mediaFinal);

            if (mediaFinal >= 6.0) {
                System.out.println("Situação: APROVADO");
            } else if (mediaFinal >= 4.0) {
                System.out.println("Situação: PROVA FINAL");
            } else {
                System.out.println("Situação: REPROVADO");
            }
            System.out.println("----------------------------------------------\n");

            System.out.print("Deseja calcular novamente? (S/N): ");
            opcao = sc.nextLine().trim().toUpperCase();

        } while (opcao.equals("S"));

        System.out.println("\nSistema finalizado. Obrigado!");
        sc.close();
    }

    // LÊ NOTA USANDO SOMENTE nextLine()
    public static double lerNota(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine();

            try {
                double nota = Double.parseDouble(entrada);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    System.out.println("❌ Erro: a nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Erro: digite um número válido.");
            }
        }
    }
}
