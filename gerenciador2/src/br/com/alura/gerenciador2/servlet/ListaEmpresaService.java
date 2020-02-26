package br.com.alura.gerenciador2.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador2.modelo.Banco;
import br.com.alura.gerenciador2.modelo.Empresa;


//Servlet destinado apenas a retornar JSON/XML || Não passa pelo controlador
@WebServlet("/empresas")
public class ListaEmpresaService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		
		//efetua aleitura do Header p saber se eh JSON ou XML
		String valor = request.getHeader("Accept");
		
		System.out.println(valor);
		
		//.endsWith > verifica se a String termina com "xml"
		if(valor.endsWith("xml")) {
//			DEVOLVENDO XML >> IMPORTAR 'xmlpull-1.1.3.1.jar' e 'xstream-1.4.10.jar'
			XStream xstream = new XStream();
			xstream.alias("empresa", Empresa.class);
			String xml = xstream.toXML(empresas);
			
			response.setContentType("aplication/xml");
			response.getWriter().print(xml);
		}else if(valor.endsWith("json")) {
			//DEVOLVENDO JSON >> IMPORTAR gson-2.8.5.jar
			Gson gson = new Gson();
			String json = gson.toJson(empresas);
			
			response.setContentType("aplication/jason");
			response.getWriter().print(json);
		}else {
			response.setContentType("aplication/jason");
			response.getWriter().print("{'mensagem':'Deu ruim'}");
		}
		
	}

}
