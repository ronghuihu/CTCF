<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>文化展示</title>
<link rel="stylesheet" href="/staticfile/css/module/reset.css" media="screen" />
<link rel="stylesheet" href="/staticfile/css/module/style.css" media="screen" />
<link rel="stylesheet" href="/staticfile/css/module/css3_3d.css" media="screen" />
<script type="text/javascript" src="/staticfile/js/modules/jquery.min.js"></script>
<script type="text/javascript" src="/staticfile/js/modules/modernizr.js"></script>
<script>

if (!Modernizr.csstransforms) {
	$(document).ready(function(){
		$(".close").text("Back to top");
	});
}

</script>
</head>

<body style="background-image:url( /staticfile/images/module/back-ground.jpg);background-repeat: no-repeat" >
	<%@include file="/WEB-INF/pages/before/head/_head.jsp" %>
<div id="container">
	<!--[if lte IE 8]>
	<noscript>
		<style>
			#information li { overflow: visible; position: relative; margin: 0 auto; margin-bottom: 25px; background: #fff; width: 600px; padding: 30px; height: auto; list-style: none; }
			#information li div a.close { position: relative; background: transparent; padding: 0; color: #0090e2; font-size: 12px; font-weight: normal; left: 0; top: 0; }
			iframe, .backface { display: none; }

		</style>
	</noscript>
	<![endif]-->

	<div style="text-align:center;clear:both">
		<!--<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
        <script src="/follow.js" type="text/javascript"></script>-->
	</div>
	<script src="/adsense.js" type="text/javascript"></script>
	<ul id="grid" class="group">
		<c:forEach items="${culturalList}" var="cult">
			<li>
				<div class="details">
					<h3>${cult.culturalName}</h3>
				</div>
				<a class="more" href="toCulturyInfo?cityName=${cityName}&&culturalId${c.culturalId}">
					<img src="../../../../staticfile/images/module/lanterns.jpg" /></a>
			</li>
		</c:forEach>

	</ul>
</div>
	<div style="position: fixed;bottom: 0px;text-align: center;margin-left: 700px;margin-left: 800px" >
		<p style="color: black">
			某项目峰会小组版权所有
			<br>
			网络文化经营许可证浙网文[2017]6666-666号
		</p>
	</div>
</body>

</html>