package br.com.comex.models;


public class Produto {
	private static int contadorID = 1;
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private int categoriaProduto;
	private String tipo;
	
	public Produto(String nome, String descricao, double precoUnitario,
			int quantidadeEstoque, int categoriaProduto) {
		
		this.id = contadorID;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaProduto = categoriaProduto;
		
		validacaoId();
		validacaoNome();
		validacaoPreco();
		validacaoProduto();	
		contadorID++;
	}
	
	public Produto(String nome, String descricao, double precoUnitario,
			int quantidadeEstoque, int categoriaProduto, int id, String tipo) {

		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaProduto = categoriaProduto;
		this.tipo = tipo;
		
		
		validacaoId();
		validacaoNome();
		validacaoPreco();
		validacaoProduto();	
	}
	
	public void validacaoId(){
		if (id <= 0) 
			throw new IllegalArgumentException("O Id deve ser maior que 0!");
	}
	
	public void validacaoNome(){
		if (nome.length() <= 5) 
			throw new IllegalArgumentException("O nome deve ter mais de 5 carac");
		
		if (nome.matches("[0-9].*")) 
			throw new IllegalArgumentException("O nome deve iniciar com letras!");
	}
	
	public void validacaoPreco(){
		if (precoUnitario <= 0) 
			throw new IllegalArgumentException("Preço deve ser maior que 0!");
	}
	
	public void validacaoProduto(){
		if (quantidadeEstoque <= 0) 
			throw new IllegalArgumentException("A quantidade deve ser maior que 0!");
		if (categoriaProduto == 0) 
			throw new IllegalArgumentException("Categoria não pode ser nulo!");
	}
	
	public int getId() {
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
	
	public int getCategoriaProd() {
		return this.categoriaProduto;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double calculaValorEst() {
		return this.quantidadeEstoque * this.precoUnitario;
	}
	
	public double calculaImposto() {
		return this.precoUnitario * 0.4;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void setCategoriaProduto(int categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + "\n Nome: " + getNome() + "\n Descrição: " + getDescricao() +
		"\n Preço Unitário: " + getPrecoUni() + "\n Quantidade Estoque: " + getQuantidadeEst()
		+ "\n Categoria Produto: " + getCategoriaProd() + "\n\n";
	}
}