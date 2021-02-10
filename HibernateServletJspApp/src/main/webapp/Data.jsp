<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H3>WELCOME TO STUDENT DATA PAGE</H3>
<table border="1">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>FEE</th>
	</tr>
	<c:forEach items="${list}" var="ob">
		<tr>
			<td>${ob.stdId} </td>
			<td>${ob.stdName} </td>
			<td>${ob.stdFee} </td>
		</tr>
	</c:forEach>
</table>
</body>
</html>