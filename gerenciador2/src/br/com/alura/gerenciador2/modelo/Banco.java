package br.com.alura.gerenciador2.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<>(); //atributo da classe (n�o do objeto)
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	//bloco est�tico
	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++); //set id com a chaveSequencial e ap�s, add 1 >> ++
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Google");
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("nico");
		u1.setSenha("123456");
		Usuario u2 = new Usuario();
		u2.setLogin("Diego");
		u2.setSenha("123456");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	public void adiciona(Empresa empresa) {
				lista.add(empresa);
				empresa.setId(Banco.chaveSequencial++);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;  //usar a classe Banco, pois 'lista' eh atributo est�tico;
	}

	public void removeEmpresa(Integer id) {
		
		//Iterator eh velho mas resolve o problema de remover item da lista durantee a itera��o
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId()==id) {
				it.remove();
			}
		}
		
//		este for gera erro, pois precisamos remover item durante a itera��o - Do contr�rio seria o ideal		
//		for (Empresa empresa : lista) {
//			if(empresa.getId()==id) {
//				lista.remove(empresa);
//			}
//		}		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa:lista) {
			if(empresa.getId()==id){
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario:listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		
		return null;
	}

}
