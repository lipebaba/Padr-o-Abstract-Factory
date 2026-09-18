package padroescriacao.abstractfactory;

public class FabricaTradicional implements FabricaAbstrata {

    @Override
    public Bebida createBebida() {
        return new BebidaTradicional();
    }

    @Override
    public Acompanhamento createAcompanhamento() {
        return new AcompanhamentoTradicional();
    }
}
