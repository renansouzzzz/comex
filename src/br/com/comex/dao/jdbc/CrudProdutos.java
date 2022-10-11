package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.main.jdbc.ConnectionFactory;

public class CrudProdutos {
	
	public static void insereProduto(String nome, String descricao, double preco_unitario, int quantidade_estoque,
			int categoria_id, String tipo) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		
		String insertSql = "INSERT INTO comex.PRODUTO(nome, descricao, preco_unitario, quantidade_estoque, categoria_id,"
				+ " tipo) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setDouble(3, preco_unitario);
		stm.setInt(4, quantidade_estoque);
		stm.setInt(5, categoria_id);
		stm.setString(6, tipo);
		
		stm.execute();
		
		con.close();
		
	}
	
	public static String listagemProduto() throws SQLException {
		
		ConnectionFactory conectorFac = new ConnectionFactory();
		Connection con = conectorFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("SELECT * FROM comex.PRODUTO");
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer id = result.getInt("id");
			String nome = result.getString("nome");
			String descricao = result.getString("descricao");
			Integer preco_unitario = result.getInt("preco_unitario");
			Integer quantidade_estoque = result.getInt("quantidade_estoque");
			String categoria_id = result.getString("categoria_id");
			String tipo = result.getString("tipo");
			
			 System.out.println("Id: " + id + "\n"
						+ "Nome: " + nome + "\n"
						+ "Descrição: " + descricao + "\n"
						+ "Preço unitário: " + preco_unitario + "\n"
						+ "Quantidade estoque: " + quantidade_estoque + "\n"
						+ "Categoria Id: " + categoria_id + "\n"
						+ "Tipo: " + tipo + "\n\n");   
		}
		con.close();
		return "ok";
	}
	
	public static void atualizaProduto(int id, String nome, String descricao, double preco_unitario, int quantidade_estoque,
			int categoria_id, String tipo) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.PRODUTO SET nome = ?, descricao = ?, preco_unitario = ?, "
				+ "quantidade_estoque = ?, categoria_id = ?, tipo = ?  where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setDouble(3, preco_unitario);
		stm.setInt(4, quantidade_estoque);
		stm.setInt(5, categoria_id);
		stm.setString(6, tipo);
		stm.setInt(7, id);
		
		stm.execute();
		
		con.close();
	}
	
	public static void removeProduto(Integer id) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		String insertSql = "DELETE FROM comex.PRODUTO where id = ?";
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setInt(1, id);
		con.close();
	}
}