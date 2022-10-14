package br.com.comex.models;

public class ItemPedido {
	private static long contadorID = 1;
	private long id;
	private double precoUnitario;
	private int quantidadeComprada;
	private Produto produto;
	private Pedido pedido;
	private double desconto;
	private int tipoDesconto = 0;
	private String tipo_desconto;
	
	// Cada vez que for chamado o construtor o ID incrementará + 1	
	public ItemPedido(double precoUnitario, int quantidadeComprada, Produto produto, Pedido pedido,
			double desconto, int tipoDesconto) {
		
		this.id = contadorID;
		this.precoUnitario = precoUnitario;
		this.quantidadeComprada = quantidadeComprada;
		this.produto = produto;
		this.pedido = pedido;
		this.desconto = desconto;
		this.tipoDesconto = tipoDesconto;
		contadorID++;
	}
	
	public ItemPedido(Integer id, double precoUnitario, Integer quantidadeComprada, Produto produto, Pedido pedido, double desconto, String tipo_desconto) {
		this.id = id;
		this.precoUnitario = precoUnitario;
		this.quantidadeComprada = quantidadeComprada;
		this.produto = produto;
		this.pedido = pedido;
		this.desconto = desconto;
		this.tipo_desconto = tipo_desconto;
	}
	
	public long getId() {
		return id;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}
	
	public Produto getProduto() {
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
	
	public String getTipo_desconto() {
		return tipo_desconto;
		
	}
	
	
	// nenhum = 0; promocao = 1;
	
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
	
	@Override
	public String toString() {
		return "Principais informações -> ID: " + getId() + " Preço unitário: " + getPrecoUnitario();
	}
}


