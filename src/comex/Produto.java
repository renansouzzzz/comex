package comex;


public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private String categoriaProduto;
	
	public Produto(int id, String nome, String descricao, double precoUnitario,
			int quantidadeEstoque, String categoriaProduto) {
		if (id <= 0) throw new ArithmeticException("O Id deve ser maior que 0!");
		if (nome.length() <= 5) throw new ArithmeticException("O nome deve ter mais de 5 carac");
		if (precoUnitario <= 0) throw new ArithmeticException("Preço deve ser maior que 0!");
		if (quantidadeEstoque <= 0) throw new ArithmeticException("A quantidade deve ser maior que 0!");
		if (categoriaProduto == null) throw new ArithmeticException("Categoria não pode ser nulo!");
		
		this.id = id; 
		this.nome = nome;
		this.descricao = descricao;
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