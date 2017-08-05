<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>

</body>
<script type="text/javascript">
//请求json，输出是json
function requestJson(){

    var jsonData = {  
            "userId" : "hezhen"
    };
    $.ajax({
        type:'post',
        url:'${pageContext.request.contextPath }/userBaseInfo/read',
        contentType:'application/json;charset=utf-8',//指定为json类型
        //数据格式是json串，商品信息
        data:JSON.stringify(jsonData),
        success:function(data){//返回json结果
            alert(data.code);
        }       
    }); 
}

requestJson();
</script>
</html>