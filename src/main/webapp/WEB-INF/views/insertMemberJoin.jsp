<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="layoutTag" tagdir="/WEB-INF/tags"%>

<layoutTag:layout>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style type="text/css">
	h2 {
		text-align: center;
	}
</style>
</head>
<body>
	<div class="container">
		<!-- 좌우측의 공간 확보 -->
		<!-- 모달창 -->
		<div class="modal fade" id="defaultModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
						<h4 class="modal-title">알림</h4>
					</div>
					<div class="modal-body">
						<p class="modal-contents"></p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
		<!--// 모달창 -->
		<h2>회원가입</h2>
		<hr />
		<!-- 본문 들어가는 부분 -->

		<form action="/loginOK.do" role="form" method="post">
			<div class="form-group" id="divId">
				<label for="divId" class="col-lg-2 control-label">아이디</label>
				<div class="col-lg-10">
					<input type="text" class="form-control onlyAlphabetAndNumber"
						id="id" data-rule-required="true"
						placeholder="15자 이내의 영문자, 언더스코어(_), 숫자만 입력 가능합니다." maxlength="15">
				</div>
			</div>
			
			<div class="form-group" id="divPassword">
				<label for="inputPassword" class="col-lg-2 control-label">비밀번호</label>
				<div class="col-lg-10">
					<input type="password" class="form-control" id="password"
						name="excludeHangul" data-rule-required="true" placeholder="15자 이내의 비밀번호를 입력해주세요."
						maxlength="15">
				</div>
			</div>
			
			<div class="form-group" id="divPasswordCheck">
				<label for="inputPasswordCheck" class="col-lg-2 control-label">패스워드
					확인</label>
				<div class="col-lg-10">
					<input type="password" class="form-control" id="passwordCheck"
						data-rule-required="true" placeholder="패스워드 확인" maxlength="30">
				</div>
			</div>
			
			<div class="form-group" id="divName">
				<label for="inputName" class="col-lg-2 control-label">이름</label>
				<div class="col-lg-10">
					<input type="text" class="form-control onlyHangul" id="name"
						data-rule-required="true" placeholder="한글만 입력 가능합니다."
						maxlength="15">
				</div>
			</div>

			<div class="form-group" id="divNickname">
				<label for="inputNickname" class="col-lg-2 control-label">별명</label>
				<div class="col-lg-10">
					<input type="text" class="form-control" id="nickname"
						data-rule-required="true" placeholder="별명" maxlength="15">
				</div>
			</div>

			<div class="form-group" id="divEmail">
				<label for="inputEmail" class="col-lg-2 control-label">이메일</label>
				<div class="col-lg-10">
					<input type="email" class="form-control" id="email"
						data-rule-required="true" placeholder="이메일" maxlength="40">
				</div>
			</div>
			
			<div class="form-group">
				<label for="inputPhoneNumber" class="col-lg-2 control-label">성별</label>
				<div class="col-lg-10">
					<select class="form-control" id="gender">
						<option value="M">남</option>
						<option value="F">여</option>
					</select>
				</div>
			</div>
			
			<div class="form-group">
				<label for="inputEmailReceiveYn" class="col-lg-2 control-label">이메일
					수신여부</label>
				<div class="col-lg-10">
					<label class="radio-inline"> <input type="radio"
						id="emailReceiveYn" name="emailReceiveYn" value="Y" checked>
						동의합니다.
					</label> <label class="radio-inline"> <input type="radio"
						id="emailReceiveYn" name="emailReceiveYn" value="N"> 동의하지
						않습니다.
					</label>
				</div>
			</div>
			
			<div class="form-group">
				<label for="inputPhoneNumber" class="col-lg-2 control-label">SMS
					수신여부</label>
				<div class="col-lg-10">
					<label class="radio-inline"> <input type="radio"
						id="smsReceiveYn" name="smsReceiveYn" value="Y" checked>
						동의합니다.
					</label> <label class="radio-inline"> <input type="radio"
						id="smsReceiveYn" name="smsReceiveYn" value="N"> 동의하지
						않습니다.
					</label>
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<button type="submit" class="btn btn-primary">Sign in</button>
				</div>
			</div>
		</form>
	</div>


		<script>
			$(function() {
				//모달을 전역변수로 선언
				var modalContents = $(".modal-contents");
				var modal = $("#defaultModal");

				$('.onlyAlphabetAndNumber').keyup(function(event) {
					if (!(event.keyCode >= 37 && event.keyCode <= 40)) {
						var inputVal = $(this).val();
						$(this).val($(this).val().replace(/[^_a-z0-9]/gi, '')); //_(underscore), 영어, 숫자만 가능
					}
				});

				$(".onlyHangul").keyup(function(event) {
					if (!(event.keyCode >= 37 && event.keyCode <= 40)) {
						var inputVal = $(this).val();
						$(this).val(inputVal.replace(/[a-z0-9]/gi, ''));
					}
				});

				$(".onlyNumber").keyup(function(event) {
					if (!(event.keyCode >= 37 && event.keyCode <= 40)) {
						var inputVal = $(this).val();
						$(this).val(inputVal.replace(/[^0-9]/gi, ''));
					}
				});

				//------- 검사하여 상태를 class에 적용
				$('#id').keyup(function(event) {

					var divId = $('#divId');

					if ($('#id').val() == "") {
						divId.removeClass("has-success");
						divId.addClass("has-error");
					} else {
						divId.removeClass("has-error");
						divId.addClass("has-success");
					}
				});

				$('#password').keyup(function(event) {

					var divPassword = $('#divPassword');

					if ($('#password').val() == "") {
						divPassword.removeClass("has-success");
						divPassword.addClass("has-error");
					} else {
						divPassword.removeClass("has-error");
						divPassword.addClass("has-success");
					}
				});

				$('#passwordCheck').keyup(function(event) {

					var passwordCheck = $('#passwordCheck').val();
					var password = $('#password').val();
					var divPasswordCheck = $('#divPasswordCheck');

					if ((passwordCheck == "") || (password != passwordCheck)) {
						divPasswordCheck.removeClass("has-success");
						divPasswordCheck.addClass("has-error");
					} else {
						divPasswordCheck.removeClass("has-error");
						divPasswordCheck.addClass("has-success");
					}
				});

				$('#name').keyup(function(event) {

					var divName = $('#divName');

					if ($.trim($('#name').val()) == "") {
						divName.removeClass("has-success");
						divName.addClass("has-error");
					} else {
						divName.removeClass("has-error");
						divName.addClass("has-success");
					}
				});

				$('#nickname').keyup(function(event) {

					var divNickname = $('#divNickname');

					if ($.trim($('#nickname').val()) == "") {
						divNickname.removeClass("has-success");
						divNickname.addClass("has-error");
					} else {
						divNickname.removeClass("has-error");
						divNickname.addClass("has-success");
					}
				});

				$('#email').keyup(function(event) {

					var divEmail = $('#divEmail');

					if ($.trim($('#email').val()) == "") {
						divEmail.removeClass("has-success");
						divEmail.addClass("has-error");
					} else {
						divEmail.removeClass("has-error");
						divEmail.addClass("has-success");
					}
				});

				//------- validation 검사
				$("form").submit(
						function(event) {
							var divId = $('#divId');
							var divPassword = $('#divPassword');
							var divPasswordCheck = $('#divPasswordCheck');
							var divName = $('#divName');
							var divNickname = $('#divNickname');
							var divEmail = $('#divEmail');
							var divPhoneNumber = $('#divPhoneNumber');

							//아이디 검사
							if ($('#id').val() == "") {
								modalContents.text("아이디를 입력하여 주시기 바랍니다.");
								modal.modal('show');

								divId.removeClass("has-success");
								divId.addClass("has-error");
								$('#id').focus();
								return false;
							} else {
								divId.removeClass("has-error");
								divId.addClass("has-success");
							}

							//패스워드 검사
							if ($('#password').val() == "") {
								modalContents.text("패스워드를 입력하여 주시기 바랍니다.");
								modal.modal('show');

								divPassword.removeClass("has-success");
								divPassword.addClass("has-error");
								$('#password').focus();
								return false;
							} else {
								divPassword.removeClass("has-error");
								divPassword.addClass("has-success");
							}

							//패스워드 확인
							if ($('#passwordCheck').val() == "") {
								modalContents.text("패스워드 확인을 입력하여 주시기 바랍니다.");
								modal.modal('show');

								divPasswordCheck.removeClass("has-success");
								divPasswordCheck.addClass("has-error");
								$('#passwordCheck').focus();
								return false;
							} else {
								divPasswordCheck.removeClass("has-error");
								divPasswordCheck.addClass("has-success");
							}

							//패스워드 비교
							if ($('#password').val() != $('#passwordCheck')
									.val()
									|| $('#passwordCheck').val() == "") {
								modalContents.text("패스워드가 일치하지 않습니다.");
								modal.modal('show');

								divPasswordCheck.removeClass("has-success");
								divPasswordCheck.addClass("has-error");
								$('#passwordCheck').focus();
								return false;
							} else {
								divPasswordCheck.removeClass("has-error");
								divPasswordCheck.addClass("has-success");
							}

							//이름
							if ($('#name').val() == "") {
								modalContents.text("이름을 입력하여 주시기 바랍니다.");
								modal.modal('show');

								divName.removeClass("has-success");
								divName.addClass("has-error");
								$('#name').focus();
								return false;
							} else {
								divName.removeClass("has-error");
								divName.addClass("has-success");
							}

							//별명
							if ($('#nickname').val() == "") {
								modalContents.text("별명을 입력하여 주시기 바랍니다.");
								modal.modal('show');

								divNickname.removeClass("has-success");
								divNickname.addClass("has-error");
								$('#nickname').focus();
								return false;
							} else {
								divNickname.removeClass("has-error");
								divNickname.addClass("has-success");
							}

							//이메일
							if ($('#email').val() == "") {
								modalContents.text("이메일을 입력하여 주시기 바랍니다.");
								modal.modal('show');

								divEmail.removeClass("has-success");
								divEmail.addClass("has-error");
								$('#email').focus();
								return false;
							} else {
								divEmail.removeClass("has-error");
								divEmail.addClass("has-success");
							}
						});
				});
		</script>
</body>
</html>

</layoutTag:layout>