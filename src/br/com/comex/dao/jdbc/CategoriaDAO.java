package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.models.Categoria;
import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.Produto;

public class CategoriaDAO {
	
	public static void insereCategoria(Categoria categoria) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		List<Categoria> categorias = new ArrayList<>();
		
		String insertSql = "INSERT INTO comex.CATEGORIA(nome, status) VALUES"
				+ " (?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		categorias.add(categoria);
		
		stm.setString(1, categoria.getNome());
		stm.setString(2, categoria.getSts());
		stm.setInt(3, categoria.getId());
		
		stm.execute();
		
		con.close();
		
	}
	
	public static List<Categoria> listagemCategoria() throws SQLException {
		
		List<Categoria>  categorias = new ArrayList<>();
		ConnectionFactory conectorFac = new ConnectionFactory();
		Connection con = conectorFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("SELECT * FROM comex.CATEGORIA");
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			String nome = result.getString("nome");
			String status = result.getString("status");
			
			categorias.add(new Categoria(nome, status));
			
			System.out.println(categorias);
		}
		
		con.close();
		return listagemCategoria();
	}
	
	public static void atualizaCategoria(Categoria categoria) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.CATEGORIA SET nome = ?, status = ? WHERE id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, categoria.getNome());
		stm.setString(2, categoria.getSts());

		
		stm.execute();
		
		con.close();
	}
	
	public static void removeCategoria(Integer id) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		String insertSql = "DELETE FROM comex.CATEGORIA where id = ?";
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setInt(1, id);
		con.close();
	}
}