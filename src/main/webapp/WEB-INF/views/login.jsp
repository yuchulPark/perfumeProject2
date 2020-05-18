<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="layoutTag" tagdir="/WEB-INF/tags"%>

<layoutTag:layout>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
	h2{
		text-align:center;
	}
</style>
<script type="text/javascript">
	$(function(){
		$(".join").click(function(){
			location.href = "/joinForm.do"
		})
	})
</script>
</head>
<body>
	<h2>로그인</h2>
	<br>
	<form class="form-horizontal" action="/login.do" method="post">
		<div class="form-group">
			<label class="control-label col-sm-4" for="id">아이디 : </label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="id" placeholder="아이디를 입력해주세요.">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-4" for="pwd">비밀번호 : </label>
			<div class="col-sm-4">
				<input type="password" class="form-control" id="pwd" placeholder="비밀번호를 입력해주세요.">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-4">
				<div class="checkbox">
					<label><input type="checkbox">아이디 기억하기</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-4">
				<button type="submit" class="btn btn-default">로그인</button>
				<button type="button" class="btn btn-default" class="join">회원가입</button>
			</div>
		</div>
	</form>
</body>
</html>

</layoutTag:layout>