package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFac = new ConnectionFactory();
		Connection con = conFac.IniciaConexao();
		
		System.out.println("Conexão efetuada com sucesso!");
		
		con.close();
		System.out.println("Conexão finalizada com sucesso!");

		
	}

}
