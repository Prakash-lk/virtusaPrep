<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("Login.jsp");
		}
	%>
	<%@ page import="java.sql.*"%>
	<%
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakash", "root", "Thanks@Prakash1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Country</th>
			</tr>
		</thead>
		<tbody>
			<%
				while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt("id")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("email")%></td>
				<td><%=rs.getString("country")%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<%
		rs.close();
		stmt.close();
		con.close();
	%>
	<a href="Home.jsp">Home</a>
</body>
</html>