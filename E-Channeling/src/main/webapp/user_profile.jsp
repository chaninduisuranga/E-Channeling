<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./CSS/user_profile.css">

</head>
<body>

<div class="container">
 <h1><i>Welcome to your profile...</i></h1>
 
  
  <div class="container">
    <h2>User Profile</h2>
<table>
<c:forEach var="us" items="${usr}">



<tr>
        
        <td>User Id:</td>
        <td>${us.user_id}</td>
        
      </tr>
      
      <tr>
        
        <td>User's Name:</td>
        <td>${us.name}</td>
        
      </tr>
      
      <tr>
        
        <td>User's phone no:</td>
        <td>${us.phone_no}</td>
        
      </tr>
      
      <tr>
        
        <td>User's Email:</td>
        <td>${us.email}</td>
        
      </tr>
      
      <tr>
        
        <td>User's Password:</td>
        <td>${us.password}</td>
        
      </tr>
      

</c:forEach>
</table>

<div class="button-container">
    
<button>UPDATE</button>
<button>DELETE</button>
    </div>
</div>
</div>
</body>
</html>