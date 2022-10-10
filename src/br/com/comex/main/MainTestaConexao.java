package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTestaConexao {
	
		public Connection TestaConexao() throws SQLException{
			
		return DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "admin");
		}	
}
