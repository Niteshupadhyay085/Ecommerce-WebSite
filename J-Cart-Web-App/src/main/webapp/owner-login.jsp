<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
	String incorrectEmail = (String) request.getAttribute("incorrectOwnerEmail");

	String incorrectPassword = (String) request.getAttribute("incorrectOwnerPass");
	
	String verify = (String) request.getAttribute("unverified");
	%>
	<marquee><h3><i>Welcome to Owner Login Page</i></h3></marquee>
		
	<%if(incorrectEmail!=null){ %>
		
		<span style="color: red"><%=incorrectEmail%></span>
	
	<%} %>
	<%if(incorrectPassword!=null){ %>
		
		<span style="color: red"><%=incorrectPassword%></span>
	
	<%} %>
	<%if(verify!=null){ %>
		
		<span style="color: red"><%=verify%></span>
	
	<%} %>
	


		
		<div>
			<form action="ownerLogin" method="post">
				<label>OwnerEmail</label><br>
				<input type="email" placeholder="type your email" name="ownerEmail"><br>
				
				<label>OwnerPassword</label><br>
				<input type="password" placeholder="type your password" name="ownerPassword"><br>
				
				
				<input type="submit" value="Login"> 
			</form>
		</div>
</body>
</html>