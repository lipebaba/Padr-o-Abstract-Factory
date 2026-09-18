package padroescriacao.abstractfactory;

public class AcompanhamentoTradicional implements Acompanhamento {

    @Override
    public String preparar() {
        return "Pão de queijo tradicional";
    }
}
