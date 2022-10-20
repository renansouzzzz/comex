package br.com.comex.models;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
	
		public DataSource dataSource;
		
		public ConnectionFactory() {
			
			try {
				ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
				comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1522:xe");
				comboPooledDataSource.setUser("system");
				comboPooledDataSource.setPassword("admin");
			
			this.dataSource = comboPooledDataSource;
			
			} 
			catch (Exception e) {
				System.err.println("Conexão não estabelecida!");
			}
		}
	
		public Connection iniciaConexao() {
			try {
				return this.dataSource.getConnection();
			}
			catch (Exception e) {
				System.err.println("Conexão não estabelecida!");
				}
			return null;
		
		}	
}
