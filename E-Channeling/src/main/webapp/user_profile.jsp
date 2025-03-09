<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/user_profile.css">
</head>
<body>
  

    <div class="container">
        <div class="box">
        
        <c:set var="usr" value="${user}" />
        <c:set var="userId" value="${usr.user_id}" />
        <c:set var="userName" value="${usr.name}" />
        <c:set var="userEmail" value="${usr.email}" />
        <c:set var="userPhone" value="${usr.phone_no}" />
        <c:set var="userRole" value="${usr.role}" />
        <c:set var="userHospital" value="${usr.hospital}" />
            
            <form action="${pageContext.request.contextPath}/updateProfileServelet" method="POST">
           
           
                <label>User ID:</label>
                <input type="text" name="id" value="${usr.user_id}" required>
                <label>Name:</label>
                <input type="text" name="name" value="${usr.name}" required>

                <label>Email:</label>
                <input type="email" name="email" value="${usr.email}" readonly>

                <label>Phone Number:</label>
                <input type="text" name="phone_no" value="${usr.phone_no}" required>

                <c:if test="${user.role == 'doctor'}">
                    <label>Hospital:</label>
                    <input type="text" name="hospital" value="${usr.hospital}">
                </c:if>

                <input type="submit" value="Save Changes">
            </form>

            <hr>

           
            <form action="${pageContext.request.contextPath}" method="POST">
                <label>Old Password:</label>
                <input type="password" name="oldPassword" required>

                <label>New Password:</label>
                <input type="password" name="newPassword" required>

                <input type="submit" value="Change Password">
            </form>

            <hr>

           
            <form action="${pageContext.request.contextPath}" method="POST">
                <input type="hidden" name="user_id" value="${user.user_id}">
                <input type="submit" value="Delete Account" class="delete-btn" onclick="return confirm('Are you sure you want to delete your account?');">
            </form>

            <a href="${pageContext.request.contextPath}/LogoutServlet" class="logout-btn">Logout</a>
        </div>
    </div>

  
</body>
</html>
