package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.IniciaConexao();
		
		Statement stm = con.createStatement();
		
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('INFORMÁTICA', 'ATIVA')");
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('MÓVEIS', 'INATIVA')");
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('LIVROS', 'ATIVA')");
		
		System.out.println("Operação executada com sucesso!");
		con.close();
		
	}

}
