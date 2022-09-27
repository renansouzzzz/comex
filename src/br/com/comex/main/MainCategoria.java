package br.com.comex.main;

import br.com.comex.models.Categoria;
import br.com.comex.models.Categoria.statusCat;

public class MainCategoria {
	public static void main(String[] args) {
		
		// testando valores inválidos e válidos
		Categoria categoria1 = new Categoria("IN", statusCat.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", statusCat.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", statusCat.ATIVA);

		
		System.out.println("Categoria " + categoria1.getNome() + 
				" (" + categoria1.getId() + " - " + categoria1.getStatus() + ")");
		
		System.out.println("Categoria " + categoria2.getNome() + 
				" (" + categoria2.getId() + " - " + categoria2.getStatus() + ")");
		
		System.out.println("Categoria " + categoria3.getNome() + 
				" (" + categoria3.getId() + " - " + categoria3.getStatus() + ")");
	}
}