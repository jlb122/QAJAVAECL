<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pet Page</title>
</head>
<body>
	<h1>This is a page all about my pet</h1>
	<hr>
	<br>
	<p>Name: ${myPet.getName()}</p>
	<p>Species: ${myPet.getSpecies() }</p>
	<p>Fluffy: ${myPet.getFluffy() }</p>
</body>
</html>