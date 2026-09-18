package padroescriacao.abstractfactory;

public class BebidaTradicional implements Bebida {

    @Override
    public String preparar() {
        return "Cappuccino com leite integral";
    }
}
