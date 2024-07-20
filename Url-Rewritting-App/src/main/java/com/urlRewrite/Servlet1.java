package com.urlRewrite;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Servlet1 extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			String email = req.getParameter("email");
			
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			pw.println("<h1> Email: " + email + "</h1>");
			pw.println("<a href='servlet2?useremail="+email+"'>Servlet 2</a>");
			
			
}
	
}
