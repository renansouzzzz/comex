package br.com.comex.main.jdbc;

import java.sql.SQLException;

import br.com.comex.dao.jdbc.CrudItemPedidoDAO;
import br.com.comex.models.Cliente;
import br.com.comex.models.ItemPedido;
import br.com.comex.models.Pedido;
import br.com.comex.models.Produto;

public class MainTestaMetodosItemPedido {

	public static void main(String[] args) throws SQLException {
		
		Produto produto = new Produto("Carregador Portátil", "Top", 340, 2, 1, 12, "t");
		
		Pedido pedido = new Pedido("12/09/2021", new Cliente(12, "Paulo Gansoyyu", "56565665666", "(11) 6555-5555"
				, "Rua Macedo Padado", "76", "Apartamento 2", "Canuto G", "São Roque", "SP"));
		
		ItemPedido itempedido = new ItemPedido(12, 324, 1, produto, pedido, 0, "QUANTIDADE");
		
		CrudItemPedidoDAO.insereItemPedido(itempedido, produto, pedido);
		
//		CrudItemPedidoDAO.listagemItemPedido();
		
//		CrudItemPedidoDAO.atualizaItemPedido(itempedido, produto, pedido);
//		
//		CrudItemPedidoDAO.removeItemPedido(1);
	}
}
