<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Nicemorning
  Date: 2017/11/25 0025
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><s:property value="info"/> </h1>
<s:form action="loginAction" method="POST">
    <s:textfield label="username" name="username" type="text"/>
    <s:textfield label="password" name="password" type="password"/>
    <s:submit value="login"/>
</s:form>
</body>
</html>
