package br.com.alura.gerenciador2.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador2.modelo.Banco;
import br.com.alura.gerenciador2.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			System.out.println("Logando: " + login);
			
			Banco banco = new Banco();
			Usuario usuario = banco.existeUsuario(login,senha);
		
			if(usuario != null) {
				System.out.println("Usuario Existe");
				HttpSession sessao = request.getSession();
				//sessao >> coockie - ao invés de pindurar o atributo na 'request' pindura-se na 'sessao' (coockie)
				sessao.setAttribute("usuarioLogado", usuario);
				
			}else {
				return "redirect:entrada?acao=LoginForm";
			}
			
			return "redirect:entrada?acao=ListaEmpresas";
		}

}
