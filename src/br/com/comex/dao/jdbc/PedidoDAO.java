package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.models.Cliente;
import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.Pedido;

public class PedidoDAO {
	
	public static void inserePedido(Pedido pedido, Cliente cliente) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		
		String insertSql = "INSERT INTO comex.PEDIDO(data, cliente_id)"
				+ " VALUES (?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		//stm.setLong(1, pedido.getId());
		stm.setString(1, pedido.getData());
		stm.setLong(2, cliente.getId());
		
		stm.execute();
		
		con.close();
		
	}
	
	public static List<Pedido> listagemPedido() throws SQLException {
		
		List<Pedido> pedidos = new ArrayList<>();
		ConnectionFactory conectorFac = new ConnectionFactory();
		Connection con = conectorFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("SELECT * FROM comex.PEDIDO");
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer id = result.getInt("id");
			String data = result.getString("data");
			Cliente cliente_id = (Cliente) result.getObject("cliente_id");
			
			pedidos.add(new Pedido(id ,data, cliente_id));
			
			System.out.println(pedidos);
		}
		
		con.close();
		return listagemPedido();
	}
	 
	public static void atualizaCliente(Pedido pedido, Cliente cliente) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.PEDIDO SET data = ?, cliente_id = ? where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, pedido.getData());
		stm.setLong(2, cliente.getId());
		stm.setLong(3, pedido.getId());
		
		stm.execute();
		
		con.close();
	}
	
	public static void removePedido(Integer id) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		String insertSql = "DELETE FROM comex.PEDIDO where id = ?";
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setInt(1, id);
		con.close();
	}
}