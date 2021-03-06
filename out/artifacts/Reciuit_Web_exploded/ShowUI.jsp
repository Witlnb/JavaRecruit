<%@ page import="com.Javarecruit.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/18
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        html,body{
            margin:0;
            height:100%;
            background-image: url("Img/蓝白背景.png");
        }
        #head{
            position: fixed;
            top: 0;
            width: 100%;
            height: 40px;
            background-color: #4d4d4f;
            z-index: 1;
        }
        .headTow{
            width: 100%;
            height: 120px;
            background-image: linear-gradient(#759bda, #abc3e3,white);
            opacity: 80%;
            position: fixed;
            top: 40px;
            z-index: 1;
        }
        .show{
            width: 350px;
            position: relative;
            top: -4px;
            left: 220px;
            z-index: 1;
            color: orange;
            filter: drop-shadow(40px 40px yellow)
        }
        .logo{
            width: 200px;
            position: relative;
            top: -10px;
            left: 200px;
            z-index: 1;
            opacity: 100%;
        }
        #shows{
            height: 20px;
            position: fixed;
            top: -37px;
            left: -90px;
            z-index: 1;
            background-color: #4d4d4f;
        }

        .searchOne{
            border-radius: 10px;
            position: fixed;
            left: 38%;
            top: 80px;
            height: 41px;
            width: 400px;
            font-size: 20px;
            color: #0a0a0a;
            z-index: 1;
            border-color: #ebf5eb;
            opacity: 50%;

        }
        .searchSm{
            position: fixed;
            width: 60px;
            height: 41px;
            top: 80px;
            left: 1100px;
            z-index: 1;
            border: none;
            background-color: #9cb4e3;
            color: #dbdbe5;
            font-size: 20px;
            border-radius: 0 10px 10px 0;
        }
        #formOne{
            position: relative;
        }
        #pictureDiv>div{
            height:600px;
        }
        #con>div{
            width: 20px;
            height: 3px;
            margin-left:10px ;
            text-align: center;
            border: 2px solid darkgray;
            background-color: darkgray;
        }
        .login{
            position: fixed;
            width: 300px;
            height: 100px;
            left: 1100px;
            z-index: 2;
        }
        b{
            width: 200px;
            position: relative;
            top: -60px;
            left: 190px;
        }
        .userHead{
            position: relative;
            top: 20px;
            left: 200px;
            width: 150px;
        }
        .ID{
            position: relative;
            top: 10px;
            left: 150px;
        }
        .formShow{
            position: absolute;
            top: 300px;
            left: 740px;
            font-size: 30px;
        }
        .submit{
            font-size: 30px;
        }
    </style>
</head>
<body class="content-body">
<div>
    <script type="text/javascript" src="JS/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="JS/TT.js"></script>
    <div class="login"><a href="ShowUI.jsp"><img src="Img/用户头像透明.png" class="userHead" alt="用户头像" title="${LoginU.uname}"></a><b>用户名:${LoginU.uname}<br><b class="ID">ID:${LoginU.uid}</b></b></div>
    <div id="head"></div>
    <div id="shows"><a href="First.html"><img src="Img/logo透明.png" class="logo"></a></div>
    <div class="headTow"><img src="Img/logo透明.png" class="logo"></div>
    <form action="UserSearServlet" method="post" id="formOne">
        <input type="text" class="searchOne" name="searchOne"  placeholder="请输入您查询的工作或公司">
        <input type="submit" class="searchSm" value="搜索">
    </form>
</div>
<form action="MuI.jsp" method="post" class="formShow">
    用户id:${LoginU.uid}
    <br>
    用户名:${LoginU.uname}
    <br>
    手机号:${LoginU.phone}
    <br>
    身份证号:${LoginU.nid}
    <br>
    邮箱地址:${LoginU.email}
    <br>
    学历:${LoginU.study}
    <br>
    工作经验:${LoginU.job}
    <br>
    现住址:${LoginU.address}
    <br>
    <input type="submit" value="修改个人信息" name="sub" class="submit">
</form>
</body>
</html>