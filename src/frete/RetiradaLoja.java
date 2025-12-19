package frete;

public class RetiradaLoja implements EstrategiaFrete {
    @Override
    public double calcular(double valorPedido) {
        return 0.00;
    }
}