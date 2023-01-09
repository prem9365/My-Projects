<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Application</title>
</head>
<body>

<h1>hello Eveyone This my First trail to learn Spring MVC</h1>

<%
String name=(String)request.getAttribute("name");

Integer id=(Integer)request.getAttribute("id");
//List<String>list= (List<String>)request.getAttribute("frd");

%>
<h1>Name is <%= name %></h1>

<h2>Id  is<%= id %></h2>



//for(String s: list){
	//out.println(s);





</body>
</html>