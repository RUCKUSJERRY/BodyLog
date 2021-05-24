// 도로명주소 api 팝업
function goPopup() {
	var pop = window.open("/member/jusopopup", "pop", "width=570, height=420, scrollbars=yes");
}

function jusoCallBack(entX, entY) {
	var form = $('<form></form>');
	form.attr('action', '/map');
	form.attr('method', 'post');
	form.append('body');
	form.append($('<input type="hidden" value="'+entX+'" name=entX>'));
	form.append($('<input type="hidden" value="'+entY+'" name=entY>'));
	form.submit();
	
	pop.close();
}

function init() {
	var url = location.href;
	var confmKey = $("input[name=confmKey]").val();
	var resultType = "4";
	var inputYn = $("input[name=inputYn]").val();
	
	if (inputYn != "Y") {
		document.form.confmKey.value = confmKey;
		document.form.resultUrl.value = url;
		document.form.resultType.value = resultType;
		document.form.action = "https://www.juso.go.kr/addrlink/addrCoordUrl.do";
		document.form.submit();
	} else {
		opener.jusoCallback($("input[name=entX]")).val(), $("input[name=entY]").val();
	}
}