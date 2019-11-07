<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>CN COMPUTERS</title>
    <link href="css.css" rel="stylesheet" type="text/css" />
    <style>
        .main_left {
            background: #ffffff;
            width: 29px;
            height: 634px;
            position: absolute;
            /* margin: 2px 2px; */
            padding-top: 18px;
        }
        .search{
            background: #fff;
    height: 50px;
    line-height: 60px;
        }
        * {
            margin: 0;
            padding: 0;
            list-style-type: none;
        }

        .search a {
            text-decoration: none;
            color: #494949;
            font-size: 20px;
        }

        .search a:hover {
            color: #d8232a;
        }

        .main_right {
            /* background: red; */
            /* width: 79%; */
            width: 85%;
            height: auto;
            margin-top: 10px;
            float: right;
            margin-right: 100px;
            height: 100%;

        }
        .main_left a {
            text-decoration: none;
            color: #494949;
            font-size: 20px;
            padding-top: 215px;
            writing-mode: tb-rl;
        }

        .main_left a:hover {
            color: #d8232a;
        }
        .pic img {
            width: 340px;
        }

        .main {
            background: url('image/black.jpg');
            width: 100%;
            height: 652px;
            margin: 6px auto;
        }

        #StoreKey {
            margin-left: 74px;
            margin-right: 14px;
        }

        .find {
            display: block;
            position: absolute;
            background: #000000;
            float: right;
            width: 60%;
            margin: 25px 12%;
            /* margin: 25px 10%; */
        }

        #classid {
            margin-left: 85px
        }

        .lookfor ul li {
            border-bottom: 1px #ffefd8 solid;
            height: 40px;
            line-height: 40px;
            color: #fff;
        }

        .lookfor {
            padding-left: 68px;
            padding-right: 86px;
            margin-top: 50px;
            height: 273px
        }

        .lookfor ul {
            margin-top: 30px
        }

        .one {
            background: url('image/1.jpg');
            width: 245px;
        }

        .lookfor a {
            text-decoration: none;
            color: #fff;
            font-size: 20px;
        }
    </style>
    <!-- new1的css -->

</head>

<body>

    <body bgcolor="#FFFFFF">

        <table width="100%" height="70" border="0" id="nav" bgcolor="#000000">
            <tr>
                <td>
                    <img src="image/logo.jpg" height="40" />
                </td>
                <td>
                    <font size="5" color="#FFFFFF">
                        <b>CN COMPUTERS</b>
                    </font>
                </td>
                <td>
                     <td><a href="home.jsp">HOME</a></td>
                </td>
                <td>
                    <a href="about.html">ABOUT US</a>
                </td>
                <td>
                    <a href="product.jsp">PRODUCT</a>
                </td>
                 <td><a href="index.jsp">LOG OUT</a></td>
                <td>
                    <a href="login.jsp">
                        <img src="image/top1.png" width="22" height="22" />
                    </a>
                </td>
                <td>
                    <a href="cart.jsp">
                        <img src="image/top2.png" width="23" height="23" />
                    </a>
                </td>
            </tr>
        </table>
        <div class="main">
            <!-- <div class="main_left">
                <a href="###">>search by zipcode </a>
            </div> -->
            <div class="main_right">
                <div class="pic">
                    <img src="image/search1.jpg" alt="" style="	display: block; margin: 1px auto;  
                    width: 578px;
                    height: 222px;">

                </div>
                <div class="find">
                    <div class="search">
                        <a href="###">&nbsp;Search by zipcode </a>
                        <select name="classid" id="classid" size="1">
                            <option value="68" selected="selected">Country/region</option>
                            <option value="">United States</option>

                            
                            <option value="118">China</option>

                        </select>
                        <form name="locationform" action="location" method="post">
					<h4>ZipCode：<input type="text" name="zipcode"/><input type="submit" name="submit" value="Search"></h3><br>
					</form>
					<h3></h3>
                        
                        <img src="image/search.png" alt="" style="    width: 3%;
                        display: inline-block;
                        position: absolute;
                        margin-top: 21px;">

                    </div>

                    <div class="lookfor">
                        <div class="one">
                            <a href="###">upcoming new stores</a>
                        </div>
                        <ul>
                            <li>May, 2019 Beijing, China</li>
                            <li>June,2019. Houston,TX, USA</li>
                            <li>August 2019: Los Angeles，USA </li>
                            <li>Dec, 2019 Chengdu, China</li>
                            <li>March,2020 London, UK</li>
                        </ul>

                    </div>
                </div>
            </div>

        </div>

        <table width="100%" border="0" id="foot">
            <tr>
                <td>Copyright © 2018 CY & MYM rights reserved.</td>
            </tr>
        </table>
    </body>

