<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/3
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>留言墙</title>
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }
        body{
            font-family: '微软雅黑', sans-serif;
            font-size: 16px;
            position: relative;
            top: 0px;
            left: 0px;
            bottom: 0px;
            right: 0px;
        }
        .item {
            width: 200px;
            height: 200px;
            line-height: 30px;
            -webkit-border-bottom-left-radius: 20px 500px;
            -webkit-border-bottom-right-radius: 500px 30px;
            -webkit-border-top-right-radius: 5px 100px;
            -moz-border-bottom-left-radius: 20px 500px;
            -moz-border-bottom-right-radius: 500px 30px;
            -moz-border-top-right-radius: 5px 100px;
            box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.2);
            -webkit-box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.2);
            -moz-box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.2);
        }
        #container p{
            height: 80px;
            margin: 30px 10px;
            overflow: hidden;
            word-wrap: break-word;
            line-height: 1.5;
        }
        #container a{
            text-decoration: none;
            color: white;
            position: relative;
            left: 150px;
            coler: red;
            font-size: 14px;
        }
        #input{
            border: 0;
            border-radius: 5px;
            display:block;
            height: 30px;
            padding: 0 1em;
            line-height: 30px;
            width: 300px;
            margin: 30px auto 0px auto;
            font-size: 20px;
        }
    </style>
    <script src="/staticfile/js/messageBoard/jquery.min.js"></script>
</head>
<body  style="background-image: url('/staticfile/images/wall/qiang2.jpg');background-size:100% 100%;background-repeat:no-repeat;">
<div style="background-color: slategray">
    <%@include file="/WEB-INF/pages/before/head/_head.jsp" %>
</div>
<div>
    <div id="container">
    </div>
    <input id="input" type="text" placeholder="随便说说吧...按回车发布" />
    <div style="height: 30px"></div>
</div>
<script>
    (function ($) {
        $("#backUserMessage").hide();
        $("#backWall").children().html("查看个人留言");
        var container;

        // 可选颜色
        var colors = ['#96C2F1', '#BBE1F1', '#E3E197', '#F8B3D0', '#FFCC00'];

        //创建许愿页
        var createItem = function(text){
            var color = colors[parseInt(Math.random() * 5, 10)]
            $('<div class="item"><p>'+ text +'</p></div>').css({ 'background': color }).appendTo(container).drag();
        };

        // 定义拖拽函数
        $.fn.drag = function () {

            var $this = $(this);
            var parent = $this.parent();

            var pw = parent.width();
            var ph = parent.height();
            var thisWidth = $this.width() + parseInt($this.css('padding-left'), 10) + parseInt($this.css('padding-right'), 10);
            var thisHeight = $this.height() + parseInt($this.css('padding-top'), 10) + parseInt($this.css('padding-bottom'), 10);

            var x, y, positionX, positionY;
            var isDown = false;

            var randY = parseInt(Math.random() * (ph - thisHeight), 10);
            var randX = parseInt(Math.random() * (pw - thisWidth), 10);


            parent.css({
                "position": "relative",
                "overflow": "hidden"
            });

            $this.css({
                "cursor": "move",
                "position": "absolute"
            }).css({
                top: randY,
                left: randX
            }).mousedown(function (e) {
                parent.children().css({
                    "zIndex": "0"
                });
                $this.css({
                    "zIndex": "1"
                });
                isDown = true;
                x = e.pageX;
                y = e.pageY;
                positionX = $this.position().left;
                positionY = $this.position().top;
                return false;
            });


            $(document).mouseup(function (e) {
                isDown = false;
            }).mousemove(function (e) {
                var xPage = e.pageX;
                var moveX = positionX + xPage - x;

                var yPage = e.pageY;
                var moveY = positionY + yPage - y;

                if (isDown == true) {
                    $this.css({
                        "left": moveX,
                        "top": moveY
                    });
                } else {
                    return;
                }
                if (moveX < 0) {
                    $this.css({
                        "left": "0"
                    });
                }
                if (moveX > (pw - thisWidth)) {
                    $this.css({
                        "left": pw - thisWidth
                    });
                }
                if (moveY < 0) {
                    $this.css({
                        "top": "0"
                    });
                }
                if (moveY > (ph - thisHeight)) {
                    $this.css({
                        "top": ph - thisHeight
                    });
                }
            });
        };

        // 初始化
        var init = function () {

            container = $('#container');

            // 绑定关闭事件
            container.on('click','a',function () {
                $(this).parent().remove();
            }).height($(window).height() -126);

            var tests = ${wallContent};
            $.each(tests, function (i,v) {
                var str = v.wallContent+"-----";
                if(v.user!=null){
                    var username = v.user.userName;
                    str = str+username;
                }
                createItem(str);
            });

            // 绑定输入框
            $('#input').keydown(function (e) {
                var $this = $(this);
                if(e.keyCode == '13') {
                    var value = $this.val();
                    if(value) {
                        if(${empty sessionScope.loginUser}){
                            if(confirm("您还未登录，不能留言，是否确认登录?")){
                                location.href="/tologin.action";
                            }else {
                                return;
                            }
                        }else {
                            createItem(value);
                            $.post("/saveMessage.action", {"wallContent": value});
                            $this.val('');
                        }
                    }
                }
            });

        };

        $(function() {
            init();
        });

    })(jQuery);
</script>
</body>
</html>
