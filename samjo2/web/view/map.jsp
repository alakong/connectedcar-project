<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=false&language=ko"></script>
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB1wla6lKa1zn16jlxA2McCogNqAn4zK2E&callback=initMap"
	type="text/javascript"></script>
	

<script>

	function initialize(input) {

		var mapOptions = {
			zoom : 15,
			center : input[0],
			mapTypeId : google.maps.MapTypeId.ROADMAP
		}
		var map = new google.maps.Map(document.getElementById('map_canvas'),
				mapOptions);

		for (obj in input) {

			
			
			(function(idx){
				var myLatlng = new google.maps.LatLng(input[idx]); // y, x좌표값
				var marker = new google.maps.Marker({
					position : myLatlng,
					map : map,
					title : input[0]
				});
				var infowindow = new google.maps.InfoWindow({
					content : input[idx],
					maxWidth : 300
				});
				google.maps.event.addListener(marker, 'click', function() {
					infowindow.open(map, marker);
				});
			})(obj);
			
		}
		
		

	}

	$(document).ready(function() {
		// Server에 데이터를 요청한다.
		// AJAX로
		$.ajax({
			url : 'mapimpl.do',
			dataType : 'json',
			success : function(data) {
				//alert(data);
				initialize(data);
				alert(JSON.parse(data)); 
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