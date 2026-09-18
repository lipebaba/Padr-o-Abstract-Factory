package padroescriacao.abstractfactory;

public class Pedido {

    private final Bebida bebida;
    private final Acompanhamento acompanhamento;

    public Pedido(FabricaAbstrata fabrica) {
        if (fabrica == null) {
            throw new IllegalArgumentException("Fábrica obrigatória");
        }
        this.bebida = fabrica.createBebida();
        this.acompanhamento = fabrica.createAcompanhamento();
    }

    public String prepararBebida() {
        return this.bebida.preparar();
    }

    public String prepararAcompanhamento() {
        return this.acompanhamento.preparar();
    }
}