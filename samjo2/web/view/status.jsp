<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<link href="view/css/sb-admin.css" rel="stylesheet">

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script src="jQueryRotateCompressed.js"></script>
<script type="text/javascript"
	src="http://beneposto.pl/jqueryrotate/js/jQueryRotateCompressed.js"></script>


<html>
<head>
<style>
#image {
	width: 30%;
	height: 20%;
	float: left;
	margin: 10px;
}


td {
	WORD-BREAK: break-all;
	color : white;

}



</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
</head>
<body>

	<img src="img/car2.gif" id="image">

	<div class="row">
		<div class="col-lg-6">
			<div class="panel panel-default">
				<div class="panel-heading"; style="color : white">차량정보</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover">
							<tbody>
								<tr>
									<td>이름</td>
									<td>다혜</td>
								</tr>
								<tr>
									<td>ID</td>
									<td>dahyezzang</td>
								</tr>
								<tr>
									<td>차대번호</td>
									<td>#123456789</td>

								</tr>
								<tr>
									<td>차량번호</td>
									<td>25가 1548</td>
								</tr>
							</tbody>

						</table>
					</div>
					<!-- /.table-responsive -->
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
	</div>
	</body>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=false&language=ko"></script>
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB1wla6lKa1zn16jlxA2McCogNqAn4zK2E&callback=initMap"
	type="text/javascript"></script>

<h5 style="color : white">※현재위치</h5>
<script>

	function initialize(input) {

		var mapOptions = {
			zoom : 17,
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
					title : "어디어디입니다"
				});
				var infowindow = new google.maps.InfoWindow({
					content : "<h1>어디어디입니다</h1>",
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
	<div id="map_canvas" style="width: 300px; height: 300px; margin-top: 10px;float : left"></div>

</body>




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
<div id="container" style="min-width: 310px; max-width: 400px; height: 300px; margin: 10px; float : left"></div>

<!----------------------------------------------------------------------->		
<script>

function renderIcons() {

    // Move icon
    if (!this.series[0].icon) {
        this.series[0].icon = this.renderer.path(['M', -8, 0, 'L', 8, 0, 'M', 0, -8, 'L', 8, 0, 0, 8])
            .attr({
                'stroke': '#303030',
                'stroke-linecap': 'round',
                'stroke-linejoin': 'round',
                'stroke-width': 2,
                'zIndex': 10
            })
            .add(this.series[2].group);
    }
    this.series[0].icon.translate(
        this.chartWidth / 2 - 10,
        this.plotHeight / 2 - this.series[0].points[0].shapeArgs.innerR -
            (this.series[0].points[0].shapeArgs.r - this.series[0].points[0].shapeArgs.innerR) / 2
    );

    // Exercise icon
    if (!this.series[1].icon) {
        this.series[1].icon = this.renderer.path(
            ['M', -8, 0, 'L', 8, 0, 'M', 0, -8, 'L', 8, 0, 0, 8,
                'M', 8, -8, 'L', 16, 0, 8, 8]
            )
            .attr({
                'stroke': '#ffffff',
                'stroke-linecap': 'round',
                'stroke-linejoin': 'round',
                'stroke-width': 2,
                'zIndex': 10
            })
            .add(this.series[2].group);
    }
    this.series[1].icon.translate(
        this.chartWidth / 2 - 10,
        this.plotHeight / 2 - this.series[1].points[0].shapeArgs.innerR -
            (this.series[1].points[0].shapeArgs.r - this.series[1].points[0].shapeArgs.innerR) / 2
    );

    // Stand icon
    if (!this.series[2].icon) {
        this.series[2].icon = this.renderer.path(['M', 0, 8, 'L', 0, -8, 'M', -8, 0, 'L', 0, -8, 8, 0])
            .attr({
                'stroke': '#303030',
                'stroke-linecap': 'round',
                'stroke-linejoin': 'round',
                'stroke-width': 2,
                'zIndex': 10
            })
            .add(this.series[2].group);
    }

    this.series[2].icon.translate(
        this.chartWidth / 2 - 10,
        this.plotHeight / 2 - this.series[2].points[0].shapeArgs.innerR -
            (this.series[2].points[0].shapeArgs.r - this.series[2].points[0].shapeArgs.innerR) / 2
    );
}

Highcharts.chart('container', {

    chart: {
    	backgroundColor: 'none',
        type: 'solidgauge',
        height: '110%',
        events: {
            render: renderIcons
        }
    },

    title: {
        text: 'MYCarInfo',
        style: {
            fontSize: '30px',
            color:'white'
        }
    },

    tooltip: {
        borderWidth: 0,
        backgroundColor: 'none',
        shadow: false,
        style: {
            fontSize: '16px'
        },
        pointFormat: '{series.name}<br><span style="font-size:2em; color: {point.color}; font-weight: bold">{point.y}%</span>',
        positioner: function (labelWidth) {
            return {
                x: (this.chart.chartWidth - labelWidth) / 2,
                y: (this.chart.plotHeight / 2) + 15
            };
        }
    },

    pane: {
        startAngle: 0,
        endAngle: 360,
        background: [{ // Track for Move
            outerRadius: '112%',
            innerRadius: '88%',
            backgroundColor: Highcharts.Color(Highcharts.getOptions().colors[0])
                .setOpacity(0.3)
                .get(),
            borderWidth: 0
        }, { // Track for Exercise
            outerRadius: '87%',
            innerRadius: '63%',
            backgroundColor: Highcharts.Color(Highcharts.getOptions().colors[7])
                .setOpacity(0.3)
                .get(),
            borderWidth: 0
        }, { // Track for Stand
            outerRadius: '62%',
            innerRadius: '38%',
            backgroundColor: Highcharts.Color(Highcharts.getOptions().colors[2])
                .setOpacity(0.3)
                .get(),
            borderWidth: 0
        }]
    },

    yAxis: {
        min: 0,
        max: 100,
        lineWidth: 0,
        tickPositions: []
    },

    plotOptions: {
        solidgauge: {
            dataLabels: {
                enabled: false
            },
            linecap: 'round',
            stickyTracking: false,
            rounded: true
        }
    },

    series: [{
        name: '주유량',
        color : 'white',
        data: [{
            color: Highcharts.getOptions().colors[0],
            radius: '112%',
            innerRadius: '88%',
            y: 80
        }]
    }, {
        name: '평균연비',
        data: [{
            color: Highcharts.getOptions().colors[7],
            radius: '87%',
            innerRadius: '63%',
            y: 65
        }]
    }, {
        name: '타이어공기압',
        data: [{
            color: Highcharts.getOptions().colors[2],
            radius: '62%',
            innerRadius: '38%',
            y: 50
        }]
    }]
});
</script>


</html>