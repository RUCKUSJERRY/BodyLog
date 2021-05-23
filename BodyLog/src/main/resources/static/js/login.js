$(function() {
	$("#loginChk").hide();
});

function login() {
	var member_id = $("#member_id").val().trim();
	var member_pw = $("#member_pw").val().trim();
	
	var loginVal = {
		member_id:member_id,
		member_pw:member_pw
	}
	if(member_id == null || member_id == "" || member_pw == null || member_pw == "") {
		alert("ID 및 Password를 확인해 주세요");
	} else {
		$.ajax({
			type:"get",
			url:"/member/loginres",
			data:loginVal,
			contentType:"application/json",
			dataType:"json",
			success:function(msg){
				if (msg.check == true) {
					location.href='/index.html';
				} else {
					$("#loginChk").show();
					$("#loginChk").html("ID 혹은 Password가 잘못되었습니다.");
				}
			},
			error:function(){
				alert("통신실패...");
			}
		});
	}
}