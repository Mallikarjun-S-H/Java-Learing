package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course");
		
		resp.containsHeader("text/html");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<H2> Name: " + name + " </H2>");
		pw.println("<h2> Email:" + email + "</h2>");
		pw.println("<h2> Selected Course:" + course + "</h2>");
		pw.println("<h2> Thank you for registering with us </h2>");
		
	}
	
}
