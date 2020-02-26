package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.dao.ProdutosDAO;
import br.com.caelum.modelo.Categoria;
import br.com.caelum.modelo.Produto;

public class TestaCategorias {
	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPool().getConnection()){
			List<Categoria> categorias = new CategoriasDAO(con).listaComProdutos();
			for (Categoria c : categorias) {
				System.out.println(c.getNome());
				
				for(Produto p : c.getProdutos()) {
					System.out.println(c.getNome() + " > " + p.getNome());
				}
			}
		}
	}
}
