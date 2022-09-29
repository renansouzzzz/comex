package br.com.comex.main;

import br.com.comex.models.Categoria;
import br.com.comex.models.Categoria.statusE;
import br.com.comex.models.ComexException;



public class MainCategoria {
	public static void main(String[] args) throws ComexException {
		
		// testando valores inválidos e válidos
		Categoria categoria1 = new Categoria("IN", statusE.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", statusE.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", statusE.ATIVA);

		
		System.out.println("Categoria " + categoria1.getNome() + 
				" (" + categoria1.getId() + " - " + categoria1.getStatus() + ")");
		
		System.out.println("Categoria " + categoria2.getNome() + 
				" (" + categoria2.getId() + " - " + categoria2.getStatus() + ")");
		
		System.out.println("Categoria " + categoria3.getNome() + 
				" (" + categoria3.getId() + " - " + categoria3.getStatus() + ")");
	}
}