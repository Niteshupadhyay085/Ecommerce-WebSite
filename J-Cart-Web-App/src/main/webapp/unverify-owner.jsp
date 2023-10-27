<%@page import="com.jsp.jcart_web_app.dto.ProductOwner"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.jcart_web_app.dao.ProductOwnerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>unverified-product-owner-details</h3>

	<%
			ProductOwnerDao dao = new ProductOwnerDao();
			List<ProductOwner> owners = dao.displayAllProductOwnerDao();
	%>

	<table border="2px">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>phone</th>
			<th>status</th>
			<th>verifynow</th>
		</tr>
		
		<%for(ProductOwner owner:owners){ %>
		
		<%if(owner.getVerify().equals("no")){%>
		<tr>
			<td><%=owner.getId()%></td>
			<td><%=owner.getName()%></td>
			<td><%=owner.getEmail()%></td>
			<td><%=owner.getPhone()%></td>
			<td><%=owner.getVerify()%></td>
			<td>verify</td>
		</tr>
	<%}}%>
	</table>
</body>
</html>