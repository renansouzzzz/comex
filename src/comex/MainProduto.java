package comex;

public class MainProduto {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		ProdutoIsento produto2Isento = new ProdutoIsento();
	
		/*
		produto1.id = 1;
		produto1.nome = "Notebook Samsung";
		produto1.precoUnitario = 3523.00;
		produto1.quantidadeEstoque = 1;
		produto1.categoriaProduto = "Informática";
		
		produto2.id = 2;
		produto2.nome = "Clean Architecture";
		produto2.precoUnitario = 109.90;
		produto2.quantidadeEstoque = 2;
		produto2.categoriaProduto = "Livros";
		
		produto3.id = 3;
		produto3.nome = "Monitor Dell 27";
		produto3.precoUnitario = 1889.00;
		produto3.quantidadeEstoque = 3;
		produto3.categoriaProduto = "Informática";
		
		produto2Isento.id = 2;
		produto2Isento.nome = "Clean Architecture";
		produto2Isento.precoUnitario = 109.90;
		produto2Isento.quantidadeEstoque = 2;
		produto2Isento.categoriaProduto = "Livros";
		*/
		
		System.out.println("Produto " + produto1.getId());
		System.out.println("ID: " + produto1.getId());
		System.out.println("Nome: " + produto1.getNome());
		System.out.println("Preço Unitário: " + produto1.getPrecoUni());
		System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEst());
		System.out.println("Categoria: " + produto1.getCategoriaProd());
		System.out.println("Total de valor incluindo estoque: " + produto1.calculaValorEst());
		System.out.println("Cálculo de imposto: " + produto1.calculaImposto());
		
		System.out.println();
		System.out.println("Produto " + produto2.getId());
		System.out.println("ID: " + produto2.getId());
		System.out.println("Nome: " + produto2.getNome());
		System.out.println("Preço Unitário: " + produto2.getPrecoUni());
		System.out.println("Quantidade em estoque: " + produto2.getQuantidadeEst());
		System.out.println("Categoria: " + produto2.getCategoriaProd());
		System.out.println("Total de valor incluindo estoque: " + produto2.calculaValorEst());
		System.out.println("Cálculo de imposto: " + produto2.calculaImposto());
		
		System.out.println();
		System.out.println("Produto " + produto3.getId());
		System.out.println("ID: " + produto3.getId());
		System.out.println("Nome: " + produto3.getNome());
		System.out.println("Preço Unitário: " + produto3.getPrecoUni());
		System.out.println("Quantidade em estoque: " + produto3.getQuantidadeEst());
		System.out.println("Categoria: " + produto3.getCategoriaProd());
		System.out.println("Total de valor incluindo estoque: " + produto3.calculaValorEst());
		System.out.println("Cálculo de imposto: " + produto3.calculaImposto());
		
		
		// Neste caso faremos o produto 2 utilizar a funcao produto isento
		System.out.println();
		System.out.println("Produto " + produto2Isento.getId());
		System.out.println("ID: " + produto2Isento.getId());
		System.out.println("Nome: " + produto2Isento.getNome());
		System.out.println("Preço Unitário: " + produto2Isento.getPrecoUni());
		System.out.println("Quantidade em estoque: " + produto2Isento.getQuantidadeEst());
		System.out.println("Categoria: " + produto2Isento.getCategoriaProd());
		System.out.println("Total de valor incluindo estoque: " + produto2Isento.calculaValorEst());
		System.out.println("Cálculo de imposto: " + produto2Isento.calculaImposto());

	}
}