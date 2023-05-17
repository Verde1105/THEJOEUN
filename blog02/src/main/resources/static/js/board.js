let index = {
	init:function(){
		$("#btn-save").on("click",()=>{
			this.save();
		});
		$("#btn-delete").on("click",()=>{
			this.deleteById();
		});
		$("#btn-update").on("click",()=>{
			this.update();
		});
	},
	
	save: function(){
		alert('user의 save함수 호출됨');
		let data = {
			title: $("#title").val(),
			content: $("#content").val(),
		}
		
		$.ajax({//글쓰기 수행 요청
			type:"post",
			url:"/api/board",
			data:JSON.stringify(data),//http 바디 데이터
			contentType:"application/json; charset=utf-8",//바디데이터가 어떤 타입인지(mime)
			dataTtpe:"json"//요청을 서버로 해서 응답이 왔을땐,기본적으로 모든것이 문자열(생긴게 json이라면)
		}).done(function(resp){
			alert("글쓰기가 완료되었습니다.");
			location.href = "/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});//에이젝스 통신을 이용하여 3개의 파라미터를 제이슨으로 변경하여 인서트 요청
	},

	deleteById: function(){
		var id = $("#id").text();
		$.ajax({
			type:"DELETE",
			url:"/api/board"+id,
			dataTtpe:"json"
		}).done(function(resp){
			alert("삭제가 완료되었습니다.");
			location.href = "/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});//에이젝스 통신을 이용하여 3개의 파라미터를 제이슨으로 변경하여 인서트 요청
	},

	update: function(){
		let id = $("#id").val();
		
		let data = {
			title: $("#title").val(),
			content: $("#content").val(),
		}
		
		$.ajax({//글쓰기 수행 요청
			type:"put",
			url:"/api/board/"+id,
			data:JSON.stringify(data),//http 바디 데이터
			contentType:"application/json; charset=utf-8",//바디데이터가 어떤 타입인지(mime)
			dataTtpe:"json"//요청을 서버로 해서 응답이 왔을땐,기본적으로 모든것이 문자열(생긴게 json이라면)
		}).done(function(resp){
			alert("글수정이 완료되었습니다.");
			location.href = "/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});//에이젝스 통신을 이용하여 3개의 파라미터를 제이슨으로 변경하여 인서트 요청
	}
}
index.init();

/**
 * 
 */