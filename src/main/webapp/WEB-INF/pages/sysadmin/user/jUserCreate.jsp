<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>用户管理</title>
</head>

<body>
<form name="icform" method="post">

	<div id="menubar">
		<div id="middleMenubar">
			<div id="innerMenubar">
				<div id="navMenubar">
					<ul>
						<li id="save"><a href="#" onclick="formSubmit('save','_self');this.blur();">保存</a></li>
						<li id="back"><a href="#" onclick="window.history.go(-1);this.blur();">返回</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="textbox-title">
		<img src="../../staticfile/skin/default/images/icon/id_card.png"/>
		新增用户
	</div>

	<div>

		<div class="eXtremeTable" >
			<table id="ec_table" class="tableRegion" width="98%" >
				<tr class="odd">
					<td class="tableHeader">用户名：</td>
					<td>
						<input type="text" name="userName" >
					</td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">用户密码：</td>
					<td>
						<input type="text" name="password" >
					</td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">真实姓名：</td>
					<td><input type="text" name="realName" ></td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">手机号：</td>
					<td><input type="text" name="telephone"　></td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">身份证号</td>
					<td><input type="text" name="cardNo"　></td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">邮箱：</td>
					<td><input type="text" name="email" ></td>
				</tr>
				<tr>
					<td class="tableHeader">状态：</td>
					<td>
						<input type="radio" name="state" value="1" />启用
						<input type="radio" name="state" value="0" />停用
					</td>
				</tr>
			</table>
		</div>

	</div>


</form>
</body>
</html>

