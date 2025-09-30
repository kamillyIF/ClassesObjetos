package heranca;

// Subclasse cachorro
class Cachorro extends Animal { // EXETENDS - Cachorro HERDA de animal

        public Cachorro(String nome) { // Construtor de cachorro
            super(nome); // chama o construtor nome da classe ANIMAL
        }

        @Override  // Esse Override sobrescreve o metodo fazerSom
        public void fazerSom() {
            System.out.println("Late");
        }
    }

