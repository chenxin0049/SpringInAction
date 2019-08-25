<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/8/24
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
    <div>
        <h1>Recent Spittles</h1>
        <ul class="spittleList">
            <c:forEach items="${spittleList}" var="spittle">
                <li>
                    <div><c:out value="${spittle.message}" /></div>
                    <div>
                        <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                        <span class="spittleLocation">(<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)</span>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
