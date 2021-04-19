<%@page import="com.jobseeek.controller.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			
			<%
			User actualUser = (User) session.getAttribute("logUser");
			if (actualUser != null && actualUser.isNotRecruiter())
			{
			%>
				
			<%	
			}
			else
			{
			%>
				<div>
				<a href="recruiternavbar.jsp" class="navbar-brand"> Back to Homepage</a>
				</div>
			<%
			}
			%>
			

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Jobs</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of OpenJobs</h3>
			<hr>

			<%
			if (actualUser != null && actualUser.isNotRecruiter())
			{
			%>
				
			<%	
			}
			else
			{
			%>
				<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Job</a>
				</div>
			<%
			}
			%>
			
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Country</th>
						<th>Experience</th>
						<th>Skills</th>
						<th>Job Description</th>
						<th>Job Location</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="user" items="${listUser}">

						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.name}" /></td>
							<td><c:out value="${user.email}" /></td>
							<td><c:out value="${user.country}" /></td>
							<td><c:out value="${user.experience}" /></td>
							<td><c:out value="${user.skills }"/></td>
							<td><c:out value="${user.jobdescription }"/></td>
							<td><c:out value="${user.joblocation }"/></td>
						
							<%
							if (actualUser != null && actualUser.isNotRecruiter())
							{
							%>
								<td><a href="${user.formLink}" target="_blank">Apply</a></td>
							<%	
							}
							else
							{
							%>
								<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
							<%
							}
							%>
							
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>