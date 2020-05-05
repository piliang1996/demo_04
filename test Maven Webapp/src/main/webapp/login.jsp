<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登录</title>
<style type="text/css">
div{margin-bottom: 5px;}
.input{
  width: 180px;
  height: 20px;
}
</style>
</head>
<body>
	<div style="text-align: center;">
		<h1>登录</h1>
		<div style="border:1px solid #ccc;padding:10px">
		<form action="student/login" method="post">
			<div>用戶名： <input name="stuName" value="" class="input"> </div> 			
			<div>密　码：<input type="password" name="stuPassword" value="" class="input"> </div>
			<div><input type="submit" value="保存" name="btnSave">
				 <input type="reset"  value="重置" name="btnReset"></div>
			<br>
			保存一个周，保存一个月	
		</form>
		
		<!-- 表单验证 注册（采用密码加密）-->
		<script type="text/javascript">
		
		
		</script>
		</div>
	</div>
</body>
</html>