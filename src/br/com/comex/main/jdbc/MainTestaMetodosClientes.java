package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CrudClientesDAO;
import br.com.comex.models.Cliente;

public class MainTestaMetodosClientes {

	public static void main(String[] args) throws SQLException {
		
//		CrudClientesDAO.insereCliente("Renan Souza", "44444444444", "(12) 9999-9999"
//				, "Rua Paulo Souza", "23", "Casa", "Jd. Mourisco", "São Paulo", "SP");
		
		//CrudClientesDAO.listagemCliente();
		
		CrudClientesDAO.atualizaCliente(new Cliente(12, "Paulo Gansoyy", "5656566666", "(11) 5555-5555"
				, "Rua Macedo Padado", "576", "Apartamento 2", "Canuto G", "São Roque", "SP"));
		
//		CrudClientesDAO.removeCliente(1);
	}

}
