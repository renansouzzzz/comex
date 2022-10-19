package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.jdbc.ClienteDAO;
import br.com.comex.dao.jdbc.ItemPedidoDAO;
import br.com.comex.models.Cliente;
import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.ItemPedido;
import br.com.comex.models.Pedido;
import br.com.comex.models.Produto;

public class MainTestaMetodosItemPedido {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().iniciaConexao();
		ItemPedidoDAO dao = new ItemPedidoDAO(connection);
		
		Produto produto = new Produto("Carregador Portátil", "Top", 340, 2, 1, 12, "t");
		
		Pedido pedido = new Pedido("12/09/2021", new Cliente(12, "Paulo Gansoyyu", "56565665666", "(11) 6555-5555"
				, "Rua Macedo Padado", "76", "Apartamento 2", "Canuto G", "São Roque", "SP"));
		
		ItemPedido itempedido = new ItemPedido(12, 324, 1, produto, pedido, 0, "QUANTIDADE");
		
		dao.insereItemPedido(itempedido, produto, pedido);
		
//		dao.listagemItemPedido();
		
//		dao.atualizaItemPedido(itempedido, produto, pedido);
//		
//		dao.removeItemPedido(1);
	}
}
