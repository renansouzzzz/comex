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

public class ClienteDAO {
	
	private Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void insereCliente(Cliente cliente) throws SQLException {
		
		String insertSql = "INSERT INTO comex.CLIENTE(nome, cpf, telefone, rua, numero,"
				+ " complemento, bairro, cidade, uf) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stm = connection.prepareStatement(insertSql);
		
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
		
		connection.close();
		
	}
	
	public List<Cliente> listagemCliente() throws SQLException {
		
		String sqlInsert = "SELECT * FROM comex.CLIENTE";
		PreparedStatement stm = connection.prepareStatement(sqlInsert);
		List<Cliente> clientes = new ArrayList<>();
		
		stm.execute();
		
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
		
		return clientes;
	}
	 
	public void atualizaCliente(Cliente cliente) throws SQLException {
		
		String insertSql = "UPDATE comex.CLIENTE SET nome = ?, cpf = ?, telefone = ?, "
				+ "rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?  where id = ?";
		
		PreparedStatement stm = connection.prepareStatement(insertSql);
		
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
		
		connection.close();
	}
	
	public void removeCliente(Integer id) throws SQLException {
		
		String insertSql = "DELETE FROM comex.CLIENTE where id = ?";
		PreparedStatement stm = connection.prepareStatement(insertSql);
		
		stm.setInt(1, id);
	}
}