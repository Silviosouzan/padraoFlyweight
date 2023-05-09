import org.junit.Test;
import static org.junit.Assert.*;

public class FabricaPedidoTest {
    @Test
    public void testGetPedido() {
        FabricaPedido fabrica = new FabricaPedido();

        PedidoFlyweight pedido1 = fabrica.getPedido("123", "João", "Camisa", 50.0, 1);
        PedidoFlyweight pedido2 = fabrica.getPedido("123", "João", "Camisa", 50.0, 1);
        PedidoFlyweight pedido3 = fabrica.getPedido("456", "Maria", "Calça", 80.0, 2);

        assertSame(pedido1, pedido2);
        assertNotSame(pedido1, pedido3);

        pedido1.exibirDetalhes("123");
        pedido3.exibirDetalhes("456");
    }
}