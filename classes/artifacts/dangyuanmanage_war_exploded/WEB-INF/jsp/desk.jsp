<!DOCTYPE html>
<html>

<head>

<meta charset="gbk">

<title>HTML5 3D��תͼƬ�����ʾ��ַ1</title>

<style>
@import url(http://fonts.googleapis.com/css?family=Anaheim);

* {
	margin: 0;
	padding: 0;
	outline: none;
	border: none;
	box-sizing: border-box;
}

*:before,*:after {
	box-sizing: border-box;
}

html,body {
	min-height: 100%;
}

body {
	background-image: radial-gradient(mintcream 0%, lightgray 100%);
}

h1 {
	display: table;
	margin: 5% auto 0;
	text-transform: uppercase;
	font-family: 'Anaheim', sans-serif;
	font-size: 4em;
	font-weight: 400;
	text-shadow: 0 1px white, 0 2px black;
}

.container {
	margin: 4% auto;
	width: 210px;
	height: 140px;
	position: relative;
	perspective: 1000;
}

#wjq {
	text-align: center;
}

#carousel {
	width: 100%;
	height: 100%;
	position: absolute;
	transform-style: preserve-3d;
	animation: rotation 20s infinite linear;
}

#carousel:hover {
	animation-play-state: paused;
}

#carousel figure {
	display: block;
	position: absolute;
	width: 186px;
	height: 116px;
	left: 10px;
	top: 10px;
	background: black;
	overflow: hidden;
	border: solid 5px black;
}

#carousel figure:nth-child(1) {
	transform: rotateY(0deg) translateZ(288px);
}

#carousel figure:nth-child(2) {
	transform: rotateY(40deg) translateZ(288px);
}

#carousel figure:nth-child(3) {
	transform: rotateY(80deg) translateZ(288px);
}

#carousel figure:nth-child(4) {
	transform: rotateY(120deg) translateZ(288px);
}

#carousel figure:nth-child(5) {
	transform: rotateY(160deg) translateZ(288px);
}

#carousel figure:nth-child(6) {
	transform: rotateY(200deg) translateZ(288px);
}

#carousel figure:nth-child(7) {
	transform: rotateY(240deg) translateZ(288px);
}

#carousel figure:nth-child(8) {
	transform: rotateY(280deg) translateZ(288px);
}

#carousel figure:nth-child(9) {
	transform: rotateY(320deg) translateZ(288px);
}

img {
	-webkit-filter: grayscale(1);
	cursor: pointer;
	transition: all .5s ease;
}

img:hover {
	-webkit-filter: grayscale(0);
	transform: scale(1.2, 1.2);
}

@
keyframes rotation {from { transform:rotateY(0deg);
	
}

to {
	transform: rotateY(360deg);
}
}
body{
  font-family: "����ϸ��";
  background:url("../img/123456.jpg") no-repeat;
  background-size: 100%;
}
</style>

<script src="js/prefixfree.min.js"></script>

</head>

<body>
	<div style=" text-align:center;">
		<font color="red" size="12px">ѧԺ����ϵͳ1</font>
	</div>


	<script src='js/none.js'></script>

	<script src="js/index.js"></script>
	<div style="text-align:center;clear:both">
		<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
		<script src="/follow.js" type="text/javascript"></script>
	</div>
</body>

</html>