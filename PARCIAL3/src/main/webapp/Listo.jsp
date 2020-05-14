<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRINCIPAL</title>
   <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
   


</head>
<body>
<from action="ControladorRegistros">
<input type="hidden" name="id" >
<a href="index.jsp"class="btn btn-info">Iniciar Seccion</a>
<input type="submit" value="mostrar" name="btn" id="cargar">
</from>
<table class="table table-dark" id="tablaDatos">
<thead>
<th>Apellido</th>
<th>Nombre</th>	
<th>Id</th>
<tbody>


	</tbody>
</table>
</body>
</html>