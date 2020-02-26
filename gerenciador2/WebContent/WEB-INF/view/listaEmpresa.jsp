<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.alura.gerenciador2.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standart TagLib</title>
</head>
<body>
	<!-- Utilizado biblioteca jstl-1.2.jar -->
	<!-- <a href="entrada?acao=Logout">Sair</a> codigo atualizado -->
	
	<!-- func core que redireciona para um codigo de outra pag -->
	<c:import url="logout-parcial.jsp"/>
	<br>

	Usuario Logado: ${usuarioLogado.login}
	
	<br>
	<br>
	<br>
	
	Lista Empresas:
	<ul>
		<c:forEach items="${empresas}" var="empresa"> <!-- forEach apontado pela lib core|c: // ${empresas} acessa o request.getAtribute() -->
			<li><!--  acessa - empresa.getNome() -->
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> 
				<a href="/gerenciador2/entrada?acao=MostraEmpresas&id=${empresa.id}">Edita</a>
				<a href="/gerenciador2/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remove</a>
			</li>  
		</c:forEach>
	</ul>

</body>
</html>