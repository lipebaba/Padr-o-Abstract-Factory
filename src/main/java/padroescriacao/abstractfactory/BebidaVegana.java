package padroescriacao.abstractfactory;

public class BebidaVegana implements Bebida {

    @Override
    public String preparar() {
        return "Cappuccino com leite de aveia";
    }
}
