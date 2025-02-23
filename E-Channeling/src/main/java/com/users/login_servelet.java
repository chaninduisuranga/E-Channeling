package com.users;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login_servelet")
public class login_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("email");
		String password = request.getParameter("pass");
		
		try {
			user usr = userBDutill.validate(username, password);
			if(usr != null) {
				request.setAttribute("usr", usr);
				RequestDispatcher dis = request.getRequestDispatcher("user_profile.jsp");
				dis.forward(request, response);
				System.out.println("login success!");
			} else {
				response.sendRedirect("Home_page.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
