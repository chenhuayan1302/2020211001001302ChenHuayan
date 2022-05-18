<%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/5/18
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>This is MyJsp.jsp</title>
</head>
<body>
<form action="MyDearJsp.jsp" method="post">
    <input type="text" name="name" value="name">
    <br />
    <input type="text" name="Class" value="Class"/>
    <br/>
    <input type="text" name="id" value="id"/>
    <br/>
    <input type="submit" name="submit" value="send date to server" />
</form>
</body>
</html>