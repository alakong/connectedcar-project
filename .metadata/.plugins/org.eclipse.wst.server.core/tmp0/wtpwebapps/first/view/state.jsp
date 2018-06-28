<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<link href="view/css/sb-admin.css" rel="stylesheet">


<head>
<title>StatePage</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="jQueryRotateCompressed.js"></script>
<script type="text/javascript"
	src="http://beneposto.pl/jqueryrotate/js/jQueryRotateCompressed.js"></script>
<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=false&language=ko"></script>
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDKy-W18gyBXJQGDU2diCyAdo_0nzc2ze0&callback=initMap"
	type="text/javascript"></script>
	
<!-- Bootstrap core JavaScript-->
<script src="view/vendor/jquery/jquery.min.js"></script>
<script src="view/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="view/vendor/jquery-easing/jquery.easing.min.js"></script>
<!-- Page level plugin JavaScript-->
<script src="view/vendor/chart.js/Chart.min.js"></script>
<!-- Custom scripts for all pages-->
<script src="view/js/sb-admin.min.js"></script>
<!-- Custom scripts for this page-->
<script src="view/js/sb-admin-charts.js"></script>
<!-- 하이차트 스크립트 -------------------------------------------------------->
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-more.js"></script>
<script src="https://code.highcharts.com/modules/solid-gauge.js"></script>



<style>

#image {
	width: 30%;
	height: 20%;
	float: left;
	margin: 10px;
}

</style>

<script>
//지도
function initialize(input) {

	var mapOptions = {
		zoom : 50,
		center : input[0],
		mapTypeId : google.maps.MapTypeId.ROADMAP
	}
	var map = new google.maps.Map(document.getElementById('map_canvas'),
			mapOptions);
			var myLatlng = new google.maps.LatLng(input[0]); // y, x좌표값
			var marker = new google.maps.Marker({
				position : myLatlng,
				map : map

			});
			var address= JSON.stringify(input[0]['address']);
			var iwContent ='<div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">위치: '+address+'</div>'
			var infowindow = new google.maps.InfoWindow({
				content : iwContent,
				maxWidth : 300
			});
			google.maps.event.addListener(marker, 'mouseover', function() {
				infowindow.open(map, marker);
			});
			google.maps.event.addListener(marker, 'mouseout', function() {
				infowindow.close();
			});

	}



$(document).ready(function() {
	// Server에 데이터를 요청한다.
	// AJAX로
	$.ajax({
		url : 'mystate.do',
		dataType : 'json',
		success : function(data) {
			//alert(data);
			initialize(data);
		},
		error : function(e) {
			alert('fail');
		}
	});
});

</script>

</head>



<body>

	<header> <h1>State</h1></header>
	<section>
<img src="img/car2.gif" id="image">
<div id="map_canvas" style="width: 300px; height: 300px; margin-top: 10px;float : left"></div>
	
	</section>
	<footer></footer>

</body>

</html>







