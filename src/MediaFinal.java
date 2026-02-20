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

            double prova = lerNota(sc, "Digite a nota da Prova Presencial - PP (0 a 10): ");
            double pas = lerNota(sc, "Digite a nota da Produção de Aprendizagem Significativa - PAS (0 a 10): ");

            // MÉTODOS
            double mediaFinal = calcularMedia(prova, pas);
            String situacao = determinarSituacao(mediaFinal);

            mostrarInformacoes(nome, mediaFinal, situacao);

            System.out.print("Deseja calcular novamente? (S/N): ");
            opcao = sc.next().trim().toUpperCase();

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
                    System.out.println("Erro: a nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número válido.");
            }
        }
    }

    public static double calcularMedia(double prova, double pas) {
        return ((prova * 6.0) + (pas * 4.0)) / 10;
    }

    public static String determinarSituacao(double mediaFinal) {
        if (mediaFinal >= 6.0) {
            return "Aprovado";
        } else if (mediaFinal >= 4.0) {
            return "Prova Final";
        } else {
            return "Reprovado";
        }
    }

    public static void mostrarInformacoes(String nome, double mediaFinal, String situacao) {
        System.out.println("\n----------------------------------------------");
        System.out.printf("Aluno(a): %s%n", nome);
        System.out.printf("Média Final: %.2f%n", mediaFinal);
        System.out.printf("Situação: %s%n", situacao);

        System.out.println("----------------------------------------------\n");
    }

}
