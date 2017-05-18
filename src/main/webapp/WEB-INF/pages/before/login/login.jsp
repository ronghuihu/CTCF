<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/2
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="../../base.jsp" %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户登录表单</title>
    <link rel="stylesheet" media="screen" href="/staticfile/css/registlogincss/dlsc.css" />
</head>
<%--<script src="/adsense.js" type="text/javascript"></script>--%>
<body>
<form id="msform" method="post" action="/login.action">
    <fieldset>
       <h1>欢迎登录</h1>
        <h3 style="color: crimson">${msg==""?"":msg}</h3>
        <input type="text" name="userName" placeholder="用户名" />
        <input type="password" name="password" placeholder="密码" />
        <input type="submit" class="action-button" value="提交">
    </fieldset>

</form>
<script src="/staticfile/js/login/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="/staticfile/js/login/jquery.easing.min.js" type="text/javascript"></script>
<script src="/staticfile/js/login/zzsc.js" type="text/javascript"></script>
</body>
</html>
