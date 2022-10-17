package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CrudPedidosDAO;
import br.com.comex.models.Cliente;
import br.com.comex.models.Pedido;

public class MainTestaMetodosPedido {

	public static void main(String[] args) throws SQLException {
		
		Cliente cliente = new Cliente(12, "Paulo Ganso", "55555555555", "(11) 5555-5555"
				, "Rua Macedo Padado", "256", "Apartamento 2", "Canuto G", "São Roque", "SP");
		
		CrudPedidosDAO.inserePedido(new Pedido("12/11/2022", cliente), cliente);
		
//		CrudPedidosDAO.listagemPedido();
		
//		CrudPedidosDAO.atualizaPedido(new Pedido(null, null, null));
		
//		CrudPedidosDAO.removePedido(1);
	}
}
