<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var ="student" items="${student}">
		${student.id}
		${student.name}
		${student.salary}
	</c:forEach>
	<h2>shakil</h2>
</body>
</html>