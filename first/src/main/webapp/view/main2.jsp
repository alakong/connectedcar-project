<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>

<title>WebView</title>

<style>
body{
background-color: rgb(47, 60, 81);
}

#a{

height:1cm;
}

</style>
</head>



<body>
<nav>
 <div id="a"><a class="nav-link" href="status.do"> 상태
            <i class="fa fa-fw fa-dashboard"></i>
            <span class="nav-link-text"></span>
          </a>
          
          
          <a class="nav-link" href="map.do">관리자
            <i class="fa fa-fw fa-area-chart"></i>
            <span class="nav-link-text"></span>
          </a>
          </div>
          
</nav>
<header></header>
<section>

      <!-- 자동차 상태정보 시작-->
			<div>
				<c:choose>
					<c:when test="${center == null }">
						<jsp:include page="center.jsp"></jsp:include>
					</c:when>
					<c:otherwise>
						<jsp:include page="${center}.jsp"></jsp:include>
					</c:otherwise>
				</c:choose>
			</div>
			

</section>
<footer></footer>

</body>
</html>