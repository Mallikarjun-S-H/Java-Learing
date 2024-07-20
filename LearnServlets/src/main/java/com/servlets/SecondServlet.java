package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<H1>Second Servlet created using Generic class</H1>");
		out.println("Generic servlet"+ " " +new Date().toString());
	}

}
