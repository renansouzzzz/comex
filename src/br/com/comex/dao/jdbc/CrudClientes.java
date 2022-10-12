package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudClientes {
	
	public static void insereCliente(String nome, String cpf, String telefone, String rua,
			String numero, String complemento, String bairro, String cidade, String uf) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		
		String insertSql = "INSERT INTO comex.CLIENTE(nome, cpf, telefone, rua, numero,"
				+ " complemento, bairro, cidade, uf) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, nome);
		stm.setString(2, cpf);
		stm.setString(3, telefone);
		stm.setString(4, rua);
		stm.setString(5, numero);
		stm.setString(6, complemento);
		stm.setString(7, bairro);
		stm.setString(8, cidade);
		stm.setString(9, uf);
		
		stm.execute();
		
		con.close();
		
	}
	
	public static String listagemCliente() throws SQLException {
		
		ConnectionFactory conectorFac = new ConnectionFactory();
		Connection con = conectorFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("SELECT * FROM comex.CLIENTE");
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer id = result.getInt("id");
			String nome = result.getString("nome");
			String cpf = result.getString("cpf");
			String telefone = result.getString("telefone");
			String rua = result.getString("rua");
			String numero = result.getString("numero");
			String complemento = result.getString("complemento");
			String bairro = result.getString("bairro");
			String cidade = result.getString("cidade");
			String uf = result.getString("uf");
			
			 System.out.println("Id: " + id + "\n"
						+ "Nome: " + nome + "\n"
						+ "CPF: " + cpf + "\n"
						+ "Telefone: " + telefone + "\n"
						+ "Rua: " + rua + "\n"
						+ "Numero Endereço: " + numero + "\n"
						+ "Complemento: " + complemento + "\n"
						+ "Bairro: " + bairro + "\n"
						+ "Cidade: " + cidade + "\n"
						+ "UF: " + uf + "\n\n");   
		}
		
		con.close();
		return "ok";
	}
	 
	public static void atualizaCliente(Integer id, String nome, String cpf, String telefone, String rua,
			String numero, String complemento, String bairro, String cidade, String uf) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.CLIENTE SET nome = ?, cpf = ?, telefone = ?, "
				+ "rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?  where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, nome);
		stm.setString(2, cpf);
		stm.setString(3, telefone);
		stm.setString(4, rua);
		stm.setString(5, numero);
		stm.setString(6, complemento);
		stm.setString(7, bairro);
		stm.setString(8, cidade);
		stm.setString(9, uf);
		stm.setInt(10, id);
		
		stm.execute();
		
		con.close();
	}
	
	public static void removeCliente(Integer id) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		String insertSql = "DELETE FROM comex.CLIENTE where id = ?";
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setInt(1, id);
		con.close();
	}
}