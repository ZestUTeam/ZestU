$(function() {
	alert("aaa");
	$.ajax({
		url : 'user_find.action',
		method : 'post',
		data : {
			id : 1
		},
		success : function(datas) {
			console.log(datas);
		}
	})
})