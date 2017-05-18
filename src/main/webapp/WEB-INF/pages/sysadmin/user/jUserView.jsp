<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>部门列表</title>
</head>

<body>
<form name="icform" method="post">

	<div id="menubar">
		<div id="middleMenubar">
			<div id="innerMenubar">
				<div id="navMenubar">
					<ul>
						<li id="update"><a href="#" onclick="formSubmit('toUpdate','_self');this.blur();">修改</a></li>
						<li id="back"><a href="#" onclick="window.history.go(-1);this.blur();">返回</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="textbox-title">
		<img src="../../staticfile/skin/default/images/icon/id_card.png"/>
		个人信息
	</div>

	<div>

		<div class="eXtremeTable" >
			<table id="ec_table" class="tableRegion" width="98%" >
				<tr class="odd">
					<td class="tableHeader">用户名：</td>
					<td>${user.userName}</td>
					<td></td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">真实姓名：</td>
					<td>${user.realName}</td>
					<td></td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">手机号：</td>
					<td>${user.telephone}</td>
					<td></td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">身份证号</td>
					<td>${user.cardNo}</td>
				</tr>
				<tr class="odd">
					<td class="tableHeader">邮箱：</td>
					<td>${user.email}</td>
					<td></td>
				</tr>

				<tr class="odd" >
					<td class="tableHeader">备注信息:</td>
					<td colspan="3" style="height:40px">无</td>
				</tr>

			</table>
		</div>

	</div>


</form>
</body>
</html>

