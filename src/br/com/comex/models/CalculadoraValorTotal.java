package br.com.comex.models;

public class CalculadoraValorTotal extends ItemPedido {
	double total;
	
	public CalculadoraValorTotal(int id, double precoUnitario,
			int quantidadeComprada, ProdutoConstructor produto,
			Pedido pedido, double desconto, int tipoDesconto) throws ComexException{
		super(id, precoUnitario, quantidadeComprada, produto, pedido, desconto, tipoDesconto);
	}

	public void totalValor() {
		total = this.precoUnitario * this.quantidadeComprada;
	}
	
	public double calcula(ProdutoConstructor ProdutoConstructor) {
		return this.total;
	}
}