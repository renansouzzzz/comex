package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CrudProdutos;

public class MainTestaMetodosProdutos {

	public static void main(String[] args) throws SQLException {
		
		CrudProdutos.insereProduto("Notebook i7", "Notebook topissimo", 7500.00, 1, 1, "ISENTO");
		CrudProdutos.insereProduto("Notebook i5", "Notebook inferior à i7", 5400.00, 1, 1, "ISENTO");
		CrudProdutos.insereProduto("Monitor 144hz", "Monitor de qualidade", 1450.00, 1, 1, "ISENTO");
		
		CrudProdutos.listagemProduto();
		
		CrudProdutos.atualizaProduto(1, "Notebook i5", "Notebook topissimo", 7400.00, 1, 1, "ISENTO");
		
		CrudProdutos.removeProduto(1);
	}

}
