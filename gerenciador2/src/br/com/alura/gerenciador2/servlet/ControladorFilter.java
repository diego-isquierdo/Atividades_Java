package br.com.alura.gerenciador2.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador2.acao.Acao;

//o urlPatern do filter /"entrada" permanece o mesmo do controlador
//@WebFilter("/entrada") >> alterado config de acesso via web.xml
public class ControladorFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException { }
	
	@Override
	public void destroy() { }
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		System.out.println("ControladorFilter");
		
		//realizado um 'cast', pois a Classe ServletRequest é mais genérica q a Classe HttpServletRequest
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		String nomeDaClasse = "br.com.alura.gerenciador2.acao." + paramAcao;
		String nome;
		
		try {
			//Classe 'Class' eh utilizada para carregar o nome (String) de uma classe 
			Class classe;
			classe = Class.forName(nomeDaClasse);
			//newInstace instancia o objeto
			Acao acao = (Acao)classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		
		String [] tipoEndEndereco = nome.split(":");
		if(tipoEndEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEndEndereco[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEndEndereco[1]);
		}
		
	}
}
