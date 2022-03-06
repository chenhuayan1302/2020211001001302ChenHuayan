<%--
  Created by IntelliJ IDEA.
  User: chenhuayan
  Date: 2022/3/6
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录|Login</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        html {
            height: 100%;
        }
        body {
            height: 100%;
        }
        .container {
            height: 100%;
            background-image: linear-gradient(to right,#a8edea, #fed6e3);
        }
        .login-wrapper {
            background-color: #fff;
            width: 358px;
            height: 588px;
            border-radius: 25px;
            padding: 0 70px;
            position: relative;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
        .header {
            font-size: 50px;
            font-weight: bold;
            text-align: center;
            line-height: 200px;
            color: #131391;
        }
        .input-item {
            display: block;
            width: 100%;
            margin-bottom: 20px;
            border: 0;
            padding: 10px;
            border-bottom: 1px solid rgb(128, 125, 125);
            font-size: 15px;
            outline: none;
        }
        .input-item::placeholder {
            text-transform: uppercase;
        }
        .btn {
            text-align: center;
            padding: 10px;
            width: 100%;
            margin-top: 40px;
            background-image: linear-gradient(to left, #a8edea, #fed6e3);
            color: #fff;
        }
        a {
            text-decoration-line: none;
            color: #abc1ee;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="login-wrapper">
        <div class="header">Login</div>
        <form class="form-wrapper" onsubmit="return check()">
            <input type="text" name="username" placeholder="username" class="input-item" required>
            <input type="password" name="password" placeholder="password" class="input-item" required id="password">
            <input type="email" name="email" placeholder="email" class="input-item" required>
            <input type="date" name="Birthdays" placeholder="Birthdays" class="input-item" required>
            <input class="btn"  value="Login" type="submit">
        </form>
    </div>
</div>
</body>
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
</html>

