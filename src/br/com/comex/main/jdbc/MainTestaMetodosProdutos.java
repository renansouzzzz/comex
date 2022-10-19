package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.ProdutoDAO;
import br.com.comex.models.Categoria;
import br.com.comex.models.Categoria.statusE;
import br.com.comex.models.Produto;

public class MainTestaMetodosProdutos {

	public static void main(String[] args) throws SQLException {
		

//		CrudProdutosDAO.insereProduto(new Produto("Copo Tantand", "De vidro", 15, 2, 1, 1), "ISENTO");
		
//		
		ProdutoDAO.listagemProduto();
		
//		Produto produto = new Produto("Carregadorr", "Carregador top", 245.00,
//				 2, 1, 1, "ISENTO");
		
//		Categoria categoria = new Categoria("Informática", statusE.ATIVA);
//		
//		ProdutoDAO.atualizaProduto(produto, categoria);
//		
// FALTA APENAS O ATUALIZA!!!!
//		
//		CrudProdutosDAO.removeProduto(1);
	}

}
