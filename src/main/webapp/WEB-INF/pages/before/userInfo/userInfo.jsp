<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html>
<head>
<title>个人户主页</title>
<link href="../../staticfile/css/userInfo/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../../staticfile/js/userInfo/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="../../staticfile/css/userInfo/style.css"   rel='stylesheet' type='text/css' />
 <!-- Custom Theme files -->
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <meta name="keywords" content="Preface Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<!-- webfonts -->
	<link href='//fonts.googleapis.com/css?family=Asap:400,700,400italic' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600' rel='stylesheet' type='text/css'>
<!-- webfonts -->
 <!---- start-smoth-scrolling---->
<script type="text/javascript" src="../../staticfile/js/userInfo/move-top.js"></script>
<script type="text/javascript" src="../../staticfile/js/userInfo/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
</head>
	<body>
		<!-- container -->
			<!-- header -->
			<div id="home" class="header">
				<div class="container">
				<!-- top-hedader -->
				<div class="top-header">
					<!-- /logo -->
					<!--top-nav---->
					<div class="top-nav">
					<div class="navigation">
					<div class="logo">
						<h1><a href="index.html"><span>P</span>REFACE</a></h1>
					</div>
					<div class="navigation-right">
						<span class="menu"><img src="images/menu.png" alt=" " /></span>
						<nav class="link-effect-3" id="link-effect-3">
							<ul class="nav1 nav nav-wil">
								<li class="active"><a href="index.html">个人主页</a></li>
								<li><a class="scroll" href="#about">城市文化</a></li>
								<li><a class="scroll" href="#" onclick="window.history.go(-1);this.blur();" >返回上级</a></li>
							</ul>
						</nav>
							<!-- script-for-menu -->
								<script>
								   $( "span.menu" ).click(function() {
									 $( "ul.nav1" ).slideToggle( 300, function() {
									 // Animation complete.
									  });
									 });
								</script>
							<!-- /script-for-menu -->
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- /top-hedader -->
				</div>
			<div class="banner-info">
				<div class="col-md-7 header-right">
					<h1>Hi !</h1>
					<h6>尊敬的文化守护者</h6>
					<form action="updateUser.action">
							<ul class="address">
						<li>
							<ul class="address-text">
								<li><b>用户名</b></li>
								<li><input type="text" name="name" value="${user.userName}" style="color: black;width:200px"/></li>
							</ul>
						</li>
						<li>
							<ul class="address-text">
								<li><b>真实姓名</b></li>
								<li><input type="text" name="username" value="${user.realName}" style="color: black;width:200px"/></li>
							</ul>
						</li>
						<li>
							<ul class="address-text">
								<li><b>PHONE</b></li>
								<li><input type="text" name="telephone" value="${user.telephone}" style="color: black;width:300px"/></li>
							</ul>
						</li>
						<li>
							<ul class="address-text">
								<li><b>E-MAIL </b></li>
								<li><input type="text" name="email" value="${user.email}" style="color: black;width:300px"/></li>
							</ul>
						</li>
						<li>
							<button type="button" class="button black" name="submit">提交</button>
						</li>
					</ul>
				</form>
					
				</div>
				<div class="col-md-5 header-left">
					<img src="../../staticfile/images/userInfo/ceshi.jpg">
				</div>
				<div class="clearfix"> </div>
						
		      </div>
			</div>
		</div>
	</div>
	</body>
</html>