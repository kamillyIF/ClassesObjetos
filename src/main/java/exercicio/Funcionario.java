package exercicio;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public double setSalario(double salario) {
        this.salario = salario;
    }

    public int setIdade(int idade) {
        this.idade = idade;
    }
}