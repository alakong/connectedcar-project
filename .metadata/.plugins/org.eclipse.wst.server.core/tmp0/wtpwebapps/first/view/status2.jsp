<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>

.carinfo{
font-weight:500;
font-size:15px;
color: #aebbd0;
/* letter-spacing:2px; */
}

.chartcon{
float: left; width: 40%;height:3cm;
margin-left:10px;

}
.chartinfo{
padding-top:43px;
padding-right:25px;
width: 40%;
float:right;
text-align:right;
font-size:17px;

}
.distance{

width:44.4%;
height:3cm;
margin-left:0px;
margin-right:0.3cm;
float:left;
background-color:#384861;
height:3cm;
}
.infotitle{
color:#bec9da;
}
.infocon{
padding-right:0.5cm;
margin-top:0.8cm;
text-align:right;
font-size:70px;
color: #17b7c8;
font-weight:bold;
}
.infounit{
color:#bec9da;

margin-left:0.5cm;
font-size:25px;
}
.infocon2{
color: #3abdb4;

padding-right:0.4cm;
margin-top:0.9cm;
text-align:right;
font-size:50px;

}
.infounit2{
color:#bec9da;

margin-bottom:0.5cm;
margin-left:0.3cm;
font-size:20px;

}

.first{
height:3cm;
}
.secgridone{
width:41%;
float:left;
height:70%;
}
#secgrid{
float:left;
width:56%;
margin-top:0px;
margin-left:0.3cm;
margin-right:0px;


}
.secinfo{
width:41.6%;
float:left;
}
.thirdinfo{
width:98.3%;
margin-top:0.3cm;
height:5.45cm;
}
</style>
<script async defer
   src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDKy-W18gyBXJQGDU2diCyAdo_0nzc2ze0&callback=initMap"
   type="text/javascript"></script>
<script type="text/javascript"
   src="http://beneposto.pl/jqueryrotate/js/jQueryRotateCompressed.js"></script>

<!-- 도넛 차트 넣어보기 -->
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/variable-pie.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>



<script>
function display1(data){
   var drivingchart=new 
   Highcharts.Chart( {
       chart: {
          renderTo:'driving',
           backgroundColor: 'none',
           height: (9/16 * 100) + '%', 
           spacingBottom:25,
           spacingLeft:35,

       },

       title: {
           text: '월별 주행거리',           
             margin:0,
           style: {
               
                 color:' #bec9da',
                 fontSize: "13px"
              
              }    
        
       },
       yAxis:{
          gridLineColor: 'transparent',
          title: {
                text: ""
            },
            labels: {
                format: '{value} km',
                style: {
                    color: '#bec9da'
                }
            },

       },
       xAxis: {
            lineColor: 'transparent',
            minorTickLength: 0,
             tickLength: 0,
           categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
               'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
               
               labels: {
                   style: {
                       color: '#bec9da'
                   }
               },
       },

       plotOptions: {
           series: {
               borderColor: 'transparent',
               color:'rgb(62, 197, 204)'
           }
       },

       series: [{

           data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4],
           type: 'column'
       }]

   });
}

 $(document).ready(function(){
      
      $.ajax({
            url:'chart1impl.do',
            success:function(datas){
               display1(datas);
               
              // alert('ok'+datas);
          },
            error:function(){
               alert('fail');         
            }
         });

   }); 

