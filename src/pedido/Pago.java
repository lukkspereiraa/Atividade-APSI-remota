package pedido;

public class Pago implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println(" O pedido já está pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println(" Enviando produtos para transportadora...");
        pedido.setEstado(new Enviado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println(" Estornando pagamento e cancelando pedido...");
        pedido.setEstado(new AguardandoPagamento()); // Retorna ao estado inicial
    }
}