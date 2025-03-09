package com.users;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/updateProfileServelet")
public class updateProfileServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String phone_no = request.getParameter("phone_no");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		String hospital = request.getParameter("hospital");

		HttpSession session = request.getSession();
		int user_id = (int) session.getAttribute("user_id");
		
		boolean isTrue =userBDutill.updateusers( user_id,  name, phone_no,  email,  password , role, hospital );
		
		if(isTrue == true) {
			response.sendRedirect("userProfileServelett");
		}
		else {
			// send error with url
			String message = "Error when changing Details. try Again!";
			response.sendRedirect("userProfileServelet?message=" + URLEncoder.encode(message, "UTF-8"));
		}

		
	}

}
