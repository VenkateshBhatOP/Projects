<%@page import="com.jobseeek.controller.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
User user = (User) session.getAttribute("logUser");
/* Resetting the NotRecruiter flag - since here we don't know whether person is 
recruiter or normal user */
if (user != null) {
	user.setNotRecruiter(false);
}
%>
<!DOCTYPE html>
<html>
<head>
<link href="css/button.css" rel="stylesheet"/>
<style type="text/css">


@charset "ISO-8859-1";

a {
	text-decoration: none;
	color: white;
	font-size: 17px;
}

.button {
	height: 45px;
	width: 200px;
	background-color: pink;
	display: flex; justify-content : center; align-items : center;
	border: none;
	justify-content: center;
	align-items: center;
	box-shadow: rgba(0, 0, 0, 0.15) 1.95px 1.95px 2.6px;
}

div {
	display: flex;
	justify-content: space-around;
	align-items: center;
	height:300px;
	
}


</style>
<meta charset="ISO-8859-1">
<title>GlassDoor</title>
<link rel="icon" href="img/glassdoor.png">
</head>
<body>
<center><h1>Welcome to GlassDoor</h1></center>
<hr>
<div>
<button class="button"><a href="Login.jsp">Login as a User</a></button>



<button class="button"><a href="recruiterlogin.jsp">Login as a Recruiter</a></button>
</div>

</body>
</html>