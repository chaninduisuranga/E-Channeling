package com.users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/userProfileServelet")
public class userProfileServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int currentuser_id1 =(int) session.getAttribute("userid");
		System.out.println(currentuser_id1);
		user usr = userBDutill.getUserdetails(currentuser_id1);

		if(usr != null) {
			
			System.out.println("Condition true");
			String message = request.getParameter("message");
			
			if (message == null || message.trim().isEmpty()) {
				
			}
			else {
				request.setAttribute("Error",message);
			}

		
			request.setAttribute("user", usr);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user_profile.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("unsuc.jsp");
		}
		
	}

}
