<%@page import="com.jobseeek.controller.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
User user = (User) session.getAttribute("logUser");
if (user == null) {
	response.sendRedirect("Login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-image: url(img/cutegirl.jpg);
background-repeat:no-repeat;
background-size:cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<div align="center">
		<h1>
			Welcome,
			<%=user.getName()%></h1>
		<p>
		<h3>
			Your Email:
			<%=user.getEmail()%>
		</h3>
		<h3>
			Your Password:
			<%=user.getPassword()%></h3>

		<span><button style="background-color: pink;">
				<a style="text-decoration:none;color:#E75480" href="index.jsp">Continue to search Jobs</a>
			</button></span> <span><button style="background-color: pink;">
				<a style="text-decoration:none;color:#E75480" href="RecruiterUser.jsp">Log Out</a>
			</button></span>

	</div>
</body>
</html>
