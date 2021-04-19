<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-color:#F6F7F9;
}
@charset "ISO-8859-1";


.container {
	width: 80%;
	height: 100%;
	margin: 0 auto;
	
}


.box, .regbox {
	max-width:360px;
	width:100%;
	background:#fff;
	margin: 0;
	padding: 30px 40px;

	top : 55%;
	left: 54%;
	color: #273c75;
	border-radius: 15px;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
	top: 65%;
	box-shadow: 0 0 20px 0 rgb(0 0 0 / 30%);
	z-index: -1;
}

.avatar {
	margin: 0;
	padding: 0;
	width: 150px;
	height: 150px;
	top: -22%;
	position: absolute;
	left: calc(50% - 75px);
	border-radius: 50%;
}

.box h1 {
	
	padding: 20px 0;
	text-align: left;
	font-size: 24px;
	font-family: 'Source Sans Pro', sans-serif;
}

.box p {
	margin-bottom:4px;
	font-weight: 600;
	color: #52556e;
	font-family: 'Poppins', sans-serif;
	
}

.box input {
	width: 100%;
	margin-bottom: 15px;
	border-radius: 5px;
	
}

.box input[type="text"], .box input[type="password"] {
	border: none;
	outline: none;
	height: 35px;
	 color: #52556e;
	font-size: 15px;
	border:1px solid #495057;
}

.box input[type="submit"] {
	display: block;
	border: none;
	outline: none;
	height: 40px;
	background-color: #eb5b77;
	color: white;
	font-size: 15px;
	border-radius: 20px;
	cursor:pointer;
	font-weight:600;
	margin-top:8px;
	margin-bottom:unset;
}
input::placeholder{
	padding-left:15px;
}

/*
.box input[type="submit"]:hover {
	border: none;
	outline: none;
	height: 35px;
	opacity: 0.8;
	color: #fff;
	font-size: 20px;
	border-radius: 20px;
	cursor: pointer;
	transition: .3s ease-out;
}*/

.box a {
	text-decoration: none;
	color:grey;
	font-size: 16px;
	line-height: 20px;
}


.regbox .avatar {
	margin: 0;
	padding: 0;
	width: 150px;
	height: 150px;
	top: -19%;
	position: absolute;
	left: calc(50% - 75px);
	border-radius: 50%;
}

.regbox h1 {
	
	padding: 20px 0;
	text-align: left;
	font-size: 24px;
	font-family: 'Source Sans Pro', sans-serif;
}

.regbox p {
	margin-bottom:4px;
	font-weight: 600;
	color: #52556e;
	font-family: 'Poppins', sans-serif;
}

.regbox input {
	width: 100%;
	margin-bottom: 15px;
	border-radius: 5px;
}

.regbox input[type="text"], .regbox input[type="password"] {
	border: none;
	background: transparent;
	border: 1px solid #ced4da;
	outline: none;
	height: 35px;
	 color: #52556e;
	font-size: 15px;
}

.regbox input[type="submit"] {
	display: block;
	border: none;
	outline: none;
	height: 40px;
	background-color: #eb5b77;
	color:#fff;
	font-size: 15px;
	border-radius: 20px;
	cursor:pointer;
	font-weight:600;
	margin-top:8px;
		margin-bottom:unset;
}
/*
.regbox input[type="submit"]:hover {
	border: none;
	outline: none;
	height: 35px;
	background: #ff6348;
	color: #fff;
	font-size: 20px;
	border-radius: 20px;
	cursor: pointer;
	transition: .3s ease-out;
}*/

.regbox a {
	text-decoration: none;
color:grey;
	font-size: 16px;
	line-height: 20px;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Account</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&family=Source+Sans+Pro:wght@600&display=swap" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="regbox ">
			
			<h1>Register Account</h1>
			<form action="RegisterController" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				<p>Email</p>
				<input type="text" placeholder="Email" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Register"> <a style="color:grey"class="account"
					href="Login.jsp">Already have Account?</a>
			</form>
		</div>
	</div>
</body>
</html>
