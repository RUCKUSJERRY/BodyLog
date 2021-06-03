//const boarddetail = document.getElementById("boarddetail");
//
//window.onclick = function(event) {
//	  if (event.target == boarddetail) {
//		  boarddetail.style.display = "none";
//	  }
//	}



// 우선 커뮤니티 메인을 접속하면 게시글 전체를 리스팅 해준다.
$(function(){
	
	selectCommunity();
	selectListAllBoard('전체');
		
})

// 커뮤니티 리스트 호출
function selectCommunity() {

	$.ajax({
		
		url : "/community/selectCommunity",
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success: function(data) {
			console.log(data)
			$("#comarea").replaceWith(data);
			
		},error: function(e) {
			console.log(e)
		}
		
	})
	
}



// 전체 게시판 리스트 호츌
function selectListAllBoard(comname) {

	$.ajax({
		
		url : "/community/selectListAllBoard",
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success: function(data) {
			$("#boardarea").replaceWith(data);
			$("#comname").text(comname + " ");
			$("#comname").append('<i class="fas fa-chevron-down">');
			const x = document.getElementById("comDrop");
			    x.className = x.className.replace(" w3-show", "");
			console.log(name);
			
			
			
			//console.log(data)
		},error: function(e) {
			console.log(e)
		}
		
	})
}

// 1개 게시판 리스트 호출
function selectListBoard(com_num, comname) {

	$.ajax({
		
		url : "/community/selectListBoard?com_num="+com_num,
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success:function(data) {
			console.log(data)
			$("#boardarea").replaceWith(data);
			$("#comname").text(comname + " ");
			$("#comname").append('<i class="fas fa-chevron-down">');
			const x = document.getElementById("comDrop");
		    x.className = x.className.replace(" w3-show", "");
			
		},error: function(e) {
			console.log(e)
		}
		
	})
	
}

// 1개 게시글 호출
function selectOneBoard(board_num) {

	$.ajax({
		
		url : "/community/selectOneBoard?board_num="+board_num,
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success:function(data) {
			
			$("#boarddetail").replaceWith(data);
			document.getElementById('boarddetail').style.display='block';
			console.log(data)
		},error: function(e) {
			console.log(e)
		}
		
	})
}

// 게시글 생성
function insertBoard(board_num) {
	
    $.ajax({
		
		url : "/community/insertBoard?board_num="+board_num,
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success:function(data) {
			$("#boarddetail").replaceWith(data);
			console.log(data)
		},error: function(e) {
			console.log(e)
		}
		
	})
	
	
}


// 게시글 수정 모달
function updateBoard(board_num) {
	$.ajax({
		
		url : "/community/updateBoard?board_num="+board_num,
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success:function(data) {
			$("#boardupdate").replaceWith(data);
			console.log(data)
		},error: function(e) {
			console.log(e)
		}
		
	})
}

// 게시글 수정 제출
function updateBoardRes() {
	
	function getParameterValues() {
		
		const board_num = $("#update_board_num").val();
		const com_num = $("#update_com_num").val();
		const member_num = $("#update_member_num").val();
		const board_title = $("#update_board_title").val();
		const member_nickname = $("#update_member_nickname").val(); 
		const member_id = $("#update_member_id").val();
		const board_content = $("#update_board_content").val(); 
		const board_date = $("#update_board_date").val();
		
		
		return "?board_num="+board_num+
			   "&com_num="+com_num+
			   "&member_num="+member_num+
			   "&board_title="+board_title+
			   "&member_nickname="+member_nickname+
			   "&member_id="+member_id+
			   "&board_content="+board_content+
			   "&board_date="+board_date
			   
	}
	
	
	
	$.ajax({
		
		url : "/community/updateBoardRes"+getParameterValues(),
		contentType: "application/json; charset=utf-8",
		method : "POST",
		success:function(data) {
			alert("수정완료")
			$("#boarddetail").replaceWith(data);
			console.log(data)
		},error: function(e) {
			alert("수정실패")
			console.log(e)
		}
		
	})		
}




// 게시글 삭제
function deleteBoard(board_num) {
	
	
	
}


// ------------------------------------------------------------
function comDrop() {
	  const x = document.getElementById("comDrop");
	  if (x.className.indexOf("w3-show") == -1) { 
	    x.className += " w3-show";
	  } else {
	    x.className = x.className.replace(" w3-show", "");
	  }
	}

function boarddetailDrop() {
	  const x = document.getElementById("boarddetailDrop");
	  if (x.className.indexOf("w3-show") == -1) { 
	    x.className += " w3-show";
	  } else {
	    x.className = x.className.replace(" w3-show", "");
	  }
	}	


	



