<%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/3/6
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div class="container">
    <div class="login-wrapper">
        <div class="header">Login</div>
        <form class="form-wrapper" onsubmit="return check()" action="/ChenHuayan2020211001001302/register" method="post"><br/>
            <input type="text" name="username" placeholder="username" class="input-item" required><br/>
            <input type="password" name="password" placeholder="password" class="input-item" required id="password"><br/>
            <input type="email" name="email" placeholder="email" class="input-item" required><br/>
            Gender:
            <input name="sex" type="radio" value="Male"/>  Male
            <input name="sex" type="radio" value="Female"/>  Female<br/>
            <input type="date" name="Birthdays" placeholder="Birthdays" class="input-item" required><br/>
            <input class="btn"  value="Login" type="submit" value="Register">

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

