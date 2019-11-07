<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>LOGIN</title>
<link href="css.css" rel="stylesheet" type="text/css" />
<script>
	function abc(){
		alert("Please enter the correct account and password!");
	}
	</script>
</head>
<body>
<table width="100%" height="70" border="0" id="nav" bgcolor="#000000">
  <tr>
    <td><img src="image/logo.jpg" height="40" /></td>
	<td><font size="5" color="#FFFFFF"><b>BAT TECH.</b></font></td>
    <td><a href="index.jsp">HOME</a></td>
    <td><a href="register.jsp">REGISTER</a></td>
    <td><a href="login.jsp">LOG IN</a></td>
  </tr>
</table>
<table width="1000" border="0" id="spxq">
  <tr>
       <td>Sign In<hr></td>
  </tr>
  <tr>
    <td><img src="image/denglu.jpg" align="left"><br> <br>
    <form name="loginForm" action="login" method="post">
	<h3>Account：<input type="text" name="username"/></h3><br>
	<h3>Password：<input name="password" type="password" /></h3><br>
	<h3><input type="submit" name="submit" value="Log In"></h3>
	</form>
	</td>
  </tr>
</table>
<table width="100%"  border="0" id="foot">
    <tr>
    <td >Copyright © 2018 CY & MYM rights reserved.</td>
  </tr>
</table>
</body>
</html>