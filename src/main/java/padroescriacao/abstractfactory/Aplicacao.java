package padroescriacao.abstractfactory;

public class Aplicacao {

    public static void main(String[] args) {
        prepararCombo("Combo tradicional", new FabricaTradicional());
        prepararCombo("Combo vegano", new FabricaVegana());
    }

    private static void prepararCombo(String titulo, FabricaAbstrata fabrica) {
        Pedido pedido = new Pedido(fabrica);
        System.out.println(titulo);
        System.out.println(pedido.prepararBebida());
        System.out.println(pedido.prepararAcompanhamento());
        System.out.println();
    }
}