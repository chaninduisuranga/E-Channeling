package com.users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateProfileServelet")
public class updateProfileServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user_id = request.getParameter("user_id");
		String name = request.getParameter("name");
		String phone_no = request.getParameter("phone_no");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		
		
		boolean isTrue =userBDutill.updateuser(user_id, name, phone_no, email, password);
		
		if(isTrue) {
		    request.setAttribute("message", "Profile updated successfully!");
		    RequestDispatcher dis = request.getRequestDispatcher("/userInsertServelet");
		    dis.forward(request, response);
		} else {
		    request.setAttribute("message", "Update failed. Try again.");
		    RequestDispatcher dis = request.getRequestDispatcher("updateProfile.jsp");
		    dis.forward(request, response);
		}

		
	}

}
