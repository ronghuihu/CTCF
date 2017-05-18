<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link href="../../../../staticfile/css/culturalInfo/bootstrap.css" rel='stylesheet' type='text/css' />
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="../../../../staticfile/js/culturalInfo/jquery.min.js"></script>
	<!-- Custom Theme files -->
	<link href="../../../../staticfile/css/culturalInfo/style.css" rel='stylesheet' type='text/css' />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
	<%--<%@include file="/WEB-INF/pages/before/head/_head.jsp"%>--%>
<!----- container ----->
<!----- banner ----->
<div id="home" class="banner">
	<div class="container">
		<!----- top-header ----->
		<div class="top-header">
			<!----- nav ----->
			<!----start-dropdown--->
			<script type="text/javascript">
                var $ = jQuery.noConflict();
                $(function() {
                    $('#activator').click(function(){
                        $('#box').animate({'top':'0px'},500);
                    });
                    $('#boxclose').click(function(){
                        $('#box').animate({'top':'-700px'},500);
                    });
                });
                $(document).ready(function(){
                    //Hide (Collapse) the toggle containers on load
                    $(".toggle_container").hide();
                    //Switch the "Open" and "Close" state per click then slide up/down (depending on open/close state)
                    $(".trigger").click(function(){
                        $(this).toggleClass("active").next().slideToggle("slow");
                        return false; //Prevent the browser jump to the link anchor
                    });

                });
			</script>
			<!----//End-dropdown--->
			<div class="top-nav">
				<a id="activator" href="#"><span class="nav-icon"> </span></a>
				<div class="box" id="box">
					<div class="box_content">
						<div class="box_content_center">
							<div class="form_content">
								<div class="menu_box_list">
									<ul>
										<li><a href="#home">主页</a></li>
										<li><a href="#about">文化信息</a></li>
										<li><a href="#port">人文美图</a></li>
										<li><a href="#test">评论专区</a></li>
										<li><a href="#contact">联系我们</a></li>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<c:if test="${empty sessionScope.loginUser}">
											<li style="width:80px "><a href="tologin"><button type="button" class="button blue" name="login">登录</button></a></li>
											<li style="width:80px "><a href="regist"><button type="button" class="button blue" name="regist">注册</button></a></li>
										</c:if>
										<c:if test="${!(empty sessionScope.loginUser.userName)}">
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<font color="#b6b6b6">欢迎，</font><a href="/page.action?userId=${sessionScope.loginUser.userId}" style="color: #b6b6b6">${sessionScope.loginUser.userName}</a>
											&nbsp;&nbsp;<font color="#b6b6b6">|</font>
											<a href="/findUserMessage.action" style="color: #b6b6b6">查看个人留言墙</a>
											&nbsp;&nbsp;<font color="#b6b6b6">|</font>
											<a href="/logout" style="color: #b6b6b6">登出</a>
										</c:if>
										<div class="clear"> </div>
									</ul>
								</div>
								<a class="boxclose" id="boxclose"> <label> </label></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!----- nav ----->
			<div class="clearfix"> </div>
		</div>
		<!----- top-header ----->
		<!----- banner-info ----->
		<div class="banner-info text-center">
			<h1>${cultural.remark1}</h1>
		</div>
		<!----- banner-info ----->
	</div>
<%--	<a class="mouse-down" href="#services"><span> </span></a>--%>
</div>
<!----- 文化介绍 ----->
<!----- about ----->
<div id="about" class="about">
	<div class="container">
		<div class="about-head text-center">
			<p>${cultural.remark2}</p>
		</div>
		<!---- about-time-line ----->
		<div class="about-time-grids">
			<span class="time-line"><label> </label></span>
			<div class="time-line-grid-right">
				<h4>名称由来</h4>
				<p>${cultural.remark3}</p>
			</div>
			<div class="time-line-grid-left">
				<h4>基本介绍</h4>
				<p>${cultural.remark4}</p>
			</div>
			<div class="time-line-grid-right1">
				<h4>特色文化</h4>
				<p>${cultural.remark4}</p>
			</div>
		</div>
		<!---- about-time-line ----->
	</div>
