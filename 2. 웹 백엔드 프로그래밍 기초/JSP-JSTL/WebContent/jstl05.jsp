<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:import url="http://localhost:8080/JSP-JSTL/jstlValue.jsp" var="urlValue" scope="request"></c:import>
<c:import url="https://www.google.co.kr" var="googleValue" scope="request"></c:import>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>읽어들인 값 : ${urlValue}</h1>
<br>
${googleValue }
</body>
</html>