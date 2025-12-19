package frete;

public class Pac implements EstrategiaFrete {
    @Override
    public double calcular(double valorPedido) {
        return 20.00;
    }
}