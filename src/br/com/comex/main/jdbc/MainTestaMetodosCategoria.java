package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CategoriaDAO;
import br.com.comex.dao.jdbc.ClienteDAO;
import br.com.comex.models.Cliente;

public class MainTestaMetodosCategoria {

	public static void main(String[] args) throws SQLException {
		
//		CategoriaDAO.insereCliente("Renan Souza", "44444444444", "(12) 9999-9999"
//				, "Rua Paulo Souza", "23", "Casa", "Jd. Mourisco", "São Paulo", "SP");
		
		CategoriaDAO.listagemCategoria();
		
//		CategoriaDAO.atualizaCliente(new Cliente(12, "Paulo Gansoyy", "5656566666", "(11) 5555-5555"
//				, "Rua Macedo Padado", "576", "Apartamento 2", "Canuto G", "São Roque", "SP"));
		
//		CategoriaDAO.removeCliente(1);
	}

}
