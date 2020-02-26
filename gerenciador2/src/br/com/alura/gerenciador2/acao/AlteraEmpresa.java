package br.com.alura.gerenciador2.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador2.modelo.Banco;
import br.com.alura.gerenciador2.modelo.Empresa;

public class AlteraEmpresa implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			System.out.println("Alterando Empresa");
			
			String nomeEmpresa = request.getParameter("nome");
			String paramDataEmpresa = request.getParameter("data");
			String paramIdEmpresa = request.getParameter("id");
			
			Integer id = Integer.valueOf(paramIdEmpresa);
			
			Date dataAbertura = null;
			
			try {
				//classe q faz o parse na data 'String >> Date' || já eh definido o pattern de formato da data
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				dataAbertura = sdf.parse(paramDataEmpresa);
			} catch (ParseException e) {
				throw new ServletException(e);
			}
			
			System.out.println(id);
			
			Banco banco = new Banco();
			Empresa empresa = banco.buscaEmpresaPeloId(id);
			empresa.setNome(nomeEmpresa);
			empresa.setDataAbertura(dataAbertura);
			
			return "redirect:entrada?acao=ListaEmpresas";
		}

}
