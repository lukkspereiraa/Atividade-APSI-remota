package frete;

public class Sedex implements EstrategiaFrete {
    @Override
    public double calcular(double valorPedido) {
        return 50.00;
    }
}