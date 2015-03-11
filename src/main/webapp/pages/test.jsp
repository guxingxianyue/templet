<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no" />
<title>网站标题，控制在25个字、50个字节以内</title>
<meta name="keywords" content="关键词,5个左右,单个8汉字以内">
<meta name="description" content="网站描述，字数尽量空制在80个汉字，160个字符以内！">
<link rel="Bookmark" href="favicon.ico">
<link rel="Shortcut Icon" href="favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${ctx}/static/common/html5.js"></script>
<![endif]-->
<link href="${ctx}/static/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="${ctx}/static/h-ui/1.5.6/css/H-ui.css" rel="stylesheet"
	type="text/css" />
<link href="${ctx}/static/h-ui/1.5.6/css/style.css" rel="stylesheet"
	type="text/css" />
<!--自己的样式-->
<style type="text/css">
.cl, .clearfix {
	zoom: 1;
	background-color: #ffd100;
}

.mainnav li a {
	display: inline-block;
	padding: 0 18px;
	color: black;
}
</style>
</head>
<body>
	<div class="topnav">
		<div class="wp cl">
			<div class="l">您好，欢迎来到Hui！</div>
			<div class="r">
				<span class="r_nav">[ <a rel="nofollow"
					href="javascript:login();">登录</a>]
				</span><span class="pipe">|</span> <span class="r_nav">[ <a
					href="javascript:register();" rel="nofollow">注册</a> ]
				</span><span class="pipe">|</span><span class="r_nav"><a title="收藏"
					href="javascript:addFavorite();">收藏本站</a></span><span class="pipe">|</span><span
					class="r_nav"><a href="javascript:void(0)"
					onclick="setHome(this);" title="设为首页">设为首页</a></span>
			</div>
		</div>
	</div>
	<nav class="mainnav cl">
		<ul class="cl">
			<li><a href="#">首页</a></li>
			<li><a href="#">核心</a></li>
			<li><a href="#">扩展</a></li>
			<li><a href="#">案例</a></li>
			<li><a href="#">联系我们</a></li>
		</ul>
	</nav>
	<div class="dropDown dropDown_hover">
		<a class="dropDown_A" href="#">经过下拉菜单</a>
		<div class="dropDown-menu">
			<ul>
				<li><a href="#">菜单一</a></li>
				<li><a href="#">菜单二</a></li>
			</ul>
		</div>
	</div>
	<script type="text/javascript"
		src="${ctx}/static/jquery/jquery-1.11.2.min.js"></script>
	<script src="${ctx}/static/bootstrap/3.2.0/js/bootstrap.min.js"
		type="text/javascript"></script>

	<script type="text/javascript"
		src="${ctx}/static/h-ui/1.5.6/js/H-ui.js"></script>
</body>
</html>
