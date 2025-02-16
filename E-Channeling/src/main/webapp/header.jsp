

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title><%= "Bank Ease" %></title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/header.css">
<link  rel="href="${pageContext.request.contextPath}/IMAGES/pic2.jpeg" type="IMAGES/pic2.jpeg">
</head>
<body>
  <header class="header">
    <div class="logo-container">
        <a href="${pageContext.request.contextPath}/Index.jsp" title="E channeling">
            <img src="${pageContext.request.contextPath}/IMAGES/pic2.jpeg" alt="E Channeling  Logo" class="logo">
        </a>
        <h1 class="site-title">E Channeling</h1>
    </div>
    <nav class="nav">
      <ul class="nav-links">
        <li><a href="${pageContext.request.contextPath}/Home_page.jsp" title="Home">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/Services.jsp" title="Services">Services</a></li>
        <li><a href="${pageContext.request.contextPath}/about_us.jsp" title="About">About Us</a></li>
        <li><a href="${pageContext.request.contextPath}/contact.jsp" title="Contact Us">Contact</a></li>
        <li><a href="${pageContext.request.contextPath}/login.jsp" class="btn-primary" title="Login">Login</a></li>
      </ul>
    </nav>
  </header>
</body>
</html>