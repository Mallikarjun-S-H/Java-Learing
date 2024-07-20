package paramAttrApp;

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
		
		int num1 = Integer.parseInt(req.getParameter("numberone"));
		int num2 = Integer.parseInt(req.getParameter("numbertwo"));
		
		int totalSum = (int)req.getAttribute("su");
		
		int multi = num1 * num2;
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h2>Total sum = " + totalSum + "</h2>");
		pw.println("<h2>Total product = " + multi + "</h2>");
		
		
	}
}
