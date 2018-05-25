<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Pets</title>
</head>
<body>
	<h1>Here is a list of my pets:</h1>
	<c:forEach items="${petList}" var="pet"> 
		<p>Name: ${pet.getName()}, Species: ${pet.getSpecies() }, Fluffy? ${pet.getFluffy() }</p>
	</c:forEach>
</body>
</html>