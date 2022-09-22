package comex;

public class ItemPedido {
	int id = 0;
	double precoUnitario;
	int quantidadeComprada;
	ProdutoConstructor produto;
	Pedido pedido;
	double desconto;
	int tipoDesconto = 0;
	
	// Cada vez que for chamado o construtor o ID incrementará + 1
	
	public ItemPedido(int id, double precoUnitario, int quantidadeComprada, ProdutoConstructor produto, Pedido pedido,
			double desconto, int tipoDesconto) {
		this.id = id++;
		this.precoUnitario = precoUnitario;
		this.quantidadeComprada = quantidadeComprada;
		this.produto = produto;
		this.pedido = pedido;
		this.desconto = desconto;
		this.tipoDesconto = tipoDesconto;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}
	
	public ProdutoConstructor getProduto() {
		return produto;
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public double getDesconto() {
		return this.desconto;
	}
	
	public int getTipoDesconto() {
		return this.tipoDesconto;
	}
	
	public double precoSemDesconto() {
		return this.precoUnitario * this.quantidadeComprada;
	}
	
	
	// quantidade = 0; promocao = 1; nenhum = 2;
	
	public double calculaDesconto() {
		if (this.tipoDesconto == 0) {
				return this.precoUnitario * this.quantidadeComprada;
		}
		else if (this.tipoDesconto == 1){
			double somaPromo;
			somaPromo = this.precoUnitario * this.quantidadeComprada * 0.20;
				return this.precoUnitario * this.quantidadeComprada - somaPromo;
		}
		else if (this.quantidadeComprada > 10) {
			double somaItens;
			somaItens = this.precoUnitario * this.quantidadeComprada * 0.10;
				return this.precoUnitario * this.quantidadeComprada - somaItens;
		}
		return 0;
	}
}


