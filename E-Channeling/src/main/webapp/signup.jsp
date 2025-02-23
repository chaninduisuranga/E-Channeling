<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign up </title>
<link rel="stylesheet" href="./CSS/signup.css">
</head>
<body>

<jsp:include page="header.jsp"/>

<div class="container">
    <div class="content">
        <h1><b>USER SIGNUP</b></h1>
        <p>Enter your details below</p>

        <form action="${pageContext.request.contextPath}/userInsertServelet" method="post">

            
            <label for="id">USER ID:</label>
            <input type="text" name="id" placeholder="Enter your user id" maxlength="50"  readonly required>
            
            <label for="name">NAME:</label>
            <input type="text" name="name" placeholder="Enter your name" maxlength="50" required>
            
            <label for="no">PHONE NO:</label>
            <input type="text" name="no" placeholder="Enter your phone no" maxlength="50" required>
            
            <label for="email">EMAIL:</label>
            <input type="email" name="email" placeholder="Enter your email" maxlength="50" required>

            <label for="pass">PASSWORD:</label>
            <input type="password" name="pass" placeholder="Enter your password" maxlength="50" required>

            <button type="submit" name="btn">SIGN UP</button>
        </form>
    </div>

    <div class="pic">
        <img src="./IMAGES/pic3.jpg" alt="Healthcare Image">
    </div>
</div>

</body>
</html>