function addCalendar(){
	alert("되나요....??")
	let startday = $("#log_startday").val();
	let endday = $("#log_endday").val();
	
	let log_startday = startday+"T00:00:00";
	let log_endday = endday +"T00:00:00";
	
	let log_content = $("#log_content").val();
	
	console.log(log_startday);
	console.log(log_endday);
	//var log_img = $("#log_img").val();
	
	
	
	
	
}


/*



 $(function(){
            $("#emp_search").click(function(){
                var empid= $("input[name=empid]").val();
                if(!isNaN(empid) && empid.length>2){
                    $.ajax({
                        url: "./emplist.xml",       //통신할 서버 (페이지, 파일) 주소 : ./ : 현재 나랑 같은위치에 있어서 
                        method : "get",             // get(주소창에 쿼리스트링이 보이는것) / post(안보이는것) 방식 설정 
                        async : true,               //비동기 여부 (default: true) -> false : 동기식  //화면은 그대로 데이터만 가져오고싶을때 
                        dataType : "xml",           // 통신이 성공하면 리턴받을 data의 type (text,xml,json,.....)
                        success : function(data){   // 통신에 성공했을 때 
                            var empInfo = $(data).find("EMPLOYEE_ID:contains("+empid+")").parent(); //parent가 ROW 

                            if(empInfo.is("ROW")){ 
                                $("table input").each(function(i){
                                    $(this).val($(empInfo).children().eq(i).text());
                                });
                            }else {
                                alert("검색 대상이 존재하지 않습니다.")
                            }
                        },
                        error: function(request, error){ //통신에 실패했을 때 
                            alert("code : "+ request.status +"\n" +"message : "+request.responseText +"\n"+ "error:" +error )
                        }
                    })

                }else{
                    alert("사원 번호를 다시 확인해 주세요 !! ")
                }
            })
        })

        //ajax = Asynchronous Javascript And Xml  : 서버 처리를 기다리지 않고, 비동기적 요청 
    </script>
</head>
<body>
    <h1>데이터 가져오기(비동기)</h1>

    <fieldset>
        <legend>사원정보 조회</legend>
        <input type="text" name="empid">
        <input type="button" id="emp_search" value="조회">
    </fieldset>




*/