package br.com.comex.command;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.models.ConnectionFactory;


public class Transacao {

	private List<Command> linhasComandos;
	
	public Transacao(List<Command> linhasComandos) {
		this.linhasComandos = linhasComandos;
	}
	
	private void executaComandos() throws Exception {
		
		Connection connect = new ConnectionFactory().iniciaConexao();
		

		try {
			connect.setAutoCommit(false);
			
			for (Command command : linhasComandos) {
				command.execute();
			}
		}
		
		catch (SQLException e) {
			connect.rollback();
			throw e;
		}
		finally {
			connect.close();
		}
	}	
}



