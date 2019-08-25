<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/8/24
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" />
</head>
<body>
    <h1>Register</h1>
    <sf:form method="post" modelAttribute="spitter">
        <sf:errors path="*" element="div" cssClass="errors"/>
        <sf:label path="firstName" cssErrorClass="error">First Name</sf:label>: <sf:input path="firstName" cssErrorClass="error" /><br/>
        <sf:label path="lastName" cssErrorClass="error">Last Name</sf:label>: <sf:input path="lastName" cssErrorClass="error" /><br/>
        <sf:label path="username" cssErrorClass="error">Username</sf:label>: <sf:input path="username" cssErrorClass="error" /><br/>
        <sf:label path="password" cssErrorClass="error">Password</sf:label>: <sf:password path="password" cssErrorClass="error" /><br/>
        <sf:label path="email" cssErrorClass="error">Email</sf:label>: <sf:input path="email" cssErrorClass="error" /><br/>
        <input type="submit" value="Register" />
    </sf:form>
</body>
</html>
