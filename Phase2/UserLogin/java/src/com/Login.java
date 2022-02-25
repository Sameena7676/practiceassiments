package com.sampal.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 

			throws ServletException, IOException {


		response.setContentType("text/html");


		PrintWriter out = response.getWriter();


		String uName = request.getParameter("userName");

		String uPassword = request.getParameter("userPassword");


		HttpSession theSession = request.getSession();


		if(uName.trim().equals("sameena") && uPassword.trim().equals("sameena97")) 

		{


			theSession.setAttribute("userName", uName);

			theSession.setAttribute("userPassword", uPassword);


			response.sendRedirect("dashboard");

		}

		else {

			out.println("<font color='red'>Invalid username or Password...</font>");
			

			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");

			dispatcher.include(request, response);

		}

	}
}
