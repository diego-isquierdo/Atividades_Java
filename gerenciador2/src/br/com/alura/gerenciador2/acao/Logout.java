package br.com.alura.gerenciador2.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		//sessao.removeAttribute("usuarioLogado");
		
		sessao.invalidate();//não apenas remove os atributos como destrui o coockie da sessão - Invalida a sessão
		
		return "redirect:entrada?acao=LoginForm";
	}

}
