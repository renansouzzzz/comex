package br.com.comex.models;


public class Produto {
	private long contadorID = 1;
	private long id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private String categoriaProduto;
	
	public Produto(String nome, String descricao, double precoUnitario,
			int quantidadeEstoque, String categoriaProduto) {
		
		this.id = contadorID;; 
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaProduto = categoriaProduto;
		
		if (id <= 0) 
			throw new IllegalArgumentException("O Id deve ser maior que 0!");
		if (nome.length() <= 5) 
			throw new IllegalArgumentException("O nome deve ter mais de 5 carac");
		if (precoUnitario <= 0) 
			throw new IllegalArgumentException("Preço deve ser maior que 0!");
		if (quantidadeEstoque <= 0) 
			throw new IllegalArgumentException("A quantidade deve ser maior que 0!");
		if (categoriaProduto == null) 
			throw new IllegalArgumentException("Categoria não pode ser nulo!");
		if (nome.matches("[0-9].*")) 
			throw new IllegalArgumentException("O nome deve iniciar com letras!");
	}

	public long getId() {
		return this.id;
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
	
	public String getCategoriaProd() {
		return this.categoriaProduto;
	}
	
	public double calculaValorEst() {
		return this.quantidadeEstoque * this.precoUnitario;
	}
	
	public double calculaImposto() {
		return this.precoUnitario * 0.4;
	}
	
	@Override
	public String toString() {
		return "Principais informações -> ID: " + getId() + " Nome: " + getNome();
	}
}