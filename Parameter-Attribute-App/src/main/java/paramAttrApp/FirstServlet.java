package paramAttrApp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(req.getParameter("numberone"));
		int num2 = Integer.parseInt(req.getParameter("numbertwo"));
		
		int sum = num1+num2;
		
		req.setAttribute("su", sum);
		RequestDispatcher rd =req.getRequestDispatcher("/servlet2");
		rd.forward(req, resp);
		
		
	}
}