</script>
<script>
function display(datas){
   var gas= parseFloat(datas[0]['gas']);
   var tire= parseFloat(datas[0]['tire']);
   var engtmp=parseFloat(datas[0]['engtmp']);
   var char1=new Highcharts.Chart({
       chart: {
          renderTo: 'container',
           type: 'variablepie',
           backgroundColor: 'none',
         margin: [0,0,0,0],
      spacing: [0,0,0,0]
           
       },
       
       credits: {
            enabled: false
        },
   
        tooltip: {
            enabled: false
        },
        plotOptions: {
       
            series: {
 /*                     size:'100%', */
            
               borderColor: 'rgb(255, 255, 255,0)',
                dataLabels: {
                  enabled: false
                }
            }
        },
       title: {
           text:gas+" L",
/*          align: 'center',
 */
          verticalAlign: 'middle',
          floating: true,
          x: 0,
          y: 6,
          margin:0,
           style: {
     
              color:' #bec9da',
        
           }           
       },
       series: [{
          size: 120,
         innerSize: 78,
         pointPadding: 0,
         groupPadding: 0,
     /*   minPointSize: 10,
           zMin: 0, */
           name: 'Gas',
           data: [{
              color:'rgb(62, 197, 204,0.7)',
               name: '주유',
               y: gas,
               z: 5
           }, {
              
/*               color:'rgb(239, 241, 246,0.8)',
 */               name: '',
               y: 110-gas,
               z: 1
           }]
       }]
   });
   
   
   var char2=new Highcharts.Chart( {
       chart: {
          renderTo: 'container2',
           type: 'variablepie',
           backgroundColor: 'none',

            margin: [0,0,0,0],
         spacing: [0,0,0,0]
           
       },
       
       credits: {
            enabled: false
        },
   
        tooltip: {
           enabled: false 
        },
        plotOptions: {
            series: {
               borderColor: 'rgb(255, 255, 255,0)',
                dataLabels: {
                   enabled: false
                }
            }
        },
       title: {
           text: tire+" psi",
           align: 'center',
           verticalAlign: 'middle',
           floating: true,
           x: 0,
           y: 6,
           margin:0,
           style: {
     
              color:'#bec9da'
           }           
       },
       series: [{
          size: 120,
         innerSize: 78,
         pointPadding: 0,
         groupPadding: 0,
           name: 'tire',
           data: [{
              color:'rgb(58, 189, 180,0.7)',
               name: 'Spain',
               y: tire,
               z: 80
           }, {
              
/*               color:'rgb(239, 241, 246,0.8)',
 */               name: 'France',
               y: 45-tire,
               z: 1
           }]
       }]
   });
   
   var char3=new Highcharts.Chart( {
       chart: {
          renderTo: 'container3',
           type: 'variablepie',
           backgroundColor: 'none',

            margin: [0,0,0,0],
         spacing: [0,0,0,0]
       },
       
       credits: {
            enabled: false
        },
   
        tooltip: {
            enabled: false
        },
        plotOptions: {
            series: {
               borderColor: 'rgb(255, 255, 255,0)',
                dataLabels: {
                     enabled: false
                }
            }
        },
       title: {
          
           text: engtmp+"°C",
       /*     align: 'center', */
           verticalAlign: 'middle',
           floating: true,
           x: 0,
           y: 6,
           margin:0,
           style: {
              color:'#bec9da',              
/*               fontSize: '20px',
 */
           }           
       },
       series: [{
          size: 120,
         innerSize: 78,
         pointPadding: 0,
         groupPadding: 0,
           name: 'engtmp',
           data: [{
              color:'rgb(255, 102, 153,0.7)',
               name: 'Spain',
               y: engtmp,
               z: 80
           }, {
              
/*               color:'rgb(239, 241, 246,0.8)',
 */               name: 'France',
               y: 130-engtmp,
               z: 1
           }]
       }]
   });
}
$(document).ready(function(){
   
   $.ajax({
         url:'chart1impl.do',
         success:function(datas){
            display(datas);            
           // alert('ok'+datas);
       },
         error:function(){
            alert('fail');         
         }
      });

}); 


</script>


