package pedido;

public class AguardandoPagamento implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println(" Pagamento processado com sucesso.");
        pedido.setEstado(new Pago());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println(" Erro: Aguarde o pagamento antes de enviar.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println(" Pedido cancelado pelo usuário.");
        // Lógica para mover para um estado "Cancelado" definitivo se houvesse
    }
}