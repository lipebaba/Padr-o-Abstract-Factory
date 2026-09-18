package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaTest {

    @Test
    void deveCriarFamiliaTradicionalCompativel() {
        FabricaAbstrata fabrica = new FabricaTradicional();
        assertTrue(fabrica.createBebida() instanceof BebidaTradicional);
        assertTrue(fabrica.createAcompanhamento() instanceof AcompanhamentoTradicional);
    }

    @Test
    void deveCriarFamiliaVeganaCompativel() {
        FabricaAbstrata fabrica = new FabricaVegana();
        assertTrue(fabrica.createBebida() instanceof BebidaVegana);
        assertTrue(fabrica.createAcompanhamento() instanceof AcompanhamentoVegano);
    }
}