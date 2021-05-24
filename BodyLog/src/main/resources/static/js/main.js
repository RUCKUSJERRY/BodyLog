$(function() {
	
	var btn = document.getElementsByName("slideItem");
	var chk = $("#footerchk").val();
	console.log(chk)
	
	for (var i = 0; i < btn.length; i++) {
		
		if (btn[i].value == chk) {
            btn[i].checked = true;
        }
	}

	
})



function getPage() {

	var btn = document.getElementsByName("slideItem");
	var chk = "";
	
	for (var i = 0; i < btn.length; i++) {		
		if (btn[i].checked) {
            chk = btn[i].value;
        }
	}
	
	location.href="/member/main?pagename="+chk;
	
}