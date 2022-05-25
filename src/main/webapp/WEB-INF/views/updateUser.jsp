<%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/4/19
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%
    User u = (User)session.getAttribute("user");
%>
<% if (!(request.getAttribute("updateFail") ==null)){
    out.println("<h5 style='color:red;'>"+request.getAttribute("updateFail")+"</h5>");
}%>
<div class="container">
    <div class="login-wrapper">
        <div class="header">lab2.Login</div>
        <form class="form-wrapper" onsubmit="return check()" action="updateUser" method="post"><br/>
            <input type="text" name="username" placeholder="username" class="input-item" value="<%=u.getUsername()%>" required><br/>
            <input type="password" name="password" placeholder="password" class="input-item" value="<%=u.getPassword()%>" required id="password"><br/>
            <input type="email" name="email" placeholder="email" class="input-item" value="<%=u.getEmail()%>" required><br/>
            Gender:
            <input name="sex" type="radio" value="Male"<%="Male".equals(u.getGender())?"checked":""%>>  Male
            <input name="sex" type="radio" value="Female" <%="Female".equals(u.getGender())?"checked":""%>>  Female<br/>
            <input type="date" name="Birthdays" placeholder="Birthdays" class="input-item" value="<%=u.getBirthdays()%>" required><br/>
            <input class="btn"  value="lab2.Login" type="submit" value="Register">

        </form>

    </div>
</div>

<script language="JavaScript">
    function check(){
        var password = document.getElementById("password")
        if (password.value.length < 8){
            return false;
        }
        else {
            return true;
        }

    }

</script>
<%@include file="footer.jsp"%>