<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/jquery.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>
<button id="btnExcelImport" >导入EXCEL</button>  
</body>
<script type="text/javascript">
	//请求json，输出是json
	function requestJson() {

		/* var jsonData = {  
		        "userId" : "hezhen"
		}; */

		var jsonData = {
			"activityObj" : {
				"title" : "title1",
				"content" : "content1",
				"userId" : "hezhen"
			},
			"activityImgs" : [{
				"imgSeq" : "imgSeq1",
				"imgContent" : "imgContent1"
			}],
			"tags" : [ {
				"tagId" : "tagId1",
				"tagValue" : "tagValue1"
			}, {
				"tagId" : "tagId2",
				"tagValue" : "tagValue2"
			} ]
		};
		$.ajax({
			type : 'post',
			//url : '${pageContext.request.contextPath }/userBaseInfo/read',
			url : '${pageContext.request.contextPath }/tagBaseInfo/readTag',
			contentType : 'application/json;charset=utf-8',//指定为json类型
			//数据格式是json串，商品信息
			data : JSON.stringify(jsonData),
			success : function(data) {//返回json结果
				alert(data);
				alert(data.returnObj.code);
			}
		});
	}

	requestJson();
	
</script>
</html>