package com.users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/userInsertServelet")
public class userInsertServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user_id= request.getParameter("id");
		String name= request.getParameter("name");
		String phone_no= request.getParameter("no");
		String email= request.getParameter("email");
		String password= request.getParameter("pass");
		String role= request.getParameter("role");
		String hospital= request.getParameter("hospital");
		
		
		
		boolean isTrue  = userBDutill.insertuser(user_id,name,phone_no, email,password,role,hospital);
		
		if(isTrue==true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("User_login.jsp");
			dis.forward(request, response);
		}
		else {
			
			request.setAttribute("RegisterError", "Registration Failed");
	        RequestDispatcher dis = request.getRequestDispatcher("signup.jsp");
	        dis.forward(request, response);
	}

  }
}
