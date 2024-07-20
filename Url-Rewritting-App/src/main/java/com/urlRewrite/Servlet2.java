package com.urlRewrite;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userEmail = req.getParameter("useremail");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1> Email: " + userEmail + "</h1>");
	}
}
