<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
::placeholder {
	color: red;
}
</style>
</head>
<body>

	<%
	String incorrectEmail = (String) request.getAttribute("incorrectAdminEmail");

	String incorrectPassword = (String) request.getAttribute("incorrectAdminPass");
	%>
	<marquee>
		<h3>
			<i>Welcome To Admin Login</i>
		</h3>
	</marquee>
	
	<%if(incorrectEmail!=null){ %>
		
		<span style="color: red"><%=incorrectEmail%></span>
	
	<%} %>
	<%if(incorrectPassword!=null){ %>
		
		<span style="color: red"><%=incorrectPassword%></span>
	
	<%} %>
	
	<jsp:include page="home-button.jsp"></jsp:include>
	
	<form action="adminLogin" method="post">
		<label>UserName:</label> <br> <input type="email"
			placeholder="type your email" name="adminEmail"><br> <label>Password:</label>
		<br> <input type="password" placeholder="type your password"
			name="adminPassword"><br> <input type="submit"
			value="login" style="margin-top: 10px;">
	</form>
</body>
</html>