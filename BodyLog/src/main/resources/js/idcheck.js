function idCheckProc() {
	var chk = document.getElementsByName("member_id")[0].title;
	if (chk == 'n') {
		alert("id 중복체크를 해주세요.");
		document.getElementsByName("member_id")[0].focus();
	}
}

function idCheck() {
	var member_id = document.getElementsByName("member_id")[0].value;
	if (member_id == null || member_id.trim() == "") {
		alert("id를 입력해 주세요.");
	} else {
		open("member/idcheck?member_id=" + member_id, "width=200, hieght=200")
	}
}