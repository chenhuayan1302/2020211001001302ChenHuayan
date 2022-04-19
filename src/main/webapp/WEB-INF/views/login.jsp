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
        <%
            Cookie[] allCookie=request.getCookies();
            String username="",password="",rememberMeVale="";
            if(allCookie!=null){
                for(Cookie c:allCookie){
                    if(c.getName().equals("cUsername")){
                        username=c.getValue();
                    }
                    if(c.getName().equals("cPassword")){
                        password=c.getValue();
                    }
                    if(c.getName().equals("cRememberMe")){
                        rememberMeVale=c.getValue();
                    }
                }
            }
        %>
        <form class="form-wrapper" onsubmit="return check()" action="/ChenHuayan2020211001001302/login" method="post"><br/>
            <input type="text" name="username" value="<%=username%>" placeholder="username" class="input-item" required><br/>
            <input type="password" name="password" placeholder="password" value="<%=password%>" class="input-item" required id="password"><br/>
            <input type="checkbox" name="rememberMe" value="1"<%= rememberMeVale.equals("1") ?"checked:":""%>checked/>Remember Me<br/>

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