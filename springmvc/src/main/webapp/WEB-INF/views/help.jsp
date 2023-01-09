<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model And View page</title>
</head>
<body>
<h1>Hello my Name is Premkumar</h1>
<h2>this is help page</h2>



<%
String n= (String)request.getAttribute("name");
 
Integer no=(Integer)request.getAttribute("roll number");

%>


<h1> Name Is  <%=   n %></h1>

<h1>Roll Number Is  <%=no %></h1>

</body>
</html>