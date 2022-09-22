package comex;

public class CalculadoraValorTotal extends ItemPedido {
	double total;
	
	public CalculadoraValorTotal(int id, double precoUnitario, int quantidadeComprada, ProdutoConstructor produto,
			Pedido pedido, double desconto, int tipoDesconto) {
		super(id, precoUnitario, quantidadeComprada, produto, pedido, desconto, tipoDesconto);
	}

	@Override
	public double calculaDesconto() {
		return super.calculaDesconto();
	}
}