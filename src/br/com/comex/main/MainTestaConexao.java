package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTestaConexao {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "admin");
		System.out.println("Conexão iniciada com êxito!");
		
		
		con.close();
		System.out.println("Conexão finalizada com êxito!");
	}
	
}
