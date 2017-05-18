<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>浙江</title>
</head>
<body style="background: url('/staticfile/images/map/zheujiang/cj03.jpg');background-size: cover">
<div style="background-color: slategray">
    <%@include file="/WEB-INF/pages/before/head/_head.jsp" %>
</div>
	 <div id="zj" style="height:800%"></div>
      <script type="text/javascript" src="/staticfile/js/maps/echarts.js"></script>
       <script type="text/javascript" src="/staticfile/js/maps/province/zhejiang.js"></script>
       <script type="text/javascript">
       var mapChart = echarts.init(document.getElementById('zj'));    
       var option = {
    		   geo: {
    		        map: '浙江',

    		        itemStyle: {					// 定义样式
    		            normal: {					// 普通状态下的样式
    		                areaColor: 'rgba(0,0,0, .4)',
    		                borderColor: '#111'
    		            },
    		            emphasis: {					// 高亮状态下的样式
    		                areaColor: '#FFC125'
    		            }
    		        }
    		    },
    			/*backgroundColor: '#404a59',*/		// 图表背景色
    			series: [
    			 		{
    			 			name: '浙江', // series名称
    			 			type: 'scatter', // series图表类型
    			 			coordinateSystem: 'geo' // series坐标系类型
    			 		}
    			 	]			
    		}
       mapChart.setOption(option);	
   	mapChart.on('click', function (params) {
   		 if(params.name=='杭州市'){
   		     /*在CityCultureController层被拦截*/
   		    window.open('/toCityCultureController.action?cityName='+encodeURIComponent(params.name));
   		} 
   	});
       </script>
     <%@include file="/WEB-INF/pages/before/foot/_foot.jsp" %>
</body>
</html>