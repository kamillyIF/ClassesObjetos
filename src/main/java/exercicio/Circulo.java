package exercicio;

public class Circulo {
    private float raio;
    private final float PI = 3.14159f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        return PI * raio * raio; // área = pi * raio ao quadrado
    }

    public double getCircunferencia() {
        return 2 * Math.PI * raio; // circunferência = 2 * pi * raio
    }

    // Método principal só para testar rodando direto
    public static void main(String[] args) {
        Circulo c = new Circulo(4.5f);
        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área: " + c.getArea());
        System.out.println("Circunferência: " + c.getCircunferencia());
    }
}
