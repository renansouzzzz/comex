package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CrudClientes;

public class MainTestaMetodosClientes {

	public static void main(String[] args) throws SQLException {
		
//		CrudClientes.insereCliente("Renan Souza", "44444444444", "(12) 9999-9999"
//				, "Rua Paulo Souza", "23", "Casa", "Jd. Mourisco", "São Paulo", "SP");
		
//		CrudClientes.listagemCliente();
		
//		CrudClientes.atualizaCliente(8, "Paulo Ganso", "55555555555", "(11) 5555-5555"
//				, "Rua Macedo Padado", "256", "Apartamento 2", "Canuto G", "São Roque", "SP");
		
		CrudClientes.removeCliente(1);
	}

}
