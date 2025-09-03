<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Student Information</h3>
	
	Id : ${object.id}  <br>
	Age : ${object.age}<br>
	Name : ${object.name}  <br>
	Gender : ${object.gender}  <br>
	Address : ${object.address} <br>
	
	Hobbies : <c:forEach items="${object.hobbies }" var="data">	${data} <br></c:forEach>
	
</body>
</html>