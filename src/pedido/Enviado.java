package pedido;

public class Enviado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println(" Pedido já enviado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println(" Pedido já está em trânsito.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println(" Erro crítica: Não é possível cancelar pedido em trânsito.");
    }
}