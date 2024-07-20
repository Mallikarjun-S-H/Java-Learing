package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	
	ServletConfig con;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Returns a String";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("start");
		con = arg0;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Running");
		arg1.setContentType("text/html");
		PrintWriter out =arg1.getWriter();
		out.println("<h1>Welcome to app servlet created using servlet interface<h1> "); 
		System.out.println();
		System.out.println(getServletInfo());
		System.out.println(getServletConfig().toString());
	}

}
