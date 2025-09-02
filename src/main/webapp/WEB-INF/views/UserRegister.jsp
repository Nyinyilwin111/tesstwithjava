<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h3>User Registration</h3>

    <c:if test="${not empty message}">
        <div class="alert alert-success">${message}</div>
    </c:if>

    <form:form modelAttribute="userObj" method="post" action="saveUser">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <form:input path="name" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <form:input path="email" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Password</label>
            <form:password path="password" cssClass="form-control"/>
        </div>
        <input type="submit" class="btn btn-primary" value="Register"/>
    </form:form>
</div>
</body>
</html>
