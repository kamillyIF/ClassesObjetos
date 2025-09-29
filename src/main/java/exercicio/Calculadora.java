package exercicio;

//public class Calculadora {
//    static double soma(double... valores) {
//
//        return 0;
//    }
//
//    static double multiplicacao(double... valores) {
//
//        return 0;
//    }
//
//    static double subtracao(double a, double b) {
//
//        return 0;
//    }
//
//    static double divisao(double a, double b) {
//        // se b == 0
//        // throws new IllegalArgumentException
//        return 0;
//    }
//}

public class Calculadora {

    // Método de soma com quantidade variável de argumentos
    static double soma(double... valores) {
        double resultado = 0.0;
        for (double v : valores) {
            resultado += v;
        }
        return resultado;
    }

    // Método de multiplicação com quantidade variável de argumentos
    static double multiplicacao(double... valores) {
        double resultado = 1.0;
        for (double v : valores) {
            resultado *= v;
        }
        return resultado;
    }

    // Método de subtração (apenas dois valores)
    static double subtracao(double a, double b) {

        return a - b;
    }

    // Método de divisão
    static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return a / b;
    }

    // Método main só para testar a calculadora
    public static void main(String[] args) {
        System.out.println("Soma: " + Calculadora.soma(10, 20, 30));
        System.out.println("Multiplicação: " + Calculadora.multiplicacao(2, 3, 4));
        System.out.println("Subtração: " + Calculadora.subtracao(50, 20));
        System.out.println("Divisão: " + Calculadora.divisao(100, 5));
    }
}
