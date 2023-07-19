<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 테스트</title>
</head>
<body>
	
	<h2>Ajax 테스트</h2>
	<div id="nameDiv"></div>
	<button type="button" id="btn">버튼</button>
	
	<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
	
	<script>
		$(document).ready(function() {
			
			$("#btn").on("click", function() {
			
				$.ajax({
					type:"get"
					, url:"/ajax/person"
					// , date:{"":""}
					, success:function(data) { 
						console.log(data);
						
						$("#nameDiv").text(data.name);
					
					}
					, error:function() {
						alert("에러가 발생했을 때 알려주는 함수");
					}
				})
					
			});
			
		});
	</script>

</body>
</html>