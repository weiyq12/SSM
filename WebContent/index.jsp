<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
    <script src="js/jquery-3.3.1.min.js" ></script>
    <script>
        function test() {
        	   $.ajax({
        	        url: "testjson/mytest2.action",
        	        type: "POST",
        	        async: true,
        	        cache: false,
        	        timeout: 10000,
        	        data: {
        	        	  "random": 1,
        	        	  "t": "hello"
        	        },
        	        success: function(data, status) {
        	        	  alert("success data=" + data + ", status=" + status + ", str=" +JSON.stringify(data));
        	        	  alert("data.id=" + data.id + ", data.name=" + data.name);
        	        },
        	        error: function(xhr, error, exception) {
        	        	  alert("error xhr=" + xhr + ", error=" + error + ", exception=" + exception);
        	        }
        	   });
           alert("发送完成");
        }
    </script>
</head>
<body>
    <h1>Welcome To Struts 2!</h1>
    <form action="mytest3_aaMethod.action" method="POST">
        <input type="text" name="mytest" value="t2222" />
        <input type="submit" />
    </form>
    <hr>
    <input type="button" value="JSON请求测试" onclick="test();">
</body>
</html>