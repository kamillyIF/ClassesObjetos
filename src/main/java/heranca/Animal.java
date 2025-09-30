package heranca;

// Classe Animal
public class Animal {
    String nome;

    public Animal(String nome) { // Construtor de animal
        this.nome = nome; // inicializa o atributo nome
    }
    public void fazerSom() { // metodo fazerSom (que é chamado na subclasse cachorro com Override)
        System.out.println("Som genérico de animal");
    }
}


