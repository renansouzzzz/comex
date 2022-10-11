package br.com.comex.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
		public Connection IniciaConexao() throws SQLException{
			
		return DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "admin");
		}	
}
