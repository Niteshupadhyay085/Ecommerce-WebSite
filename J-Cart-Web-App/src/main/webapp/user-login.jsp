<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- <link rel="stylesheet" href="style.css"> -->
</head>
<body>

	<%
	String emailMessage = (String) request.getAttribute("incorrectEmail");

	String passwordMessage = (String) request.getAttribute("incorrectPassword");
	%>
	<div class="message">
		<%
		if (emailMessage != null) {
		%>
		<h3 style="color: red"><%=emailMessage%></h3>
		<%
		}
		%>
		<%
		if (passwordMessage != null) {
		%>
		<h3 style="color: red"><%=passwordMessage%></h3>
		<%
		}
		%>
	</div>
	<jsp:include page="home-button.jsp"></jsp:include>
	<div class="inner-block">
		<form action="loginUser" method="post">


			<p>
				<input type="text" placeholder="user name" name="userName">
			</p>
			<p>
				<input type="password" placeholder="at least 8 characters"
					name="userPassword">
			</p>
			<p>
				<select name="dropdown" id="">
					<option value="Login with Admin">Login with Admin</option>
					<option value="Login with Product Owner">Login with
						Product Owner</option>
				</select>
			</p>
			<p>
				<input type="submit" value="Login">
				<button>
					<a href="user-register.jsp">Signup</a>
				</button>
			</p>
		</form>
	</div>
</body>
</html>