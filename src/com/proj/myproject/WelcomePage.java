package com.proj.myproject;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomePage extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();

		// String str= req.getParameter("username");
		// System.out.println(str);
		
		HttpSession session = req.getSession();
		out.println("Welcome  " + session.getAttribute("username"));
	}
}
