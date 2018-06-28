<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=false&language=ko"></script> 
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDKy-W18gyBXJQGDU2diCyAdo_0nzc2ze0&callback=initMap"
	type="text/javascript"></script>
	

<script>

	function initialize(input) {

		var mapOptions = {
			zoom : 10,
			center : input[0],
			mapTypeId : google.maps.MapTypeId.ROADMAP
		}
		var map = new google.maps.Map(document.getElementById('map_canvas'),
				mapOptions);
		
		
		

		for (i in input) {
			(function(i){
				var myLatlng = new google.maps.LatLng(input[i]); // y, x좌표값
				var address= JSON.stringify(input[i]['address']);
				var content1 = JSON.stringify(input[i]['dLevel']);
				var content2 = JSON.stringify(input[i]['dTime']);
				var iwContent ='<div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">주소 '+address+'</div>'
					+'<div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">위험도 레벨: '+content1+'</div><div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">위험 시간: '+content2+'</div>'
				var marker = new google.maps.Marker({
					position : myLatlng,
					map : map,
					//icon: 'http://127.0.0.1/first/img/pin3.png'
				});
				var infowindow = new google.maps.InfoWindow({
					content : iwContent,
					maxWidth : 300
				});
				google.maps.event.addListener(marker, 'click', function() {
					infowindow.open(map, marker);
				});
				google.maps.event.addListener(marker, 'mouseout', function() {
					infowindow.close();
				});
			})(i);
		}
	}

	$(document).ready(function() {
		// Server에 데이터를 요청한다.
		// AJAX로
		
	
		
	$.ajax({
	url : 'mapimpl.do',
	dataType : 'json',
	success : function(data) {
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
	<!-- 지도를 출력할 영역에 아래 소스 삽입! -->
	<div id="map_canvas" style="width: 700px; height: 600px;"></div>

</body>
</html>


<!-- /* 	var myFunc = [];
		
		for( var i = 0 ;i <3 ; i++){
			(function(data){
				myFunc[i] = function(){
					alert(data);
			}
			})(i);
		}
		
		myFunc[0](); */
		
		
// 		var myFunc = [];
		
// 		for( var i = 0 ;i <3 ; i++){
			
// 			myFunc[i] = function(){
// 					alert(i);
// 			};
// 		}
		
// 		myFunc[0](); -->