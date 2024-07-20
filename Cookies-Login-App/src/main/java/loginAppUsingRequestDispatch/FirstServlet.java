package loginAppUsingRequestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		Cookie coo1 = new Cookie("email", email);
		Cookie coo2 = new Cookie("password", password);
		
		resp.addCookie(coo1);
		resp.addCookie(coo2);
		
		resp.sendRedirect("profile");
	
	}
}
