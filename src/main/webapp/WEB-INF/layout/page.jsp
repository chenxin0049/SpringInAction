<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/8/25
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style.css" />" >
</head>
<body>
    <div id="header">
    <t:insertAttribute name="header" />
    </div>
    <div id="content">
    <t:insertAttribute name="body" />
    </div>
    <div id="footer">
    <t:insertAttribute name="footer" />
    </div>
</body>
</html>
