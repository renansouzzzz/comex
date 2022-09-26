package comex;

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
		if (id <= 0) throw new ArithmeticException();
		if (nome.length() <= 5) throw new ArithmeticException();
		if (precoUnitario <= 0) throw new ArithmeticException();
		if (quantidadeEstoque <= 0) throw new ArithmeticException();
		if (categoriaProduto == null) throw new ArithmeticException();
		
		this.id = count.incrementAndGet();
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaProduto = categoriaProduto;
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