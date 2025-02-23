<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./CSS/updateProfile.css">
</head>
<body>
<div class="container">
    <div class="content">
        <h1><b>USER SIGNUP</b></h1>
        <p>Enter your details below</p>

      <form action="${pageContext.request.contextPath}/updateProfileServelet" method="POST">

            <%
            String user_id=request.getParameter("user_id");
            String name=request.getParameter("name");
            String phone_no=request.getParameter("phone_no");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            %>
            <% String message = (String) request.getAttribute("message");
             if (message != null) { %>
             <p style="color:red;"><%= message %></p>
             <% } %>
            
            
            <label for="id">USER ID:</label>
            <input type="text" name="user_id" value="<%= user_id%>" readonly >
  
                       
            <label for="name">NAME:</label>
            <input type="text" name="name" value="<%= name%>" required>

            
            <label for="no">PHONE NO:</label>
            <input type="text" name="phone_no" value="<%= phone_no%>" required>

            
            <label for="email">EMAIL:</label>
           <input type="email" name="email" value="<%= email%>" required>


            <label for="pass">PASSWORD:</label>
           <input type="password" name="password" value="<%= password%>" required>

            
            <button type="submit" name="btn">UPDATE PROFILE</button>
        </form>
    </div>

    
</div>
</body>
</html>