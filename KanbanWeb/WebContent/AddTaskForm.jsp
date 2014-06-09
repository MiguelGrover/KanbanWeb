<%@ page language="java" contentType="text/html"%>
    <%@ page import="java.util.Date" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kanban Web</title>
</head>
<body>
<%-- Este es un comentario desde JSP --%>
<!-- Este es un comentario desde HTML -->

<% 
	//String[] values = {"test", "test2", "test3"};
	//for(String value : values)
		//out.println("<div>"+value+"</div>");
	//String test = request.getParameter("test");
	//out.println(test);
	//out.println("Hola mundo "+ new Date().toString());
%>

<%= "Hola mundo "+ new Date().toString() %>

<%
String[] values = {"test", "test2", "test3"};
for(String value : values){
%>

 <div> <%=value%> </div>
<%
}
%>
<%@ include file = "Copyright.jsp" %>

<form method="POST">
					
					<table>
					
					<tr>
					<td>Title:</td>
					<td>
					<input type=\"text\"name="title">
					</td>
					</tr>
					
					<tr>
					<td>Description:</td>
					<td>
					<input type="text" name="description">
					</td>
					</tr>
					
					<tr>
					<td>State:</td>
					<td>
					<select name="state">
					<option value="BACKLOG">Backlog</option>
					<option value="TO_DO">To do</option>
					<option value="IN_PROGRESS">In progress</option>
					<option value="DONE">Done</option>
					</select>
					</td>
					</tr>
					
					<tr>
					<td>Category:</td>
					<td>
					<input type="text"name="category"/>
					</td>
					</tr>
					
					<tr>
					<td>Priority:</td>
					<td>
					<input type="text" name="priority"/>
					</td>
					</tr>
					
					<tr>
					<td>Owner:</td>
					<td>
					<input type="text" name="owner"/>
					</td>
					</tr>
					
					<tr>
					<td>Due date:</td>
					<td>
					<input type="text" name="due_date" value="<%= new Date().toString() %>">
					</td>
					</tr>
										
					<tr>
					<td>Add Task:</td>
					<td>
					<input type="submit"value="Add Task"/>
					</td>
					</tr>
					
					</table>
					</form>
</body>
</html>