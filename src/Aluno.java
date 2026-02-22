public class Aluno {

    private String nome;
    private double prova;
    private double pas;

    public Aluno(String nome, double prova, double pas) {
        this.nome = nome;
        this.prova = prova;
        this.pas = pas;
    }

    public double calcularMedia() {
        return ((prova * 6.0) + (pas * 4.0)) / 10;
    }

    public String determinarSituacao() {
        double mediaFinal = calcularMedia();

        if (mediaFinal >= 6.0) {
            return "Aprovado";
        } else if (mediaFinal >= 4.0) {
            return "Prova Final";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
}