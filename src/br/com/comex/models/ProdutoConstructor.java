package br.com.comex.models;

import java.util.concurrent.atomic.AtomicInteger;

public class ProdutoConstructor {
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private String categoriaProduto;

	//IllegalArgumentException ex = new IllegalArgumentException();
	
	public ProdutoConstructor(String nome, double precoUnitario, int quantidadeEstoque, String categoriaProduto) {
		this.id = count.incrementAndGet();
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaProduto = categoriaProduto;
		}
	
	public ProdutoConstructor (ProdutoConstructor p) {
		if (p.id <= 0 | p.precoUnitario <= 0 | p.quantidadeEstoque <= 0) throw new IllegalArgumentException();
		if (p.nome.length() <= 5) throw new IllegalArgumentException();
		if (p.categoriaProduto == null) throw new IllegalArgumentException();
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
		
	public String getCategoriaProd() {
		return this.categoriaProduto;
		}
		
	public double calculaValorEst() {
		return this.quantidadeEstoque * this.precoUnitario;
	}
		
	public double calculaImposto() {
		return this.precoUnitario * 0.4;
	}	
		
}