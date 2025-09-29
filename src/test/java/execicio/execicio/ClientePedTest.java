package execicio.execicio;

import exercicio.Cliente;
import exercicio.Pedido;

public class ClientePedTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("JOAO");
        Pedido pedido = new Pedido(cliente);

        pedido.notificarCliente();
    }

}
