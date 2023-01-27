package Prep;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Append")
public class Append extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakash","root","Thanks@Prakash1");  
			Statement stmt=con.createStatement();  
			String name=request.getParameter("uname"),email=request.getParameter("email"),country=request.getParameter("country");
			String sql = "insert into users (name,email,country)"+ " values (?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(sql);
			preparedStmt.setString (1, name);
			preparedStmt.setString (2, email); 
			preparedStmt.setString (3, country); 
			preparedStmt.execute();
			response.sendRedirect("Home.jsp");
			con.close();  
			}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}
}
