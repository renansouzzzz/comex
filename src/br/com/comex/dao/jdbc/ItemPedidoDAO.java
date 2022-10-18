package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.ItemPedido;
import br.com.comex.models.Pedido;
import br.com.comex.models.Produto;

public class ItemPedidoDAO {
	
	public static void insereItemPedido(ItemPedido itemPedido, Produto produto, Pedido pedido) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		
		String insertSql = "INSERT INTO comex.ITEM_PEDIDO(id, preco_unitario, quantidade, produto_id, pedido_id,"
				+ " desconto, tipo_desconto) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setLong(1, itemPedido.getId());
		stm.setDouble(2, itemPedido.getPrecoUnitario());
		stm.setInt(3, itemPedido.getQuantidadeComprada());
		stm.setInt(4, produto.getId());
		stm.setLong(5, pedido.getId());
		stm.setDouble(6, itemPedido.getDesconto());
		stm.setString(7, itemPedido.getTipo_desconto());
		
		stm.execute();
		
		con.close();
		
	}
	
	public static List<ItemPedido> listagemItemPedido() throws SQLException {
		
		List<ItemPedido> itempedidos = new ArrayList<>();
		ConnectionFactory conectorFac = new ConnectionFactory();
		Connection con = conectorFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("SELECT * FROM comex.ITEM_PEDIDO");
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer id = result.getInt("id");
			Double preco_unitario = result.getDouble("preco_unitario");
			Integer quantidade = result.getInt("quantidade");
			Produto produto_id = (Produto) result.getObject("produto_id");
			Pedido pedido_id = (Pedido) result.getObject("pedido_id");
			Double desconto = result.getDouble("desconto");
			String tipo_desconto = result.getString("tipo_desconto");   
			
			itempedidos.add(new ItemPedido(id, preco_unitario, quantidade, produto_id, pedido_id, desconto, tipo_desconto));
			
			System.out.println(itempedidos);
		}
		
		con.close();
		return listagemItemPedido();
	}
	 
	public static void atualizaItemPedido(ItemPedido itemPedido, Produto produto, Pedido pedido) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.ITEM_PEDIDO SET preco_unitario = ?, quantidade = ?, produto_id = ?, "
				+ "pedido_id = ?, desconto = ?, tipo_desconto = ? where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setDouble(1, itemPedido.getPrecoUnitario());
		stm.setInt(2, itemPedido.getQuantidadeComprada());
		stm.setInt(3, produto.getId());
		stm.setLong(4, pedido.getId());
		stm.setDouble(5, itemPedido.getDesconto());
		stm.setString(6,  String.valueOf(itemPedido.getTipoDesconto()));
		stm.setLong(7, itemPedido.getId());
		
		stm.execute();
		
		con.close();
	}
	
	public static void removeItemPedido(Integer id) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		String insertSql = "DELETE FROM comex.ITEM_PEDIDO where id = ?";
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setInt(1, id);
		con.close();
	}
}