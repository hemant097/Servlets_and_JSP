<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=#53AABF>
<h1>Hello my name is hemant Sharma</h1>
<% 
int n1 = Integer.parseInt(request.getParameter("num1"));
int n2 = Integer.parseInt(request.getParameter("num2"));

int ans = n1+n2;
out.println("sum is "+ans);
out.println("<br/>square is "+ans*ans);
out.println("<br/>cube is "+ans*ans*ans);
%>

</body>
</html>