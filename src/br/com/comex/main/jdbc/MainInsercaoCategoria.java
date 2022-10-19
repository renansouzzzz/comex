package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.dao.jdbc.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory testaCon = new ConnectionFactory();
		Connection con = testaCon.iniciaConexao();
		
		Statement stm = con.createStatement();
		
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('INFORMÁTICA', 'ATIVA')");
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('MÓVEIS', 'INATIVA')");
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('LIVROS', 'ATIVA')");
		
		System.out.println("Operação executada com sucesso!");
		con.close();
		
	}

}
