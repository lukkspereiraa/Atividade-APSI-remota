package frete;

public class ServicoFrete {
    private EstrategiaFrete estrategia;

    // O cliente pode injetar a estratégia no construtor ou via Setter
    public void setEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularFrete(double valorProduto) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhum tipo de frete foi selecionado!");
        }
        return estrategia.calcular(valorProduto);
    }
}