package padroescriacao.abstractfactory;

public class FabricaVegana implements FabricaAbstrata {

    @Override
    public Bebida createBebida() {
        return new BebidaVegana();
    }

    @Override
    public Acompanhamento createAcompanhamento() {
        return new AcompanhamentoVegano();
    }
}
