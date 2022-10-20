package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.jdbc.ProdutoDAO;
import br.com.comex.models.ConnectionFactory;

public class MainTestaMetodosProdutos {

	public static void main(String[] args) throws SQLException {
		

		Connection connection = new ConnectionFactory().iniciaConexao();
		ProdutoDAO dao = new ProdutoDAO(connection);
		
//		dao.insereProduto(new Produto("Copo Tantand", "De vidro", 15, 2, 1, 1), "ISENTO");
		
//		
		dao.listagemProduto();
		
//		Produto produto = new Produto("Carregadorr", "Carregador top", 245.00,
//				 2, 1, 1, "ISENTO");
		
//		Categoria categoria = new Categoria("Informática", statusE.ATIVA);
//		
//		dao.atualizaProduto(produto, categoria);
//		
//		
//		dao.removeProduto(1);
	}

}
