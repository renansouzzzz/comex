package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CrudPedidosDAO;

public class MainTestaMetodosPedido {

	public static void main(String[] args) throws SQLException {
		
//		Cliente cliente = new Cliente(12, "Paulo Gansoyy", "5656566666", "(11) 5555-5555"
//				, "Rua Macedo Padado", "576", "Apartamento 2", "Canuto G", "São Roque", "SP");
//		
//		CrudPedidosDAO.inserePedido(new Pedido(12, "12/12/2022", cliente), cliente);
		
		CrudPedidosDAO.listagemPedido();
		
		//CrudPedidosDAO.atualizaPedido(new Pedido(null, null, null));
		
//		CrudPedidosDAO.removePedido(1);
	}
}
