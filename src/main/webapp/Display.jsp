<%@page import="com.psl.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 TRANSITIONAL//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%Employee emp; %>
<%  emp= (Employee)request.getAttribute("emp");%><br>

<table style="padding:20px">
<tr><th>Employee</th></tr>
<tr>
<td>ID</td>
<td><%=emp.getId()%></td>

</tr>
<tr>
<td>FirstName</td>
<td><%=emp.getFirstName()%></td>

</tr>
<tr>
<td>LastName</td>
<td><%=emp.getLastName()%></td>

</tr>
<tr>
<td>Salary</td>
<td><%=emp.getSal() %></td>

</tr>
<tr>
<td>Email</td>
<td><%=emp.getEmail() %></td>

</tr>
</table>
</body>
</html>