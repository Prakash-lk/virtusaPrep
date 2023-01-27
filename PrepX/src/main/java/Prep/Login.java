package Prep;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname"),upass=request.getParameter("upass");
		
		if(uname.equals("abc") && upass.equals("123")){
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("Home.jsp");
		}else{
			response.sendRedirect("Login.jsp");
		}
	}

}