package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void devePrepararBebidaTradicional() {
        Pedido pedido = new Pedido(new FabricaTradicional());
        assertEquals("Cappuccino com leite integral", pedido.prepararBebida());
    }

    @Test
    void devePrepararAcompanhamentoTradicional() {
        Pedido pedido = new Pedido(new FabricaTradicional());
        assertEquals("Pão de queijo tradicional", pedido.prepararAcompanhamento());
    }

    @Test
    void devePrepararBebidaVegana() {
        Pedido pedido = new Pedido(new FabricaVegana());
        assertEquals("Cappuccino com leite de aveia", pedido.prepararBebida());
    }

    @Test
    void devePrepararAcompanhamentoVegano() {
        Pedido pedido = new Pedido(new FabricaVegana());
        assertEquals("Bolo de banana vegano", pedido.prepararAcompanhamento());
    }

    @Test
    void deveRejeitarFabricaNula() {
        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,
                () -> new Pedido(null));
        assertEquals("Fábrica obrigatória", erro.getMessage());
    }

    @Test
    void deveAceitarNovaFamiliaSemAlterarPedido() {
        FabricaAbstrata fabrica = new FabricaAbstrata() {
            @Override
            public Bebida createBebida() {
                return () -> "Bebida experimental";
            }

            @Override
            public Acompanhamento createAcompanhamento() {
                return () -> "Acompanhamento experimental";
            }
        };
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Bebida experimental", pedido.prepararBebida());
        assertEquals("Acompanhamento experimental", pedido.prepararAcompanhamento());
    }
}