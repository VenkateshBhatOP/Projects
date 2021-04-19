<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GlassDoor</title>
<link rel="icon" href="img/glassdoor.png">
</head>
<body>

<jsp:include page="Navbar.jsp"></jsp:include>




<c:if test="${pagename!='register' && pagename!='login'}">
<jsp:include page="Ad.jsp"></jsp:include>
<jsp:include page="HomePage.jsp"></jsp:include>
</c:if>


<c:if test="${pagename=='register' }">
<jsp:include page="Register.jsp"></jsp:include>
</c:if>



<c:if test="${pagename!='register' && pagename!='login'}">
<jsp:include page="Footer.jsp"></jsp:include>
</c:if>



<c:if test="${pagename=='login' }">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>


<c:if test="${pagename=='mission' }">
<jsp:include page="Mission.jsp" ></jsp:include>
</c:if>


<c:if test="${pagename=='vision' }">
<jsp:include page="Vision.jsp"></jsp:include>
</c:if>

<c:if test="${pagename=='regcomplete' }">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${pagename=='logout' }">
<jsp:include page="HomePage.jsp"></jsp:include>
</c:if>



</body>
</html>