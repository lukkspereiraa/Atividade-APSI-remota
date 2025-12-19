package pedido;

public class Pedido {
    private EstadoPedido estadoAtual;
    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
        // Estado Inicial
        this.estadoAtual = new AguardandoPagamento();
    }

    // Método para transição de estado (usado pelas classes de Estado)
    protected void setEstado(EstadoPedido novoEstado) {
        this.estadoAtual = novoEstado;
    }

    // Métodos públicos que o cliente chama
    public void realizarPagamento() {
        estadoAtual.pagar(this);
    }

    public void realizarEnvio() {
        estadoAtual.enviar(this);
    }

    public void realizarCancelamento() {
        estadoAtual.cancelar(this);
    }

    // Getter para visualização
    public String getNomeEstado() {
        return estadoAtual.getClass().getSimpleName();
    }
}