$(function(){
	$.post("Type_getTypes", function(data){
		for(var i = 0; i < data.length; i++){
			$("#typeId").append("<option value='"+ data[i].typeid +"'>" + data[i].typename+ "</option>");
		}
	}, 'json');
});