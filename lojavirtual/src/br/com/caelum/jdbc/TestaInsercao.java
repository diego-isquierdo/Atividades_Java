package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionPool().getConnection()){
		//Statement statement = connection.createStatement();
		
		//desbilita o commit automatico nas transações c o BD
		connection.setAutoCommit(false);
		
		//String sql = "insert into produto(nome, descricao) values('Notebook', 'Notebook i5')";
		String sql = "insert into produto(nome, descricao) values(?, ?)";
		
		//o 'try|catch' faz com q o commit seja realiza apenas se as 2 transações deram 'OK'
		try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
						
			//problemas com o uso de ' ou de sql injection podem ocorre
			//utlizado o preparedStatement																				a solicitação da PK já eh feita aqui 
			
			//no 'sql' em (?, ?), posicionar as Strings nas posições obde '1' eh a primeira
			//ATUALIZADO - metodo adiciona()
//			statement.setString(1, nome);
//			statement.setString(2, descricao);
			//o tratamento dos ' eh feito automatico e evita a injeção de sql 
			
				
			//comando de insert de produto >> no final, 	Statement.RETURN_GENERATED_KEYS retorna o id PK
			//boolean resultado = statement.execute(sql, Statement.RETURN_GENERATED_KEYS );
			//após os tratamentos, o método execute() pode ser chamado sem a passagem de valores
			//ATUALIZADO - metodo adiciona()
			//boolean resultado = statement.execute();
			
			
			//imprimir o resultado dos ids recuprados
			adiciona("TV LCD", "32 polegadas", statement);
			//caso haja problema na próxima transação, a as anteriores já foram 'commitadas'
			adiciona("Blueray", "HDMI", statement);
			connection.commit(); //faz o commit das transações até aqui
			
			statement.close();
		} catch(Exception ex) {
			ex.printStackTrace();
			connection.rollback();//volta a conexao e não efetua a transação
			System.out.println("Rollback efetuado");
		}
		
		
		//ATUALIZADO - metodo adiciona()
//		while(resultset.next()) {
//			String id = resultset.getString("id");
//			System.out.println(id + " gerado");
//		}
			
			//connection.close(); >> com o try a conexao eh fechada acontecendo ou não
		}
	}

	private static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {
        if (nome.equals("Blueray")) {
            throw new IllegalArgumentException("Problema ocorrido");
        }
		
		statement.setString(1, nome);
		statement.setString(2, descricao);
		
		boolean resultado = statement.execute();
		System.out.println(resultado);
		
		ResultSet resultset = statement.getGeneratedKeys();
		while(resultset.next()) {
			String id = resultset.getString("id");
			System.out.println(id + " gerado");
		}
	}
}
