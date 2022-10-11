package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.jdbc.ConnectionFactory;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFac = new ConnectionFactory();
		Connection con = conFac.IniciaConexao();
		
		System.out.println("Conexão efetuada com sucesso!");
		
		con.close();
		System.out.println("Conexão finalizada com sucesso!");

		
	}

}
