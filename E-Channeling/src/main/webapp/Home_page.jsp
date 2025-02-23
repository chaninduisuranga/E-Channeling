<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
 <link rel="stylesheet" href="./CSS/Home_page.css">
</head>


<body>
<jsp:include page="header.jsp"/>

<header >
<div class="hero">
    <div class="content">
      <h1>Welcome to eChannelling</h1>
      <p> E-Channeling makes health care simple with easy online doctor appointments. Browse top specialists, book instantly, and consult from anywhere. Secure, fast, and hassle-free—because your health matters.</p>
      <div class="buttons">
        <a href="User_login.jsp">
    <button type="button">LOGIN</button>
</a>
       <a href="signup.jsp">
    <button type="button">SIGNUP</button>
</a>
      </div>
    </div>
    <div class="illustration">
      <img src="./IMAGES/pic1.jpg" alt="hero image">
    </div>
  </div></header>
  
<jsp:include page="footer.jsp"/>
</body>
</html>

