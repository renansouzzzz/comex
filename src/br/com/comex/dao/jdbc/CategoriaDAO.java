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

public class CategoriaDAO {
	
	private Connection connection;
	
	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void insereCategoria(Categoria categoria) throws SQLException {
		
		String insertSql = "INSERT INTO comex.CATEGORIA(nome, status) VALUES"
				+ " (?, ?)";
		
		PreparedStatement stm = connection.prepareStatement(insertSql);
		
		
		stm.setString(1, categoria.getNome());
		stm.setString(2, categoria.getSts());
		
		stm.execute();
	}
	
	public List<Categoria> listagemCategoria() throws SQLException {
		
		String sqlInsert = "SELECT * FROM comex.CATEGORIA";
		PreparedStatement stm = connection.prepareStatement(sqlInsert);
		List<Categoria>  categorias = new ArrayList<>();
	
		stm.execute();
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer id = result.getInt("id");
			String nome = result.getString("nome");
			String status = result.getString("status");
			
			categorias.add(new Categoria(id, nome, status));
			
			System.out.println(categorias);
		}
		
		return categorias;
	}
	
	public void atualizaCategoria(Categoria categoria) throws SQLException {
		
		String insertSql = "UPDATE comex.CATEGORIA SET nome = ?, status = ? WHERE id = ?";
		
		PreparedStatement stm = connection.prepareStatement(insertSql);
		
		stm.setString(1, categoria.getNome());
		stm.setString(2, categoria.getSts());
		stm.setInt(3, categoria.getId());

		stm.execute();
		
		connection.close();
	}
	
	public void removeCategoria(Integer id) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.iniciaConexao();
		String insertSql = "DELETE FROM comex.CATEGORIA where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setInt(1, id);
		con.close();
	}
}