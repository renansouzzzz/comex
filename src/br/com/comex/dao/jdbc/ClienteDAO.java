package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.models.Cliente;

public class ClienteDAO {
	
	public static void insereCliente(Cliente cliente) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		
		String insertSql = "INSERT INTO comex.CLIENTE(nome, cpf, telefone, rua, numero,"
				+ " complemento, bairro, cidade, uf) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, cliente.getNome());
		stm.setString(2, cliente.getCpf());
		stm.setString(3, cliente.getTelefone());
		stm.setString(4, cliente.getRua());
		stm.setString(5, cliente.getNumeroEnd());
		stm.setString(6, cliente.getComplemento());
		stm.setString(7, cliente.getBairro());
		stm.setString(8, cliente.getCidade());
		stm.setObject(9, cliente.getEstado());
		
		stm.execute();
		
		con.close();
		
	}
	
	public static List<Cliente> listagemCliente() throws SQLException {
		
		List<Cliente> clientes = new ArrayList<>();
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
			
			clientes.add(new Cliente(id, nome, cpf, telefone, rua,
					numero, complemento, bairro, cidade, uf));
			
			System.out.println(clientes);
		}
		
		con.close();
		return listagemCliente();
	}
	 
	public static void atualizaCliente(Cliente cliente) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		
		String insertSql = "UPDATE comex.CLIENTE SET nome = ?, cpf = ?, telefone = ?, "
				+ "rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?  where id = ?";
		
		PreparedStatement stm = con.prepareStatement(insertSql);
		
		stm.setString(1, cliente.getNome());
		stm.setString(2, cliente.getCpf());
		stm.setString(3, cliente.getTelefone());
		stm.setString(4, cliente.getRua());
		stm.setString(5, cliente.getNumeroEnd());
		stm.setString(6, cliente.getComplemento());
		stm.setString(7, cliente.getBairro());
		stm.setString(8, cliente.getCidade());
		stm.setString(9, cliente.getEstados());
		stm.setLong(10, cliente.getId());
		
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