<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/8/24
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Your Profile</h1>
<c:out value="${spitter.username}"></c:out><br/>
<c:out value="${spitter.firstName}"></c:out> <c:out value="${spitter.lastName}"></c:out><br/>

