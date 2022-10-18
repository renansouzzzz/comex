package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.models.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conectorFac = new ConnectionFactory();
		Connection con = conectorFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("SELECT * FROM comex.CATEGORIA");
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer id = result.getInt("id");
			String nome = result.getString("nome");
			String status = result.getString("status");
			
			System.out.println("Id: " + id + "\n"
							+ "Nome: " + nome + "\n"
							+ "Status: " + status + "\n");
		}
	}
}
