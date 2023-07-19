<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 추가</title>
</head>
<body>
	
		<label>이름 </label> <input type="text" name="name" id="nameInput"> <br>
		<label>생년월일 </label> <input type="text" name="birthday" id="birthdayInput"> <br>
		<label>이메일 </label> <input type="text" name="email" id="emailInput"> <br>
		<label>자기소개 </label> <br>
		<textarea rows="5" cols="50" name="introduce" id="introduceInput"></textarea> <br>
		<button type="button" id="addBtn">추가</button>
	
	
	<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			
			$("#addBtn").on("click", function() {
				// 유효성 검사
				let name = $("nameInputInput").val();
				let birthday = $("birthdayInput").val();
				let introduce = $("introduceInput").val();
				let email = $("emailInput").val();
			
				if(name == "") {
					alert("이름을 입력하세요.");
					return;
				}
				if(birthday == "") {
					alert("생년월일을 입력해주세요")
					return;
				}
				if(introduce == "") {
					alert("자기소개를 입력해주세요")
					return;
				}
				if(email == "") {
					alert("이메일을 입력해주세요")
					return;
				}
				
				$.ajax({
					type:"get"
					, url:"/ajax/user/user"
					, data:{"name":name, "birthday":birthday, "introduce":introduce ,"email":email}
					, success:function(data) {
						
						if(data.result == "success") {
							// 리스트 페이지로 이동
							location.href = "/ajax/user/user"
						} else {
							alert("추가 실패");
						}
						
					}
					, error:function() {
						alert("에러")
					}
				});
				
			});
			
			
		});
		
	</script>
</body>
</html>