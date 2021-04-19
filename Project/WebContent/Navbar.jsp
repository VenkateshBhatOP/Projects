<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
<link href="css/navbar.css" rel="stylesheet" type="text/css" />
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@600&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	box-sizing: border-box;
}
@charset "ISO-8859-1";

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.content {
	display: flex;
	justify-content: space-between;
	align-items: center;
	background-color: #f9f9f9;
	padding: 15px 26px;
	box-shadow: 0 15px 35px 0 rgb(50 50 93 / 10%);
	
}

img {
	width: 30px;
	margin-left: 54px;
	margin-right: 1px;
	height: 30px;
}

.navRight ul li a{
	color:#eb5b77;
	z-index:-1;
}
.navLeft {
	display: flex;
	align-items: center;

}

ul {
	display: flex;
	align-items: center;

}

li {
	list-style-type: none;
	margin-right: 28px;
	padding: 6px;

}

.aboutus #drop li a {
	text-decoration: none;
	color:#eb5b77;
}

.aboutus #drop li a:hover {
	color:#eb5b77;
}

h1 {
	font-family: 'Source Sans Pro', sans-serif;
	color: #273c75;
}

.navRight li:hover {
	background: #EEC0C6;
	border-radius: 6px;
}

#drop{
	background-color:#EEC0C6;
}
.aboutus {
	display: none;
	z-index:5;
	
}

li:hover .aboutus {
	display: block;
	position: absolute;
	background: #fff;
	box-shadow: rgba(0, 0, 0, 0.25) 0px 5px 15px;
	margin-top: 8px;
}

li:hover .aboutus ul  {
	display: block;
	margin: 5px;
}

li:hover .aboutus ul li {
	width: 150px;
	padding: 10px;
	border-bottom: 1px solid #eb5b77;
	
	
	border-radius: 0;
	text-align: left
}

li:hover .aboutus ul li:last-child {
	border-bottom: none;
}



form.example input[type=text] {
	padding: 5px;
	font-size: 17px;
	border: 1px solid grey;
	float: left;
	width: 80%;
	background: #f1f1f1;
}

form.example button {
	float: left;
	width: 20%;
	padding: 6px;
	background:#eb5b77;
	color: white;
	font-size: 17px;
	border: none;
	border-left: none;
	cursor: pointer;
	outline:none;
}

form.example button:hover {
	background: #E58C8A;
}

form.example::after {
	content: "";
	clear: both;
	display: table;
}


</style>
</head>
<body>
	<nav class="content">
		<div class="navLeft">
			<img alt="" src="img/OpenNaukri.png" />
			<h3>Glassdoor</h3>
		</div>

		<div class="navRight">
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="#">About Us</a>
					<div class="aboutus">
						<ul id="drop">
							<li><a href="Mission.jsp" target="display">Mission</a></li>
							<li><a href="Vision.jsp" target="display">Vision</a></li>
							<li><a
								href="https://www.google.com/search?q=jobs&rlz=1C1SQJL_enIN927IN927&oq=jobs&aqs=chrome..69i57j0i433j0i131i433i457j0i402l2j69i61j69i60l2.856j0j4&sourceid=chrome&ie=UTF-8&ibp=htl;jobs&sa=X&ved=2ahUKEwiSuIGp8_juAhX0zzgGHXsSD4EQutcGKAB6BAgFEAQ&sxsrf=ALeKk03vhdNAlZldiZxyW4B3jtHyFCFwnA:1613839147760#htivrt=jobs&htidocid=veB3EQoWx7VUxI1dAAAAAA%3D%3D&fpstate=tldetail" target="_blank">career</a></li>
						</ul>
					</div></li>
				<li><a href="#"><a href="RecruiterUser.jsp">Logout</a></a></li>
				
				<li>
					<form class="example" action="https://www.google.com/search"
						style="margin: auto; max-width: 250px" target="_blank">
						<input type="text" placeholder="skills,designation.." name="q">
						<button>
							<i class="fa fa-search"></i>
						</button>
					</form>

				</li>

			</ul>
		</div>

	</nav>
</body>
</html>