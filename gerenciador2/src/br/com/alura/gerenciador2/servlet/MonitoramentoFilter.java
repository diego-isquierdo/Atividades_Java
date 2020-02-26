package br.com.alura.gerenciador2.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//o urlPatern do filter /"entrada" permanece o mesmo do controlador
//@WebFilter("/entrada") >> alterado config de acesso via web.xml
public class MonitoramentoFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException { }
	
	@Override
	public void destroy() { }
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
		System.out.println("MonitoramentoFilter");
		
		String acao = request.getParameter("acao");
		
		//calculando o tempo de execução do código
		long antes = System.currentTimeMillis();
		
		//executa a acao
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da ação: " +"\""+ acao + "\"" + " => " + (depois - antes));
	}

}
