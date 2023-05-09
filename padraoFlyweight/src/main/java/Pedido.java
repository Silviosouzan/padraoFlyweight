public class Pedido implements PedidoFlyweight {
    private String nomeCliente;
    private String nomeProduto;
    private double precoProduto;
    private int quantidade;

    public Pedido(String nomeCliente, String nomeProduto, double precoProduto, int quantidade) {
        this.nomeCliente = nomeCliente;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
    }

    @Override
    public void exibirDetalhes(String numeroPedido) {
        System.out.println("Pedido #" + numeroPedido + ": " + nomeProduto + ", " + precoProduto + ", " + quantidade + " unidades, para " + nomeCliente);
    }
}