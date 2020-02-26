package br.com.caelum.modelo;

public class Produto {
	
	public Produto(String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	private Integer id;
	private String nome;
	private String descricao;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
	@Override	//metodo imprime iformações quando syso no produto
	public String toString() {
		return String.format("[produto: %d %s %s]", id, nome, descricao);
	}
	
}
