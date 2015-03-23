<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html {width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
		#allmap{width:100%;height:500px;}
		p{margin-left:5px; font-size:14px;}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=F7rDQn4ZGK4HiuF7nB0GU56j"></script>
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<title>给多个点添加信息窗口</title>
</head>
<body>
	<div id="allmap" style="width: 800px;height: 400px"></div>
	<p>点击标注点，可查看由纯文本构成的简单型信息窗口</p>

<script type="text/javascript">
	// 百度地图API功能	
	map = new BMap.Map("allmap",{
		enableMapClick : false
	});
	map.centerAndZoom(new BMap.Point(113.266544,23.149774), 15);
	map.enableScrollWheelZoom(); //启用滚轮放大缩
	var bdary = new BMap.Boundary();
	
	
	var data_info = [[113.266544,23.149774,"<font style='font-size: 14px'>广州市   汇总信息:<br/>办公类物业数量:322<br/>营业厅物业数量:322<br/>仓库数量:219</font>"],
					 [113.128565,23.03914,"地址：佛山市"],
					 [115.382234,22.796277,"地址：汕尾市"],
					 [113.399925,22.529475,"地址：中山市"],
					 [110.930088,21.676523,"地址：茂名市"],
					 [110.364371,21.284759,"地址：湛江市"],
					 [111.987932,21.876297,"地址：阳江市"]
					];
	var opts = {
				width : 150,     // 信息窗口宽度
				height: 90,     // 信息窗口高度
		
				enableMessage:false//设置允许信息窗发送短息
			   };
	for(var i=0;i<data_info.length;i++){
		var marker = new BMap.Marker(new BMap.Point(data_info[i][0],data_info[i][1]));  // 创建标注
		var content = data_info[i][2];
		map.addOverlay(marker);               // 将标注添加到地图中
		addClickHandler(content,marker);
	}
	function addClickHandler(content,marker){
		marker.addEventListener("mouseover",function(e){
			openInfo(content,e)}
		);
		marker.addEventListener("mouseout",function(e){
			map.closeInfoWindow();
			}
		);
	}
	function openInfo(content,e){
		var p = e.target;
		var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
		var infoWindow = new BMap.InfoWindow(content,opts);  // 创建信息窗口对象 
		map.openInfoWindow(infoWindow,point); //开启信息窗口
	}
	bdary.get("广东", function(rs) { //获取行政区域
	
		var ply = new BMap.Polygon(rs.boundaries[0], {
			strokeWeight : 2,
			strokeColor : "#ff0000",
			strokeOpacity : 1,
			fillOpacity : 0,
			fillColor : ""
		}); //建立多边形覆盖物
		map.addOverlay(ply); //添加覆盖物
		map.setViewport(ply.getPath()); //调整视野            
		map.setDefaultCursor("default");   //设置地图默认的鼠标指针样式
		map.setMinZoom(7);
	});
</script>
</body>
</html>
