<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<style type="text/css">
body, html {
	width: 100%;
	height: 100%;
	margin: 0;
	font-family: "微软雅黑";
}

#allmap {
	width: 100%;
	height: 500px;
}

p {
	margin-left: 5px;
	font-size: 14px;
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=F7rDQn4ZGK4HiuF7nB0GU56j"></script>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<title>给多个点添加信息窗口</title>
</head>
<body>
	<div id="allmap"></div>
	<p>点击标注点，可查看由纯文本构成的简单型信息窗口</p>

	<script type="text/javascript">
		// 百度地图API功能	
		map = new BMap.Map("allmap", {
			enableMapClick : false
		});
		map.centerAndZoom("广州", 6);
		map.enableScrollWheelZoom(); //启用滚轮放大缩
		var bdary = new BMap.Boundary();
		bdary.get("广东", function(rs) { //获取行政区域
			map.clearOverlays(); //清除地图覆盖物       
			var ply = new BMap.Polygon(rs.boundaries[0], {
				strokeWeight : 2,
				strokeColor : "#ff0000",
				strokeOpacity : 1,
				fillOpacity : 0,
				fillColor : ""
			}); //建立多边形覆盖物
			map.addOverlay(ply); //添加覆盖物
			map.setViewport(ply.getPath()); //调整视野            
			map.setMinZoom(7);
		});
		
		function showInfo(e){
				alert(e.point.lng + ", " + e.point.lat);
				alert(map.getZoom());
			}
		  
			map.addEventListener("click", showInfo);
	</script>
</body>
</html>

