package loginAppUsingRequestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String name = req.getParameter("email");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd;
		
		if ("demo@gmail.com".equals(name) && "demo".equals(password)) {
			
	// go to Home page using html 
			rd = req.getRequestDispatcher("/home.html");
			
	// go to anothers servlet 
			//rd = req.getRequestDispatcher("/servlet2");
			
	// forward allows servlet2 to access the response data
			rd.forward(req, resp);
			
	//sendRedirect is method of HttpServletRequest, it generates new request everytime
			//resp.sendRedirect("servlet2");
			
			
		}else {
			//Redirect to login page
			
			pw.println("<h4>Invalid credentials</h4>");
			rd =req.getRequestDispatcher("/error.html");
			rd.forward(req, resp);
			//Reload same page on response
			//	rd =req.getRequestDispatcher("/index.html");
			//rd.include(req, resp);
			
		}
	
	}
}
