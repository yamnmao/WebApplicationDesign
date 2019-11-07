<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "model.Products"%>
<%@ page import = "model.Cart"%>
 <% // get the cart from the session
	// call a cart method to generate the view
	Cart cart = new Cart();
    session.setAttribute("cart", cart);
	%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CART</title>
<link href="css.css" rel="stylesheet" type="text/css" />
</head>
<body>
<table width="100%" height="70" border="0" id="nav" bgcolor="#000000">
  <tr>
    <td><img src="image/logo.jpg" height="40" /></td>
	<td><font size="5" color="#FFFFFF"><b>CN COMPUTERS</b></font></td>
    <td><a href="home.jsp">HOME</a></td>
</table>
<table width="1000" border="0" id="spxq">
  <tr><h3></h3>
    <td colspan="6">CART<hr><br></td>
  </tr>
  <tr>
    <td bgcolor="#f4f4f4">Congratulation! Your Order is submitted!</td>
  </tr>
</table>
<table width="100%"  border="0" id="foot">
    <tr>
    <td >Copyright © 2018 CY & MYM rights reserved.</td>
  </tr>
</table>
</body>
</html>