<%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/5/18
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab 1</title>
</head>
<body>
<%
    String name=request.getParameter("name");
    String Class=request.getParameter("Class");
    String id=request.getParameter("id");

    out.println("name:"+name+"<br/>");
    out.println("Class:"+Class+"<br/>");
    out.println("id:"+id+"<br/>");
%>
name:${param.name}<br/>
Class:${param.Class}<br/>
id:${param.id}<br/>
</body>
</html>
