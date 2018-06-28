<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <script>
   
// -- Pie Chart Example
function display(){

	   var ctx = document.getElementById("myPieChart");
	   var myPieChart = new Chart(ctx, {
	     type: 'pie',
	     data: {
	       labels: ["Blue", "Red", "Yellow", "Green"],
	       datasets: [{
	         data: [12.21, 15.58, 11.25, 8.32],
	         backgroundColor: ['aqua', '#dc3545', '#ffc107', '#28a745'],
	       }],
	     },
	   });
	   display();
}
 

	/* $(document).ready(function() {
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
	}); */
	
	  </script>







