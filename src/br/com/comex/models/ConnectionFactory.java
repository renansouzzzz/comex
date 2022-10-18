package br.com.comex.models;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
	
		public DataSource dataSource;
		
		public ConnectionFactory() {
			ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1522:xe");
			comboPooledDataSource.setUser("system");
			comboPooledDataSource.setPassword("admin");
			
			this.dataSource = comboPooledDataSource;
		}
	
		public Connection IniciaConexao() throws SQLException{
			
		return this.dataSource.getConnection();
		}	
}
