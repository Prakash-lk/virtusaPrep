<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<%
	if(session.getAttribute("username") == null){
		response.sendRedirect("Login.jsp");
	}
%>

<form action="Append" method="get">
	Username : <input type="text" name="uname"/><br><br>
	Email ID : <input type="text" name="email"/><br><br>
	Country : <input type="text" name="country"/><br><br>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>