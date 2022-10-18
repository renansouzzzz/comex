package br.com.comex.models;


public class ProdutoIsento extends Produto {
	
	public ProdutoIsento(String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			int categoriaProduto, int id) {
		super(nome, descricao, precoUnitario, quantidadeEstoque, categoriaProduto, id, descricao);	
	}
	
	int id;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	int categoriaProduto;	
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getPrecoUni() {
		return this.precoUnitario;
	}
	
	public int getQuantidadeEst() {
		return this.quantidadeEstoque;
	}
	
	public int getCategoriaProd() {
		return this.categoriaProduto;
	}
	
	public double calculaValorEst() {
		return this.quantidadeEstoque * this.precoUnitario;
	}
	
	public double calculaImpostoIsento(Produto precoUnitario) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Principais informações -> ID: " + getId() + " Nome: " + getNome();
	}
}

