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

public class ProdutoDAO {
	
	public static void insereProduto(Produto produto, String tipo) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		List<Produto> produtos = new ArrayList<>();
		
		String insertSql = "INSERT INTO comex.PRODUTO(nome, descricao, preco_unitario, quantidade_estoque, categoria_id,"
				+ " tipo) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		produtos.add(produto);
		
		stm.setString(1, produto.getNome());
		stm.setString(2, produto.getDescricao());
		stm.setDouble(3, produto.getPrecoUni());
		stm.setInt(4, produto.getQuantidadeEst());
		stm.setInt(5, produto.getCategoriaProd());
		stm.setString(6, produto.getTipo());
		
		stm.execute();
		
		con.close();
		
	}
	
	public static List<Produto> listagemProduto() throws SQLException {
		
		List<Produto> produtos = new ArrayList<>();
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
			int categoria_id = result.getInt("categoria_id");
			String tipo = result.getString("tipo");
			
			produtos.add(new Produto(nome, descricao,
					preco_unitario, quantidade_estoque, categoria_id, id, tipo));
			
			System.out.println(produtos);
		}
		
		con.close();
		return produtos;
	}
	
	public static void atualizaProduto(Produto produto, Categoria categoria) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.PRODUTO SET nome = ?, descricao = ?, preco_unitario = ?, "
				+ "quantidade_estoque = ?, categoria_id = ?, tipo = ?  where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, produto.getNome());
		stm.setString(2, produto.getDescricao());
		stm.setDouble(3, produto.getPrecoUni());
		stm.setInt(4, produto.getQuantidadeEst());
		stm.setInt(5, categoria.getId());
		stm.setString(6, produto.getTipo());
		stm.setInt(7, produto.getId());
		
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