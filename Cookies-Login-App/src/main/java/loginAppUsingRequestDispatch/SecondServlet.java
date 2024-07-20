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

@WebServlet("/profile")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// sendRedirect method invokes doGet method
		//protected void doGe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie[] ck = req.getCookies();
		if(ck == null) {
			
			resp.sendRedirect("index.html");
		}else {
			
			resp.setContentType("text/html");
			
			PrintWriter pw = resp.getWriter();
			
			pw.print("<h2>[ Email ]- " + ck[0].getValue() + "[ password ]-" + ck[1].getValue() + "</h2>" );
			
			pw.println("<a href='logout'> Logout<a>" );
		}
		
	}
}
