package com.proj.myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstPage extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		// String i=getServletContext().getInitParameter("n1");
		// String i2=getServletContext().getInitParameter("n2");
		// out.println(i+i2);

		String uname = req.getParameter("username");
		String pass = req.getParameter("pwd");

		if (uname.equalsIgnoreCase("sangeetha") && pass.equals("123")) {

			// RequestDispatcher rd= req.getRequestDispatcher("/WelcomePage");
			// rd.forward(req,resp);

			String str1 = req.getParameter("username");
			HttpSession session = req.getSession();
			session.setAttribute("username", str1);
			resp.sendRedirect("WelcomePage");
			
		} else {
			out.print("please enter the correct entry");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
}
