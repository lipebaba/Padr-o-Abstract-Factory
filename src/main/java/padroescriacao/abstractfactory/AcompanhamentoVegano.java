package padroescriacao.abstractfactory;

public class AcompanhamentoVegano implements Acompanhamento {

    @Override
    public String preparar() {
        return "Bolo de banana vegano";
    }
}
