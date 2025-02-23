
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


<c:set var="user_id" value="${usr.user_id}"/>
<c:set var="name" value="${usr.name}"/>
<c:set var="phone_no" value="${usr.phone_no}"/>
<c:set var="email" value="${usr.email}"/>
<c:set var="password" value="${usr.password}"/>

<tr>
        
        <td>User Id:</td>
        <td>${usr.user_id}</td>
        
      </tr>
      
      <tr>
        
        <td>User's Name:</td>
        <td>${usr.name}</td>
        
      </tr>
      
      <tr>
        
        <td>User's phone no:</td>
        <td>${usr.phone_no}</td>
        
      </tr>
      
      <tr>
        
        <td>User's Email:</td>
        <td>${usr.email}</td>
        
      </tr>
      
      <tr>
        
        <td>User's Password:</td>
        <td>${usr.password}</td>
        
      </tr>
      
</table>

<div class="button-container">

<c:url value="updateProfile.jsp" var="user">
   
<c:param name="user_id" value="${usr.user_id}"/>
<c:param name="name" value="${usr.name}"/>
<c:param name="phone_no" value="${usr.phone_no}"/>
<c:param name="email" value="${usr.email}"/>
<c:param name="password" value="${usr.password}"/>

</c:url>
    
    <a href="${user}">
    <button type="button">UPDATE</button>
</a>
    <a href="deleteuser.jsp">
    <button type="button">DELETE</button>
</a>
    </div>
</div>
</div>
</body>
</html>