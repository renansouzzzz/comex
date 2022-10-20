package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.jdbc.PedidoDAO;
import br.com.comex.models.Cliente;
import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.Pedido;

public class MainTestaMetodosPedido {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().iniciaConexao();
		PedidoDAO dao = new PedidoDAO(connection);
		
		Cliente cliente = new Cliente(12, "Paulo Ganso", "55555555555", "(11) 5555-5555"
				, "Rua Macedo Padado", "256", "Apartamento 2", "Canuto G", "São Roque", "SP");
		
//		dao.inserePedido(new Pedido("12/11/2022", cliente), cliente);
		
		dao.listagemPedido();
		
//		dao.atualizaPedido(new Pedido(null, null, null));
		
//		dao.removePedido(1);
	}
}
