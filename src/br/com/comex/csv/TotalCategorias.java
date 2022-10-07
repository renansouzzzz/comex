package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {
	public static void main(String[] args) throws FileNotFoundException {

		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		List<String> categorias = new ArrayList<>();
		
		for (PedidoCsv categoria : pedidosCsv) {
			String categoriaContem = categoria.getCategoria();
		
		
		if(!categorias.contains(categoriaContem)) 
			categorias.add(categoriaContem);
		}
		
		System.out.println("Total de categorias: " + categorias.size());
	}		
}


	

