import frete.Pac;
import frete.Sedex;
import frete.ServicoFrete;
import pedido.Pedido;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE MÓDULO 1: FRETE (STRATEGY) ===");

        ServicoFrete calculadora = new ServicoFrete();
        double valorProduto = 100.00;

        // Cliente escolhe Sedex
        calculadora.setEstrategia(new Sedex());
        System.out.println("Frete Sedex: R$ " + calculadora.calcularFrete(valorProduto));

        // Cliente muda para PAC
        calculadora.setEstrategia(new Pac());
        System.out.println("Frete PAC: R$ " + calculadora.calcularFrete(valorProduto));

        System.out.println("\n=== TESTE MÓDULO 2: PEDIDO (STATE) ===");

        Pedido meuPedido = new Pedido(100.00);
        System.out.println("Estado inicial: " + meuPedido.getNomeEstado());

        // Tentando pular etapa
        meuPedido.realizarEnvio(); // Deve dar erro

        // Fluxo normal
        meuPedido.realizarPagamento();
        System.out.println("Novo estado: " + meuPedido.getNomeEstado());

        meuPedido.realizarEnvio();
        System.out.println("Novo estado: " + meuPedido.getNomeEstado());

        // Tentando cancelar depois de enviado
        meuPedido.realizarCancelamento(); // Deve dar erro
    }
}