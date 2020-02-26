package br.com.caelum.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private final String nome;
	private final Integer id;
	private final List<Produto> produtos = new ArrayList<>();

	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void adiciona(Produto p) {
		produtos.add(p);		
	}

}
