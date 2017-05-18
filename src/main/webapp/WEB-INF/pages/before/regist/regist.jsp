<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/2
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户注册表单</title>
    <link rel="stylesheet" media="screen" href="/staticfile/css/registlogincss/zzsc.css" />
</head>
<%--<script src="/adsense.js" type="text/javascript"></script>--%>

<body>
<form id="msform" method="post"  action="/regist.action">
    <!-- progressbar -->
    <ul id="progressbar">
        <li class="active">注册用户</li>
        <li>个人信息</li>
        <li>联系信息</li>
    </ul>
    <!-- fieldsets -->
    <fieldset>
        <h2 class="fs-title">注册用户</h2>
        <h3 class="fs-subtitle">第一步</h3>
        <h2 class="fs-title" style="color: crimson">${msg==""?"":msg}</h2>
        <input type="text" name="userName" placeholder="用户名" />
        <input type="password" name="password" placeholder="密码" />
        <input type="password" name="password2" placeholder="确认密码" />

        <input type="button" name="next" class="next action-button" value="下一页" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">个人信息</h2>
        <h3 class="fs-subtitle">第二步</h3>
        <input type="text" name="realName" placeholder="真实姓名" />
        <input type="text" name="cardNo" placeholder="身份证号码" />

        <input type="button" name="previous" class="previous action-button" value="上一页" />
        <input type="button" name="next" class="next action-button" value="下一页" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">联系信息</h2>
        <h3 class="fs-subtitle">第三步</h3>
        <input type="text" name="telephone" placeholder="电话号码" />
        <input type="text" name="email" placeholder="邮箱" />
        <input type="button" name="previous" class="previous action-button" value="上一页" />
        <input type="submit" class="action-button" value="提交">
    </fieldset>
</form>


<script src="/staticfile/js/login/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="/staticfile/js/login/jquery.easing.min.js" type="text/javascript"></script>

<script src="/staticfile/js/login/zzsc.js" type="text/javascript"></script>
</body>
</html>