<script>
//지도
function initialize(input) {

   var mapOptions = {
      zoom : 15,
      center : input[0],
      mapTypeId : google.maps.MapTypeId.ROADMAP
   }
   var map = new google.maps.Map(document.getElementById('map_canvas'),
         mapOptions);
         var myLatlng = new google.maps.LatLng(input[0]); // y, x좌표값
         var marker = new google.maps.Marker({
            position : myLatlng,
            icon: 'view/images/carpin.png',
            map : map

         });
         var address= JSON.stringify(input[0]['address']);
   /*       var iwContent ='<div style="font-weight:bold;font-size: 5px;letter-spacing:-1px;">위치: '+address+'</div>'
         var infowindow = new google.maps.InfoWindow({
            content : iwContent,
            maxWidth : 300
         });
         google.maps.event.addListener(marker, 'mouseover', function() {
            infowindow.open(map, marker);
         });
         google.maps.event.addListener(marker, 'mouseout', function() {
            infowindow.close();
         }); */

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
<header></header>
<section style="padding:20px;">
                            
   <div class="mdl-grid mdl-grid--no-spacing">

      <div class="mdl-grid mdl-cell mdl-cell--9-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
<div style=" float: left; width: 27%;margin:0px;" class="mdl-grid mdl-cell mdl-cell--9-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
                <div style="width:100%;" class="mdl-cell mdl-cell--4-col-desktop mdl-cell--4-col-tablet mdl-cell--2-col-phone">
               <div style="width:100%;height:7cm;padding:0;"class="mdl-card mdl-shadow--2dp robot">
                <div style="padding:0px;height:90%;" class="mdl-card__title mdl-card--expand">
<img src="img/car2.gif" style="width:100%;height:100%;float:left;" id="image">
         </div>
              
                <div style="padding:0px;height:10%;" class="mdl-card__supporting-text">
                <div style="width:0.1cm;height:100%; background-color:#3ec5cc;float:left; margin-right:0.2cm;"></div>
                   <div style="padding-top:0.1cm;"> <%-- <span class="carinfo">ID </span> ${id} --%><span class="carinfo">  Last updated  </span> ${date}</div> 
                </div>
               
                    </div>
                </div>
                
                 
                <div style="width:100%; margin-top:0.5cm;" class="mdl-cell mdl-cell--4-col-desktop mdl-cell--4-col-tablet mdl-cell--2-col-phone">
                    <div style="background-color:rgb(62, 197, 204,0);" class="mdl-card mdl-shadow--2dp weather">
                        <div style="background-color:#384861; height:0.8cm;" class="mdl-card__title">
                            <h2 class="mdl-card__title-text"></h2>

                            <div class="mdl-layout-spacer"></div>
                            <div style="color:#bec9da;" class="mdl-card__subtitle-text">
                                <i style="color: #3ec5cc;" class="material-icons">room</i>
                               ${list}
                            </div>
                        </div>
                        <div class="mdl-card__supporting-text mdl-card--expand" id="map_canvas" style="float : left"></div>
                            
                    </div>
                </div>
                
</div>
<div  style="margin:1px; float: left; width: 72%;" class="mdl-grid mdl-cell mdl-cell--9-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
                

                <div  class=" first mdl-cell mdl-cell--3-col-desktop mdl-cell--3-col-tablet mdl-cell--2-col-phone">
                    <div  class="mdl-card mdl-shadow--2dp trending">
                       <!--  <div style="background-color: #384861;"class="mdl-card__title">
                            <h2 class="mdl-card__title-text">Trending</h2>
                        </div> -->
                        <div class="mdl-card__supporting-text" style="width:100%;height:3cm;'">
                         <div  class="chartcon" id="container"></div>
                         <div class="chartinfo" style="color:rgb(62, 197, 204);">GAS</div>
                         
                        </div>
                    </div>
                </div>
                <div class="first mdl-cell mdl-cell--3-col-desktop mdl-cell--3-col-tablet mdl-cell--2-col-phone">
                    <div class="mdl-card mdl-shadow--2dp trending">
                       <!--  <div style="background-color: #384861;"class="mdl-card__title">
                            <h2 class="mdl-card__title-text">Trending</h2>
                        </div> -->
                        <div class="mdl-card__supporting-text" style="width:100%;height:3cm;">
                         <div class="chartcon" id="container2"></div>
                                                  <div class="chartinfo" style="color:rgb(58, 189, 180);">Tire Pressure</div>
                         
                         
                        </div>
                    </div>
                </div>
                <div class="first mdl-cell mdl-cell--3-col-desktop mdl-cell--3-col-tablet mdl-cell--2-col-phone">
                    <div class="mdl-card mdl-shadow--2dp trending">
                
                        <div class="mdl-card__supporting-text" style="width:100%;height:3cm;">
                         <div class="chartcon" id="container3" ></div>
                                                  <div class="chartinfo" style="color:rgb(255, 102, 153);">Engine Temperature</div>
                         
                         
                        </div>
                    </div>
                </div>
               
      <div class="mdl-cell mdl-cell--7-col-desktop mdl-cell--7-col-tablet mdl-cell--4-col-phone" style="margin-top:0.4cm; margin-left:0px; width:100%;" id="second">

<!--                 <div style="width:100%;"class="mdl-cell mdl-cell--7-col-desktop mdl-cell--7-col-tablet mdl-cell--4-col-phone">
 -->                    <div style="width:100%; float:left; margin-right:0.5cm;  margin-bottom:0.3cm;" class="mdl-grid mdl-cell mdl-cell--3-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
                     <div  class="distance mdl-card__supporting-text" >
                     <div class="infotitle">주행가능거리</div>    <div class="infocon"> 910<span class="infounit">km</span> </div>
                     
                    </div>
                     <div  class="distance mdl-card__supporting-text">
                     <div class="infotitle">총 주행거리</div>    <div class="infocon"> 3136<span class="infounit">km</span></div>
                     
                    </div>
                    
                  
                </div>
                
                 <div style="width:100%; margin-top:0px; " class="mdl-grid mdl-cell mdl-cell--3-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
                   <div class="secgridone mdl-card mdl-shadow--2dp line-chart">
     
                        <div class="mdl-card__supporting-text">
                            <div class="line-chart__container">

                            </div>
                        </div>
                    </div >
                    
                        <div id="secgrid" class="mdl-grid mdl-cell mdl-cell--3-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
                       <div  class="secinfo distance mdl-card__supporting-text" >
                     <div class="infotitle">평균연비</div>    <div class="infocon2"> 15.4<span class="infounit2">km/L</span></div>
                     
                    </div>
                    
                    <div style="margin-right:0px;" class="secinfo distance mdl-card__supporting-text" >
                     <div class="infotitle">차내 온도</div>    <div class="infocon2">${cartemp} <span class="infounit2">°C</span> </div>
                     
                    </div>
                      <div class="thirdinfo mdl-card mdl-shadow--2dp line-chart">
     
                        <div style="padding:0px;" class="mdl-card__supporting-text">
                            
<div id="driving" style="min-width: 310px; height: 5.5cm; margin: 0 auto"></div>

                        </div>
                    
                    </div>
            </div>
</div>


            </div>
      
            
        </div>
        </div>
        </div>

</section>
<footer></footer>
</body>


</html>