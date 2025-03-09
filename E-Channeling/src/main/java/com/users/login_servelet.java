package com.users;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login_servelet")
public class login_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		
		user usr = null;
		
		try {
			 usr = userBDutill.validate(email, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		
		HttpSession session = request.getSession();

		if(usr != null) {
			
			session.setAttribute("userid", usr.getUser_id());
			session.setAttribute("name", usr.getName());
			session.setAttribute("phone_no", usr.getPhone_no());
			session.setAttribute("email", usr.getEmail());
			session.setAttribute("password",usr.getPassword());
			session.setAttribute("role", usr.getRole());
			
			
			
			if(usr.getRole().equals("admin")) {
				response.sendRedirect("AdminDashboardServlet");
			}
			else if(usr.getRole().equals("patient")) {
				response.sendRedirect("userProfileServelet");
			}
			else if(usr.getRole().equals("doctor")) {
				response.sendRedirect("appoint_view.jsp");
			}
		}
		else {
			
			request.setAttribute("loginError", "Invalid username or password");
	        RequestDispatcher dis = request.getRequestDispatcher("User_logIn.jsp");
	        dis.forward(request, response);
		}
	}
}
