package br.com.comex.command;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.models.Cliente;
import br.com.comex.models.Pedido;

public class Transacao {

	private Connection connect;

	public Transacao(Connection connect, Pedido pedido, Cliente cliente)
			throws SQLException {
		
		this.connect = connect;
		connect.setAutoCommit(false);

		String insertSql = "INSERT INTO comex.PEDIDO(data, cliente_id)" + " VALUES (?, ?)";

		try (PreparedStatement stm = connect.prepareStatement(insertSql)) {

			stm.setString(1, pedido.getData());
			stm.setLong(2, cliente.getId());
			stm.execute();
			
			connect.commit();
			
			System.out.println("Processo realizado com sucesso, commit feito!");
		}
		
		catch (SQLException e) {
			connect.rollback();
			throw e;
		}
	}
}
