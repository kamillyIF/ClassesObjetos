package exercicio;

public class Pedido {
    private Cliente cliente;

    public Pedido(Cliente cliente) {

        this.cliente = cliente;
    }

    public void notificarCliente() {

        cliente.notificarPedidoEnviado();
    }
}
