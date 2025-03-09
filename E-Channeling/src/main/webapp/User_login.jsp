<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Login</title>
    <link rel="stylesheet" href="./CSS/User_login.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="content">
        <h1><b>USER LOGIN</b></h1>
        <p>Enter your login credentials below</p>

        <form action="${pageContext.request.contextPath}/login_servelet" method="post">

            <label for="email">EMAIL:</label>
            <input type="email" name="email" placeholder="Enter your email" maxlength="50" required>

            <label for="pass">PASSWORD:</label>
            <input type="password" name="pass" placeholder="Enter your password" maxlength="50" required>
            
                        
            <button type="submit" name="btn">LOGIN</button>
        </form>
        
        <% if (request.getAttribute("errorMessage") != null) { %>
        <p style="color: red;"><%= request.getAttribute("errorMessage") %></p>
    <% } %>
    
    </div>

    <div class="pic">
        <img src="./IMAGES/loginpic.jpg" alt="Healthcare Image">
    </div>
</div>

</body>
</html>
