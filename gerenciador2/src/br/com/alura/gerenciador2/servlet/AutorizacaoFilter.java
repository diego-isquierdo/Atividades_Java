package br.com.alura.gerenciador2.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//o urlPatern do filter /"entrada" permanece o mesmo do controlador
//@WebFilter("/entrada") >> alterado config de acesso via web.xml
public class AutorizacaoFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException { }
	
	@Override
	public void destroy() { }
		
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		System.out.println("AutorizacaoFilter");
		
		//realizado um 'cast', pois a Classe ServletRequest � mais gen�rica q a Classe HttpServletRequest
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado")==null);
		boolean ehUmaAcaoProtegida =!(paramAcao.equals("Login")||paramAcao.equals("LoginForm"));
		
		if(usuarioNaoEstaLogado && ehUmaAcaoProtegida) {
			response.sendRedirect("entrada?acao=LoginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}
}
