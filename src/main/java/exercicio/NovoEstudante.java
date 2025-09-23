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

    // Método getMedia corrigido
    public double getMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;  // Somando todas as notas
        }
        return soma / notas.length;  // Calculando a média e retornando
    }

    // Método setNotas - já estava correto
    public void setNotas(double... notas) {
        this.notas = notas;  // Atualizando o array de notas
    }

    // Método getNotas corrigido
    public double getNota(int indice) {

    }
}
