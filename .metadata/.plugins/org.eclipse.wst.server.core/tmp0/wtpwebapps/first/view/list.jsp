<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script>
new Chart(document.getElementById("doughnut-chart"), {
    type: 'doughnut',
    data: {
      labels: ["Africa", "Asia", "Europe", "Latin America", "North America"],
      datasets: [
        {
          label: "Population (millions)",
          backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"],
          data: [2478,5267,734,784,433]
        }
      ]
    },
    options: {
      title: {
        display: true,
        text: 'Predicted world population (millions) in 2050'
      }
    }
});
</script>

<title>Insert title here</title>
<style>
table{
	width:400px;
	border:2px solid black;
	text-align:center;
}
</style>
</head>
<body>
<canvas id="doughnut-chart" width="800" height="450"></canvas>


<h1>List Page</h1>
<table>
<thead>
	<tr><th>ID</th><th>NAME</th></tr>
</thead>
<tbody>
<c:forEach var="u" items="${dlist }"> 
	<tr>
	<td> ${u.lat}</td>
	<td> ${u.longi}</td>
	<td> ${u.dLevel}</td>
	<td> ${u.sp_time}</td>
	</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>







