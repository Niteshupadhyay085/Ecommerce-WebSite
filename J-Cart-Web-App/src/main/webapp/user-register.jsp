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
			String msgPass =(String)request.getAttribute("passwordMessage");
		%>
		
		<%if(msgPass!=null){ %>
		
			<h4 style="color: red"><%=msgPass%></h4>
		
		<%} %>
		<jsp:include page="home-button.jsp"></jsp:include>
		<div>
			<div>
				<form action="userRegister" method="post">
					<label>UserName:</label><br>
					<input type="text" placeholder="UserName" name="userName"><br>
					<label>UserEmail:</label><br>
					<input type="email" placeholder="UserEmail" name="userEmail"><br>
					<label>UserPassword:</label><br>
					<input type="password" placeholder="UserPassword" name="userPassword"><br>
					<label>UserPhone:</label><br>
					<input type="tel" placeholder="UserPhone" name="userPhone"><br>
					<label>UserAddress:</label><br>
					<input type="text" placeholder="UserAddress" name="userAddress"><br>
				
					<input type="submit" value="Signup">
				</form>
			</div>
		</div>
</body>
</html>