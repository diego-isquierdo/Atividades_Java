package br.com.alura.gerenciador2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador2.acao.Acao;
import br.com.alura.gerenciador2.acao.ListaEmpresas;

/**
 * Servlet implementation class UnicaEntradaServlet
 */

//ATUALIZADO!! >> SUBSTITUIDO PELO FILER >> ControladorFilter

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		
//		cod migrou para o 'filtro'.. 
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado")==null);
//		boolean ehUmaAcaoProtegida =!(paramAcao.equals("Login")||paramAcao.equals("LoginForm"));
//		
//		if(usuarioNaoEstaLogado && ehUmaAcaoProtegida) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;
//		}
		
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
		
		//metodo antigo, substituido pela interface 'Acao'
//		String nome = null;
//		if(paramAcao.equals("ListaEmpresas")) {
//			ListaEmpresas acao  = new ListaEmpresas();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("RemoveEmpresa")) {
//			RemoveEmpresa acao  = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("MostraEmpresa")) {
//			MostraEmpresas acao  = new MostraEmpresas();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("AlteraEmpresa")) {
//			AlteraEmpresa acao  = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("NovaEmpresa")) {
//			NovaEmpresa acao  = new NovaEmpresa();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("NovaEmpresaForm")) {
//			NovaEmpresaForm acao  = new NovaEmpresaForm();
//			nome = acao.executa(request, response);
//		}
	}

}
