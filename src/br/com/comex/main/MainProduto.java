package br.com.comex.main;

import br.com.comex.models.ProdutoIsento;

public class MainProduto {
	public static void main(String[] args) {
		
		ProdutoIsento produto1Isento = new ProdutoIsento("Notebook Samsung", "Descrição", 3523
				, 6, 1, 0);
		
		// produto com problema
		ProdutoIsento produto2Isento = new ProdutoIsento("5Notebook Dell", "Des3", 3523
				, 6, 2, 0);
	
		
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