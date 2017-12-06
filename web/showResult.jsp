<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="userControlAction_testHiber" method="POST">
    <s:textfield name="id"/>
    <s:submit/>
</s:form>
<s:property value="info"/>
</body>
</html>
