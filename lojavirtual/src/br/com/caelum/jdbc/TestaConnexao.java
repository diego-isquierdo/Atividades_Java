package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConnexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPool().getConnection();
		System.out.println("Abrindo uma conexao");
		connection.close();
	}
}
