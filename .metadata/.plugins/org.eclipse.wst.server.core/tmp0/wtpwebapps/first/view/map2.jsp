<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="initial-scale=1.0" />

<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=false&language=ko"></script>
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDKy-W18gyBXJQGDU2diCyAdo_0nzc2ze0&callback=initMap"
	type="text/javascript"></script>


<script>
var markers = [];
	var posList = [];
	 var map;

	function drawMarker(s_marker){
		
	}
	function initMap(input) {

		var mapOptions = {
			zoom : 17,
			center : input[0],
			mapTypeId : google.maps.MapTypeId.ROADMAP
		}
		map = new google.maps.Map(document.getElementById('map_canvas'),
				mapOptions);

		for (i in input) {
			(function(i) {
				var myLatlng = new google.maps.LatLng(input[i]); // y, x좌표값
				var address = JSON.stringify(input[i]['address']);
				address.replace("\"", "");//큰따옴표 제거
				var content1 = JSON.stringify(input[i]['dLevel']);
				var content2 = JSON.stringify(input[i]['dTime']);
				var iwContent = '<div class="tip" ><div class="tiptitle"; style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">'
						+ address
						+ '</div><div class="tipcontent">'
						+ '<div style="text-align:left;font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">위험도 레벨: '
						+ content1
						+ '</div><div style="text-align:left;font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">위험 시간: '
						+ content2 + '</div></div></div>'
					
						
						
			 var infowindow= new google.maps.InfoWindow({
					content : iwContent,
					maxWidth : 300
				}); 
			 
			 var marker = new google.maps.Marker({
					position : myLatlng,
					map : map,
					  infowindow: infowindow,
				icon:'view/images/redpin.png'
				});
			 markers.push(marker);
			 
				google.maps.event.addListener(marker, 'click', function() {
// 					drawMarker(marker)
					 
					markers.forEach(function(marker) {
					     marker.infowindow.close(map, marker);
					  }); 
					marker.infowindow.open(map, marker);
					map.panTo(myLatlng);
				});
				google.maps.event.addListener(marker, 'center_changed', function() {
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
				var table = $('<div style="height: 500px;overflow-y: scroll;"><table class="table"></table></div>')	
				var markerList = $('#markerList').append(table);
				for(idx in data){
// 				
					var tr = $('<tr></tr>')
					var td = $('<td></td>')
					var di = $('<div class="list" ></div>')
					di.attr('id','addrdiv_'+idx)
					table.append(tr)
					tr.append(td)
					td.append(di)
					di.html('<div class="chg" id="chg_'+idx+'"></div><div class="listcol"><div class="address">'+ data[idx].address +'</div><div class="row">위도:'+data[idx].lat+'&nbsp&nbsp경도:'+data[idx].lng+'</div>'
							+'<div class="row">위험도 레벨:&nbsp'+data[idx].dLevel+'</div><div class="row">위험 시간:&nbsp'+data[idx].dTime+'</div></div>');

					(function(i){	
					var address2 = JSON.stringify( data[i].address);
					var content12 =  data[i].dLevel;
					var content22 = JSON.stringify(data[i]['dTime']);
												
						$(document).on("click","#addrdiv_"+idx,function(){

							for(j in data){/* 하나 클릭하기 전에 나머지 배경색 리셋  */
								$('#addrdiv_'+j).css('background-color','')
								
							}
						
							$(this).css('background-color','#384861')
							

					markers.forEach(function(marker) {
				     marker.infowindow.close(map, markers[i]);
				  }); 
					markers[i].infowindow.open(map, markers[i]);
				map.panTo(new google.maps.LatLng(data[i].lat, data[i].lng));
							for(j in data){/* 하나 클릭하기 전에 나머지 배경색 리셋  */
								$('#chg_'+j).css('background-color','')
							
							}
							$("#chg_"+i).css('background-color','rgb(58, 189, 180)')
							
						});	
		
						
					
					})(idx)
				}
				initMap(data);
			},

			error : function(e) {
				alert('fail');
			}
		});
	});

</script>

<style>

.tiptitle{
 padding: 10px;
   background-color: rgb(62, 197, 204,0.7);
   color: white;
   margin: 1px;
   margin-bottom:5px;
   border-radius: 2px 2px 0 0;
}

#container {
	text-align: center;
	width:100%;
}

#map_canvas {
	float: left;
	position: relative;
	z-index: 1;
}

#markerList {
	position: relative;
	display: inline-block;
	width: 25%;
	height: 730px;
	
	background-color: rgb(47, 60, 81);
	text-align: center;
	box-shadow: -3px 0px 3px #bfbfbf;
	z-index: 2;
}

.detail {

	width: 95%;
	color: rgb(62, 197, 204,0.7);
	font-size:48px;
/* 	float:right; */
	text-align:right;
	font-weight:bold;
	margin-top: 1cm;
	margin-left: 0.7cm;

	margin-bottom: 2cm;

}
.contt{

margin-bottom: 0.5cm;
margin-right:1.4cm;

}
.listcol{
padding-top:0.1cm;
width:98%;
/* margin-left:0.7cm;
 */ 
 float:left;
 text-align: right;
}

.table {
    text-align: right;
/*     width:80%;
 */    margin-left:0.7cm;
	margin-right: 0.2cm;
}
.row{

padding-right: 0.05cm;
margin:0px;
font-size:11px;
height:0.35cm;
}

.list {

 	width: 6.8cm;
     height: 1.8cm;
	color: #bec9da;
	font-size: 15px;
	letter-spacing: -1px;
	border: none;
	background-color: transparent;
	margin-top: 0.2cm;
	margin-left: 0.7cm;
	margin-right:0.2cm;
	float: center;
 text-align: left;
}

.address{
color:rgb(62, 197, 204,0.7);
font-size:15px;
font-weight:bold;
}
.chg{
float:left;
width:0.9%;
height:100%;
}


</style>

</head>

<body>

	<!-- 지도를 출력할 영역에 아래 소스 삽입! -->
	<div id="container">
		<div id="map_canvas" style="width: 75%; height: 730px;"></div>
		<div id="markerList">
		<div class="detail"> <div class="contt" >DangerArea</div>
		<div class="contt">List</div></div>
		
			
		</div>
			</div>

</body>


</html>
