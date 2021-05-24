$(document).ready(function(){
	
	$('#signupform').on('Propertychange change keyup paste input', function(){
		
		var member_pw = $('#pw_input').val();
		var member_pw_chk = $('#passwordchk').val();
		
		// 입력한 비밀번호의 길이가 요구조건과 다를 때
		if (member_pw.length > 7 && member_pw.length < 17 || member_pw.length < 1) {
			$('.pw_input_1').css("display", "none");
		} else {
			$('.pw_input_1').css("display", "inline-block");
		}
		// 비밀번호 확인시 값이 다를 때
		if (member_pw === member_pw_chk || member_pw_chk.length < 1) {
			$('.pw_input_2').css("display", "none");
		} else {
			$('.pw_input_2').css("display", "inline-block");
		}
		// 공백 입력시 value값 리셋
		if (member_pw.trim() !== member_pw) {
			member_pw = $('#pw_input').val("");
			$('.pw_null_1').css("display", "inline-block");
		} else if (member_pw_chk.trim() !== member_pw_chk) {
			member_pw_chk = $('#passwordchk').val("");
			$('.pw_null_2').css("display", "inline-block");
		} else if (member_pw < 0 || member_pw_chk > 0) {
			$('.pw_null_1').css("display", "none");
			$('.pw_null_2').css("display", "none");
		}
		
		
		// 아이디 중복 확인
		var member_id = document.getElementById('id_input').value;
		var data = {member_id: member_id}
		
		$.ajax({
			type: "get",
			url: "/member/idcheck",
			data: data,
			success:function(result){
				if (member_id.length > 2) {
					if (result != "false") {
						$('.id_input_1').css("display", "inline-block");
						$('.id_input_2').css("display", "none");
					} else if (result == "false") {
						$('.id_input_1').css("display", "none");
						$('.id_input_2').css("display", "inline-block");
					}
				} else {
					$('.id_input_2').css("display", "none");
					$('.id_input_1').css("display", "none");
				}

			}
		});
		
		// 별명 중복 확인
		var member_nickname = document.getElementById('nickname_input').value;
		var data = {member_nickname:member_nickname}
		
		$.ajax({
			type: "get",
			url: "/member/nicknamecheck",
			data: data,
			success:function(result){
				if (member_nickname.length > 2) {
					if (result != "false") {
						$('.nickname_input_1').css("display", "inline-block");
						$('.nickname_input_2').css("display", "none");
					} else if (result == "false") {
						$('.nickname_input_1').css("display", "none");
						$('.nickname_input_2').css("display", "inline-block");
					}
				} else {
					$('.nickname_input_2').css("display", "none");
					$('.nickname_input_1').css("display", "none");
				}
			}
		});
		
		// 전화번호 중복확인
		var member_phone = document.getElementById('phone_input').value;
		var data = {member_phone:member_phone}
		
		$.ajax({
			type: "get",
			url: "/member/phonecheck",
			data: data,
			success:function(result){
				if (member_phone.length > 2) {
					if (result != "false") {
						$('.phone_input_1').css("display", "inline-block");
						$('.phone_input_2').css("display", "none");
					} else if (result == "false") {
						$('.phone_input_1').css("display", "none");
						$('.phone_input_2').css("display", "inline-block");
					}
				} else {
					$('.phone_input_2').css("display", "none");
					$('.phone_input_1').css("display", "none");
				}
			}
		});
	});
});

