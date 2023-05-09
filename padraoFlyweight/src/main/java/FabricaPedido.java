import java.util.HashMap;
import java.util.Map;

public class FabricaPedido {
    private Map<String, PedidoFlyweight> pedidos = new HashMap<>();

    public PedidoFlyweight getPedido(String numeroPedido, String nomeCliente, String nomeProduto, double precoProduto, int quantidade) {
        PedidoFlyweight pedido = pedidos.get(numeroPedido);

        if (pedido == null) {
            pedido = new Pedido(nomeCliente, nomeProduto, precoProduto, quantidade);
            pedidos.put(numeroPedido, pedido);
        }

        return pedido;
    }
}
