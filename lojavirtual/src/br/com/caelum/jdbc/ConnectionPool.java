package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;



/**
 * Problemas com o numero de requisi��es podem ocorrer
 * 
 * criado um 'pool' de conex�es para operar com um range de conex�es e n�o sobrecarregar o banco
 * 
 * alterado o construtor da classe "Database" para garantir a cria��o desse 'pool'
 * */

public class ConnectionPool {
	
	//private JDBCPool dataSource;
	private DataSource dataSource; //utilizado a interface por causa do metodo getConnection
	
	ConnectionPool(){
		//classe especifica para criar o pool de conex�es
		JDBCPool pool = new JDBCPool();
		pool.setUrl("jdbc:hsqldb:hsql://localhost/lojavirtual");
		pool.setUser("SA");
		pool.setPassword("");
		this.dataSource = pool;
		//dataSource.getConnection();
	}
	
	Connection getConnection() throws SQLException {
//		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/lojavirtual", "SA", "");
//		conexao j� criada durante a inicializa��o do objeto
		Connection connection = dataSource.getConnection();
		return connection;
	}
}
