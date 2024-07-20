package loginAppUsingRequestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// sendRedirect method invokes doGet method
		//protected void doGe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		String em = req.getParameter("email");
		
		PrintWriter pw = resp.getWriter();
		pw.println(em);
		pw.println("Welcome to Home page");
		
		
	}
}
