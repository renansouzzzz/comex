package comex;


public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private String categoriaProduto;

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