<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
	<body>
		<c:import url="Logout-parcial.jsp"/>
	<br>
	<br>
	<br>
		<!--out.println(nomeEmpresa) >> = numeEmpresa -->
		<!-- Empresa <%//=nomeEmpresa%> cadastrada com Sucesso! -->
		
		<c:if test="${not empty empresa}">		
			Empresa ${empresa} cadastrada com sucesso!
		</c:if>
		
		<c:if test="${empty empresa}">		
			Nenhuma Empresa cadastrada!
		</c:if>
	</body>
</html>"