package br.com.comex.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.models.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conecFac = new ConnectionFactory();
		Connection con = conecFac.IniciaConexao();
		Statement stm = con.createStatement();
		
		stm.execute("UPDATE comex.CATEGORIA SET nome = 'LIVROS TÉCNICOS' WHERE id = 3");
		System.out.println("Valor atualizado com sucesso! \n");
	}
}
