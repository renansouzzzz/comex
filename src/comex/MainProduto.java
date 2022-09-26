package comex;

public class MainProduto {
	public static void main(String[] args) {
		
		ProdutoIsento produto1Isento = new ProdutoIsento(3, "Notebook Samsung", "Descrição", 3523
				, 6, "Informática");
		
		// produto com problema no ID
		ProdutoIsento produto2Isento = new ProdutoIsento(0, "Notebook Dell", "Descrição", 3523
				, 6, "Informática");
	
	
		
		// Neste caso faremos o produto 2 utilizar a funcao produto isento
		
		System.out.println();
		System.out.println("Produto " + produto1Isento.getId());
		System.out.println("ID: " + produto1Isento.getId());
		System.out.println("Nome: " + produto1Isento.getNome());
		System.out.println("Preço Unitário: " + produto1Isento.getPrecoUni());
		System.out.println("Quantidade em estoque: " + produto1Isento.getQuantidadeEst());
		System.out.println("Categoria: " + produto1Isento.getCategoriaProd());
		System.out.println("Total de valor incluindo estoque: " + produto1Isento.calculaValorEst());
		System.out.println("Cálculo de imposto: " + produto1Isento.calculaImposto());
		
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