</div>
<!----- 美图展示 ----->
<!----- portfolio ------>
<div id="port" class="portfolio">
	<div class="container">
		<div class="portfolio-head text-center">
			<h2>美美哒图片 <span>/来自我们的爱</span></h2>
		</div>
	</div>
	<!----sreen-gallery-cursual---->
	<div class="sreen-gallery-cursual">
		<!-- requried-jsfiles-for owl -->
		<link href="../../../../staticfile/css/culturalInfo/owl.carousel.css" rel="stylesheet">
		<script src="../../../../staticfile/js/culturalInfo/owl.carousel.js"></script>
		<script>
            $(document).ready(function() {
                $("#owl-demo").owlCarousel({
                    items :3,
                    lazyLoad : true,
                    autoPlay : true,
                    navigation : false,
                    navigationText :  false,
                    pagination : true,
                });
            });
		</script>
		<!-- //requried-jsfiles-for owl -->
		<!-- start content_slider -->
		<div id="owl-demo" class="owl-carousel">
			<div class="item">
				<div class="item-grid">
					<div class="item-pic">
						<img src="../../../../staticfile/images/culturalInfo/xihu/1.jpg" title="dish-name" />
					</div>
					<div class="item-info">
						<h4>美丽的西湖</h4>
						<span>摘の网络</span>
					</div>
				</div>
			</div>
			<div class="item"></div>
		<!--//sreen-gallery-cursual---->
	</div>
</div>
<!----- 评论专区 ------>
<!------ testmonials ------>
<div id="test" class="testmonials">
	<div class="container">
		<div class="testmonials-head text-center">
			<h3>评论专区 <span>/在这里留下你的足迹吧</span></h3>
		</div>
		<!----- testmonials-grids ----->
		<div class="testmonials-grids text-center">
			<div class="col-md-4">
				<div class="testmonials-grid">
					<p>每一个单身男生的背后，都有一双有力持久的手。</p>
				</div>
			</div>
			<div class="col-md-4">
				<div class="testmonials-grid">
					<p>勿以洞小而不为，勿以棍小而为之。</p>
				</div>
			</div>
			<div class="col-md-4" >
					<textarea style="width: 1000px;height: 180px;" name="textarea" id="commentTextarea"></textarea>
					<input type="text" hidden="${sessionScope.loginUser.userId}" id="submitHidden" value="${sessionScope.loginUser.userId}"/>
					<button type="button" class="button black" name="submit" id="comment" >提交</button>
				<script>
					$("#comment").click(function () {
					    var userId="${sessionScope.loginUser.userId}";
					   /* alert(userId);*/
					    if(!userId){
					        alert("请先登录");
					        location.href="/tologin";
						}else {
                            var textarea=$("#commentTextarea").val();
                            if(!textarea){
                                alert("提交的内容不能为空");
                            }else {
                                location.href="toComment.action?userId=${sessionScope.loginUser.userId}&&commentContent="+textarea;
                            }
						}
                    })
				</script>
			</div>
			<div class="clearfix"> </div>
		</div>
		<!----- testmonials-grids ----->
	</div>
</div>
<!------ testmonials ------>
<!------ contact ----->
<div id="contact" class="contact">
	<div class="container">
		<div class="contact-info text-center">
			<span class="mail"> </span>
			<h2>商务洽谈?</h2>
			<span> </span>
			<a href="www.tmooc.cn">www.tmooc.cn</a>
			<h4>+666 666 666</h4>
		</div>
	</div>
</div>
<div class="clearfix"> </div>
<!------ contact ----->
<!------ footer ---->
<div class="footer">
	<div class="container">
		<div class="footer-left">
			<p>Copyright &copy; 2017 达内杭州西湖中心1703项目峰会CTCF<a target="_blank" href="www.baidu.com">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
		<div class="footer-right">
			<ul>
				<li><a href="#">facebook</a></li>
				<li><a href="#">twitter</a></li>
				<li><a href="#">google+</a></li>
				<li><a href="#">dribbble</a></li>
			</ul>
		</div>
	</div>
</div>
<!------ footer ---->
<!----- container ----->
<!---smoth-scrlling---->
<script type="text/javascript">
    $(document).ready(function(){
        $('a[href^="#"]').on('click',function (e) {
            e.preventDefault();
            var target = this.hash,
                $target = $(target);
            $('html, body').stop().animate({
                'scrollTop': $target.offset().top
            }, 1000, 'swing', function () {
                window.location.hash = target;
            });
        });
    });
</script>
<!---//smoth-scrlling---->
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>