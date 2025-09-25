package exercicio;

public class NovoEstudante {
    private String nome;
    private int matricula;
    private double[] notas;

    public NovoEstudante(String nome, int matricula, double... notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    // Método getMedia
    public double getMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;  // Somando todas as notas
        }
        return soma / notas.length;  // Calculando a média e retornando
    }

    // Método setNotas - Substitui as notas por um novo array
    public void setNotas(double... notas) {

        this.notas = notas;  // Atualizando o array de notas
    }

    // Método getNotas - Retorna a nota no índice informado
    public double getNota(int indice) {
        return notas[indice];

    }
}
