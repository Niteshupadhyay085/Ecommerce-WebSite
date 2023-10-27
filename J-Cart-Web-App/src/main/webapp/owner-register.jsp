<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>Welcome to Product Owner Login Area</h3>
		<div>
				<form action="registerOwner" method="post">
					<label>OwnerName:</label><br>
					<input type="text" placeholder="OwnerName" name="ownerName"><br>
					<label>OwnerEmail:</label><br>
					<input type="email" placeholder="ownerEmail" name="ownerEmail"><br>
					<label>UserPassword:</label><br>
					<input type="password" placeholder="ownerPassword" name="ownerPassword"><br>
					<label>UserPhone:</label><br>
					<input type="tel" placeholder="ownerPhone" name="ownerPhone"><br>
					<input type="submit" value="Signup">
				</form>
		</div>
</body>
</html>