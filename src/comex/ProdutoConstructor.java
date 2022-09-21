package comex;

public class ProdutoConstructor {
	int id = 0;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	String categoriaProduto;

		
	public ProdutoConstructor(int id, String nome, double precoUnitario, int quantidadeEstoque, String categoriaProduto) {
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaProduto = categoriaProduto;
		id++;
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