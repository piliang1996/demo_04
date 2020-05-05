<%@page import="java.util.List"%>
<%@page import="com.hm.source.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>

	<%
	Student stu=(Student)request.getAttribute("student");
	List<Student> stus=(List<Student>)session.getAttribute("stus");
	 %>
	
	<%=stu.getUsername() %>
	<br/>
	<%=stus.size()%>
</body>
</html>