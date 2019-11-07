<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT</title>
<link href="css.css" rel="stylesheet" type="text/css" />
</head>
<body>


<table width="100%" height="70" border="0" id="nav" bgcolor="#000000">
  <tr>
    <td><img src="image/logo.jpg" height="40" /></td>
	<td><font size="5" color="#FFFFFF"><b>CN COMPUTERS</b></font></td>
    <td><a href="home.jsp">HOME</a></td>
    <td><a href="about.html">ABOUT US</a></td>
    <td><a href="product.jsp">PRODUCT</a></td>
     <td><a href="index.jsp">LOG OUT</a></td>
    <td><a href="login.jsp"><img src="image/top1.png" width="22" height="22" /></a></td>
    <td><a href="cart.jsp"><img src="image/top2.png" width="23" height="23" /></a></td>
  </tr>
</table>


<table width="1000" border="1" id="bg">
  <tr>
    <td><a href="HTMLs/p4.html"><img src="image/p4.jpg" width="245" /></a></td>
    <td><a href="HTMLs/p5.html"><img src="image/p5.jpg" width="245" /></a></td>
    <td><a href="HTMLs/p6.html"><img src="image/p6.jpg" width="245" /></a></td>
  </tr>
  
 <tr>
	<form name="111" action="addcart" method="post">
    <td align="center">Xiaomi Mi Notebook Air Laptop $550.00 <input type="submit" name="buy" value="buy"> </td>
    <input name="prodID" type="hidden" value="111">
    </form>
    
    <form name="112" action="addcart" method="post">
    <td align="center">Xiaomi Mi Notebook Pro Laptop $559.00 <input type="submit" name="buy" value="buy"></td>
     <input name="prodID" type="hidden" value="112">
    </form>
    
    <form name="113" action="addcart" method="post">
    <td align="center">Google-Pixelbook 12.3" Touchcreen Chromebook  $124.00 <input type="submit" name="buy" value="buy"></td>
    <input name="prodID" type="hidden" value="113">
    </form>
    
  </tr>

</table>

<table width="1000" border="1" id="spxq">
  <tr>
    <td><a href="HTMLs/detail.html"><img src="image/car.jpg" width="245" /></a></td>
    <td><a href="HTMLs/p7.html"><img src="image/motor.jpg" width="245" /></a></td>
    <td><a href="HTMLs/wolverine-detail.html"detail><img src="image/light.jpg" width="245" /></a></td>
    <td><a href="HTMLs/keyboard-detail.html"><img src="image/knif.jpg" width="245" /></a></td>
  </tr>
    <tr>
    
     <form name="114" action="addcart" method="post">
    <td align="center">Razer Blade 15 $450.00 <input type="submit" name="buy" value="buy"></td>
    <input name="prodID" type="hidden" value="114">
    </form>
    
     <form name="115" action="addcart" method="post">
    <td align="center">Logitech G502 $59.00 <input type="submit" name="buy" value="buy"></td>
    <input name="prodID" type="hidden" value="115">
    </form>
    
     <form name="116" action="addcart" method="post">
    <td align="center">Razer Wolverine Tournament Edition  $124.00<input type="submit" name="buy" value="buy"></td>
     <input name="prodID" type="hidden" value="116">
    </form>
    
     <form name="117" action="addcart" method="post">
    <td align="center">Razer Huntsman Elite $129.00 <input type="submit" name="buy" value="buy"></td>
     <input name="prodID" type="hidden" value="117">
    </form>
    
  </tr>
</table>
<table width="100%"  border="0" id="foot">
    <tr>
    <td >Copyright © 2018 CY & MYM rights reserved.</td>
  </tr>
</table>
</body>
</html>