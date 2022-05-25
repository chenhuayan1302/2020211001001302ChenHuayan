<html>
 <head>
   <title>My Web</title>
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
 <body style="margin:0px;padding:0px;font-family:helvetica;">
 <table width="100%" cellpadding="0" cellspacing="0">
   <tr>
     <td height="78" style="background-color:#788dad;
                            border-width:2px;
                            border-style:solid;
                            border-color:black;
                            padding:0px;
                            margin:0px;" valign="bottom">
      
     <img src="logo.jpg" align="left">
     </td>
   </tr>
   <tr>
     <td height="15" style="color:white;
                            background-color:#444444;
                            border-width:2px;
                            border-style:solid;
                            border-top-width:0px;
                            border-color:black;" align="center">
     <a style="color:white;" href="include.jsp">Home</a>
   - <a style="color:white;" href="login.jsp">lab2.Login</a>
   - <a style="color:white;" href="productList">Product</a>
   - <a style="color:white;" href="#">FAQ</a>
   - <a style="color:white;" href="#">About</a>
   
   </td>
   </tr>
   <tr height="25"><td align="right"><font size="18" color="blue">
   Welcome,<font size="18" color="red"> Guest</font>
   </font></td> </tr>
  <tr height="20"><td align="right">
   <br> <a href="#">Logout</a>
  <br><a href="#">My Cart</a><br/>
<a href="register.jsp">Register Here</a>
  </td></tr>
 </table>
