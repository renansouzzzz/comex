package comex;

public class Produto {
	int id;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	String categoriaProduto;


	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public double getPrecoUni() {
		return precoUnitario;
	}
	
	public int getQuantidadeEst() {
		return quantidadeEstoque;
	}
	
	public String getCategoriaProd() {
		return categoriaProduto;
	}
	
	public double calculaValorEst() {
		return quantidadeEstoque * precoUnitario;
	}
	
	public double calculaImposto() {
		return precoUnitario * 0.4;
	}
}