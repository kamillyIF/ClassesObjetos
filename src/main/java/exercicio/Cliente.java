package exercicio;

public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public void notificarPedidoEnviado(){
        System.out.println(nome + ", seu pedido foi enviado!");
    }
}


