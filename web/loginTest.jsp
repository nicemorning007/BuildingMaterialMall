<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Nicemorning
  Date: 2017/12/2
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form method="POST" action="getUsernameAction">
    <s:textfield name="id"/>
    <s:submit/>
</s:form>
</body>
</html>
