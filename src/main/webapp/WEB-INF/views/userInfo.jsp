<%@ page import="com.Chenhuayan.model.User" %><%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/4/5
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> User Info </h1>
<%--<%
    Cookie [] allCookies = request.getCookies();
    for (Cookie c : allCookies) {
        out.println("<br/>"+c.getName()+" --- "+c.getValue());
    }
%>--%>
<%
    //Users users = (Users)request.getAttribute("user");
    User u = (User)session.getAttribute("user");
%>
<table>
    <tr>
        <td>Username:</td><td><%=u.getUsername()%></td>
    </tr>
    <tr>
        <td>Password:</td><td><%=u.getPassword()%></td>
    </tr>
    <tr>
        <td>Email:</td><td><%=u.getEmail()%></td>
    </tr>
    <tr>
        <td>Gender:</td><td><%=u.getGender()%></td>
    </tr>
    <tr>
        <td>Birthdays:</td><td><%=u.getBirthdays()%></td>
    </tr>
    <tr>
        <td><a href="updateUser" style="text-decoration: none">Update User</a></td>
    </tr>
</table>
<%@include file="footer.jsp"%>
