package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.models.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("DELETE FROM comex.CATEGORIA where status = 'INATIVA'");
		System.out.println("Linha excluída com sucesso!");
	}

}
