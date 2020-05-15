<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Listo</title>
</head>
<style type="text/css">
h1{ color: white; }
h2{color: blue;}
h6{color: #781e7e;}
p,li,input,blockquote { color: #ABABAA}
p,li,input,blockquote{font-size: 350%}
table,th,td{color: #6c757a;
border: 1px double white;}
</style>
<%

HttpSession s = (HttpSession) request.getSession();
String usuario = (String)s.getAttribute("usuario");
if(usuario==null){
response.sendRedirect("index.jsp");
}
%>
<body background="images.jpg">
<form   align="center" action="ControladorRegistros" method="get">
<table align="center">
	<thead>
		
	</thead>
	<%
	String idBus= request.getParameter("idBus");
	String nombre= request.getParameter("No");
	String apellido= request.getParameter("A");
	
	if(idBus==null){
		idBus="";
		nombre=" ";
		apellido=" ";
		
		
	}
	%>
	<tbody>
		<tr>
			<td>
				
<p>id</p><input type="text" name="Id" id="idcarga" value="<%=idBus%>">
<p>nombre</p><input type="text" name="Nombre"id="Nocarga" value="<%=nombre%>">
					<p>apellido</p><input type="text" name="Apellido"id="Acarga" value="<%=apellido%>">
					
				<br>
				<br>
			</td>
		</tr> 
	</tbody>
</table>

<input  type ="submit" class="btn btn-warning" value="Guardar Nuevo Registro" name="btn">	
<input  type ="submit" class="btn btn-success" value="Guardar Actualizar"name="btn">	
<a href="vista.jsp" class="btn btn-dark">Volver</a>
</form>
</body>
</html>