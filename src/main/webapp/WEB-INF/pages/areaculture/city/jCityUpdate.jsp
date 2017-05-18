<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>城市更新</title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="update"><a href="#" onclick="formSubmit('update','_self');this.blur();">更新</a></li>
	<li id="back"><a href="#" onclick="window.history.go(-1);this.blur();">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    城市更新
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<tr hidden="hidden">
		<td><input type="text" name="cityId" value="${city.cityId}" /></td>
	</tr>
	<tr class="odd">
		<td class="tableHeader">省份：</td>
		<td>
			<select name="province.provinceId" style="width: 120px">
				<option>---请选择---</option>
				<c:forEach items="${provinceList}" var="p">
					<option value="${p.provinceId}" <c:if test="${city.province.provinceId==p.provinceId}">selected="selected"</c:if>
					>${p.provinceName}</option>
				</c:forEach>
			</select>
		</td>
		<td class="tableHeader">城市：</td>
		<td><input type="text" name="cityName" value="${city.cityName}"/></td>
	</tr>
	<tr class="odd">
		<td class="tableHeader">描述：</td>
		<td>
			<textarea style="height: 120px;width: 100%" name="remark" >${city.remark}</textarea>
		</td>
	</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

