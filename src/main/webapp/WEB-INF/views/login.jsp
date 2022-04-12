<%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/3/29
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>Login</h1>
<%
    if (request.getAttribute("message")!=null){
        out.println(request.getAttribute("message"));
    }
%>
<div class="container">
    <div class="login-wrapper">
        <div class="header">Login</div>
        <form class="form-wrapper" onsubmit="return check()" action="/ChenHuayan2020211001001302/login" method="post"><br/>
            <input type="text" name="username" placeholder="username" class="input-item" required><br/>
            <input type="password" name="password" placeholder="password" class="input-item" required id="password"><br/>

            <input class="btn" type="submit" value="login"/>
        </form>

    </div>
</div>
<%@include file="footer.jsp"%>
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