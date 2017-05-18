<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<link rel="stylesheet" href="/staticfile/css/module/head.css"/>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />

<div id="common_head" >
	<div id="line1">
		<div id="content">
			<!--如果Session为空就提示用户登录或者注册-->
			<c:if test="${empty sessionScope.loginUser}">
				<a href="/tologin" >登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="/toregist">注册</a>&nbsp;&nbsp;|&nbsp;&nbsp;
			</c:if>
			<!--如果Session中有该值就显示用户的名字和登出-->
			<c:if test="${!(empty sessionScope.loginUser.userName)}">
				<font color="black" size="3px">欢迎，</font><a href="/page.action?userId=${sessionScope.loginUser.userId}">${sessionScope.loginUser.userName}</a>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="/logout">退出</a>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a id="backWall" href="/findUserMessage.action"><font color="black" size="3px">查看个人留言&nbsp;&nbsp;|&nbsp;&nbsp;</font></a>
			</c:if>
			<a id="backUserMessage" href="/toWall.action"><font color="black" size="3px">查看所有留言</font></a>
		</div>
	</div>
</div>